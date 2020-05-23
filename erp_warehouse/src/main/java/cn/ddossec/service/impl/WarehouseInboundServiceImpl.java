package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.domain.WarehouseInboundDetailed;
import cn.ddossec.domain.WarehouseStock;
import cn.ddossec.mapper.WarehouseInboundMapper;
import cn.ddossec.service.WarehouseInboundDetailedService;
import cn.ddossec.service.WarehouseInboundService;
import cn.ddossec.service.WarehouseStockService;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.ObjectId;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * (WarehouseInbound)表服务实现类
 *
 * @author 谷辉
 * @since 2020-04-24 17:06:40
 */
@SuppressWarnings("all")
@Service("warehouseInboundServiceImpl")
public class WarehouseInboundServiceImpl implements WarehouseInboundService {
    @Autowired
    private WarehouseInboundMapper warehouseInboundMapper;

    @Autowired
    private WarehouseInboundDetailedService warehouseInboundDetailedService;

    @Autowired
    private WarehouseStockService warehouseStockService;



    /**
     * 入库登记审核
     *
     * @param id
     * @param product_id
     * @param gathered_amount
     * @return
     */
    @Override
    public Response WarehouseInboundDetailedAudit(Integer id,Integer gathered_amount_sum,String[] product_id, Integer[] gathered_amount) {
        try {
            WarehouseInbound warehouseInbound = new WarehouseInbound();
            warehouseInbound.setId(id);
            warehouseInbound.setGatheredAmountSum(gathered_amount_sum);
            warehouseInbound.setCheckTag("1");
            warehouseInboundMapper.updateById(warehouseInbound);
            for (int i = 0; i < product_id.length ; i++) {
                warehouseStockService.queryId(product_id[i],gathered_amount[i]);
            }
            return new Response(true,"审核成功!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"审核失败,请重试!");
        }
    }


    /**
     * 入库登记提交（序号，详细单编号，确认入库件数）
     *
     * @param warehouseInbound
     * @return
     */
    @Override
    @Transactional
    public Response insertInboundAmount(WarehouseInbound warehouseInbound) {
        try {
            warehouseInbound.setCheckTag("0");
            warehouseInboundMapper.updateById(warehouseInbound);
            WarehouseInboundDetailed detailed = null;
            for (int i = 0; i < warehouseInbound.getGatheredAmount().length ; i++) {
                detailed = new WarehouseInboundDetailed();
                detailed.setId(warehouseInbound.getIds()[i]);
                detailed.setGatheredAmount(warehouseInbound.getGatheredAmount()[i]);
                warehouseInboundDetailedService.updateWarehouseInboundDetailedAmount(detailed);
            }
            return new Response(true,"登记成功!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"登记失败,请稍后再试!");
        }
    }


    /**
     * 查询可调度入库数据
     *
     * @param store_tag 库存标志
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    //@Cacheable(cacheNames = "cn.ddossec.service.impl.WarehouseInboundServiceImpl",key = "#checkTag")
    public DataGridView queryInboundLimit(String storeTag, String checkTag, int page, int limit){
        QueryWrapper<WarehouseInbound> queryWrapper = new QueryWrapper<>();
        Map<String,Object> map = new HashMap<>();
        map.put("store_tag",storeTag);
        map.put("check_tag",checkTag);
        queryWrapper.allEq(map).select("id","inbound_id","reason","register","register_time","amount_sum","cost_price_sum","gathered_amount_sum");
        Page<WarehouseInbound> pages = new Page<>(page,limit);
        IPage iPage = warehouseInboundMapper.selectPage(pages,queryWrapper);
        /*queryWrapper.eq("store_tag",storeTag).select("id","inbound_id","reason","register","register_time","amount_sum","cost_price_sum","gathered_amount_sum");
        List<WarehouseInbound> list = warehouseInboundMapper.selectList(queryWrapper);
        ArrayList<Object> arrayList = new ArrayList<>();
        for (WarehouseInbound inbound : list) {
            if (inbound.getAmountSum()>inbound.getGatheredAmountSum()){
                arrayList.add(inbound);
            }
        }*/
        return new DataGridView(iPage.getTotal(),iPage.getRecords());
    }

    /**
     * 修改入库单的库存标志
     */
    @Override
    public void updateStoreTag(Integer parent_id, String store_tag, String attemper) {
        WarehouseInbound warehouseInbound = new WarehouseInbound();
        warehouseInbound.setId(parent_id); //序号
        warehouseInbound.setStoreTag(store_tag);//库存标志
        warehouseInbound.setAttemper(attemper); //调度人
        warehouseInbound.setAttemperTime(DateUtil.date());//调度时间
        warehouseInboundMapper.updateById(warehouseInbound);
    }

    /**
     * 入库申请登记.
     *
     * @param warehouseInbound 实例对象
     * @return 实例对象
     */
    @Transactional
    @Override
    //@CachePut(cacheNames = "cn.ddossec.service.impl.WarehouseInboundServiceImpl",key = "#warehouseInbound.checkTag")
    public void insertWarehousing(WarehouseInbound warehouseInbound) {
        warehouseInbound.setInboundId(ObjectId.next()); //生成随机入库单编号
        warehouseInbound.setRegisterTime(DateUtil.date()); //登记时间
        this.warehouseInboundMapper.insert(warehouseInbound);//插入入库单

        WarehouseInboundDetailed detailed = null;
        for (int i = 0; i < warehouseInbound.getProductId().length; i++) {
            detailed = new WarehouseInboundDetailed();
            detailed.setParentId(warehouseInbound.getId());//设置父级序号
            detailed.setProductName(warehouseInbound.getProductName()[i]);
            detailed.setProductId(warehouseInbound.getProductId()[i]);
            detailed.setProductDescribe(warehouseInbound.getProductDescribe()[i]);
            detailed.setAmount(warehouseInbound.getAmount()[i]);
            detailed.setAmountUnit(warehouseInbound.getAmountUnit()[i]);
            detailed.setCostPrice(warehouseInbound.getCostPrice()[i]);
            detailed.setSubtotal(warehouseInbound.getSubtotal()[i]);
            this.warehouseInboundDetailedService.insertWarehouseDetailed(detailed);//循环插入到入库详细单
        }
    }

    /**
     * 入库申请审核
     *
     * @param check_tag 入库标志 0待审核 1复核通过 2复核不通过
     * @param check_time 复核时间
     * @param checker 复核人
     * @param inbound_id 入库单编号 (随机生成)
     * @return
     */
    /*@Override
    @CachePut(cacheNames = "cn.ddossec.service.impl.WarehouseInboundServiceImpl",key = "#check_tag")
    public int updateWarehousing(String check_tag, Date check_time, String checker, String inbound_id) {
        QueryWrapper<WarehouseInbound> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(inbound_id != null,"inbound_id",inbound_id).select("id");
        WarehouseInbound warehouseInbound = warehouseInboundMapper.selectOne(queryWrapper);
        warehouseInbound.setCheckTag(check_tag);
        warehouseInbound.setCheckTime(check_time);
        warehouseInbound.setChecker(checker);
        return warehouseInboundMapper.updateById(warehouseInbound);
    }*/

}