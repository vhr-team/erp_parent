package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.domain.WarehouseInboundDetailed;
import cn.ddossec.mapper.WarehouseInboundMapper;
import cn.ddossec.service.WarehouseInboundDetailedService;
import cn.ddossec.service.WarehouseInboundService;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.ObjectId;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private WarehouseInboundDetailedService warehouseInboundDetailedServiceImpl;


    @Override
    public DataGridView queryInbound(String storeTag, int page, int limit) {
        QueryWrapper<WarehouseInbound> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("store_tag",storeTag).select("","","","","","");
        return null;
    }

    /**
     * 查询可调度入库数据
     *
     * @param checkTag 入库审核状态
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    @Cacheable(cacheNames = "cn.ddossec.service.impl.WarehouseInboundServiceImpl")
    public DataGridView queryInboundLimit(String checkTag, int page, int limit){
        QueryWrapper<WarehouseInbound> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("check_tag",checkTag).select("id","inbound_id","reason","register_time","amount_sum","cost_price_sum","gathered_amount_sum","register","register_time");
        List<WarehouseInbound> list = warehouseInboundMapper.selectList(queryWrapper);
        ArrayList<Object> arrayList = new ArrayList<>();
        for (WarehouseInbound inbound : list) {
            if (inbound.getAmountSum()>inbound.getGatheredAmountSum()){
                arrayList.add(inbound);
            }
        }
        return new DataGridView(Long.valueOf(arrayList.size()),arrayList);
    }

    /**
     * 入库申请登记
     *
     * @param warehouseInbound 实例对象
     * @return 实例对象
     */
    @Transactional
    @Override
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
            this.warehouseInboundDetailedServiceImpl.insertWarehouseDetailed(detailed);//循环插入到入库详细单
        }
    }

    /**
     * 入库申请审核
     *
     * @param check_tag 入库标志 0待审核 1复核不通过 2复核通过
     * @param check_time 复核时间
     * @param checker 复核人
     * @param inbound_id 入库单编号 (随机生成)
     * @return
     */
    @Override
    public int updateWarehousing(String check_tag, Date check_time, String checker, String inbound_id) {
        QueryWrapper<WarehouseInbound> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(inbound_id != null,"inbound_id",inbound_id).select("id");
        WarehouseInbound warehouseInbound = warehouseInboundMapper.selectOne(queryWrapper);
        warehouseInbound.setCheckTag(check_tag);
        warehouseInbound.setCheckTime(check_time);
        warehouseInbound.setChecker(checker);
        return warehouseInboundMapper.updateById(warehouseInbound);
    }

}