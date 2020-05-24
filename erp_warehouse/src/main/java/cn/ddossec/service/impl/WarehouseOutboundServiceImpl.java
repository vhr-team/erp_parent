package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseOutbound;
import cn.ddossec.domain.WarehouseOutboundDetailed;
import cn.ddossec.mapper.WarehouseOutboundDetailedMapper;
import cn.ddossec.mapper.WarehouseOutboundMapper;
import cn.ddossec.service.WarehouseOutboundDetailedService;
import cn.ddossec.service.WarehouseOutboundService;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.ObjectId;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (WarehouseOutbound)表服务实现类
 *
 * @author 谷辉
 * @since 2020-04-22 14:34:41
 */
@SuppressWarnings("all")
@Service("warehouseOutboundServiceImpl")
public class WarehouseOutboundServiceImpl implements WarehouseOutboundService {
    @Autowired
    private WarehouseOutboundMapper warehouseOutboundMapper;

    @Autowired
    private WarehouseOutboundDetailedService warehouseOutboundDetailedServiceImpl;


    /**
     *修改库存标志
     */
    @Override
    public void updateStoreTag(Integer parent_id,String store_tag,String attemper) {
        WarehouseOutbound warehouseOutbound = new WarehouseOutbound();
        warehouseOutbound.setId(parent_id); //序号
        warehouseOutbound.setStoreTag(store_tag); //库存标志
        warehouseOutbound.setAttemper(attemper); //调度人
        warehouseOutbound.setAttemperTime(DateUtil.date()); //调度时间
        warehouseOutboundMapper.updateById(warehouseOutbound);
    }

    /**
     * 出库申请单审核
     *
     * @param warehouseOutbound
     * @return
     */
    @Override
    @Transactional
    public Response warehouseOutboundDetailedAudit(WarehouseOutbound warehouseOutbound) {
        try {
            warehouseOutbound.setCheckTime(DateUtil.date());
            warehouseOutboundMapper.insert(warehouseOutbound);
            WarehouseOutboundDetailed detailed = null;
            for (int i = 0; i < warehouseOutbound.getIds().length; i++) {
                detailed = new WarehouseOutboundDetailed();
                detailed.setId(warehouseOutbound.getIds()[i]);
                if("1".equals(warehouseOutbound.getStoreTag())){
                    detailed.setPayTag("1");
                }
                warehouseOutboundDetailedServiceImpl.updateDetailedPayTag(detailed);
            }
            return new Response(true,"审核成功!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"审核失败,请重试!");
        }
    }

    /**
     * 查询可调度的数据进行调度
     * @param store_tag 库存标志 1已申请 2已调度
     * @param page
     * @param limit
     * @return
     */
    @Override
    public DataGridView queryWarehouseOutbound(String store_tag, Integer page, Integer limit) {
        QueryWrapper<WarehouseOutbound> queryWrapper = new QueryWrapper<>();
        Map<String,Object> map = new HashMap<>();
        map.put("store_tag",store_tag);
        //查询字段  序号，出库单编号，出库人，出库理由，登记人，登记时间，总件数，总金额(元)，备注
        queryWrapper.allEq(map).select("id","outbound_id","storer","reason","register","register_time","amount_sum","cost_price_sum","pemark");
        Page<WarehouseOutbound> pages = new Page(page,limit);
        IPage iPage = warehouseOutboundMapper.selectPage(pages,queryWrapper);
        //  总共多少页   查询出来的所有数据
        return new DataGridView(iPage.getTotal(),iPage.getRecords());
    }


    /**
     * 添加出库申请单
     *
     * @param warehouseOutbound
     * @return
     */
    @Override
    @Transactional //开启事务
    public Response addWarehouseOutbound(WarehouseOutbound warehouseOutbound) {
        try {
            warehouseOutbound.setOutboundId(ObjectId.next());//随机生成出库单编号
            warehouseOutbound.setRegisterTime(DateUtil.date());//登记时间
            warehouseOutboundMapper.insert(warehouseOutbound); //插入出库单

            WarehouseOutboundDetailed detailed = null;
            for (int i = 0; i < warehouseOutbound.getProductId().length; i++) {
                detailed = new WarehouseOutboundDetailed();
                detailed.setParentId(warehouseOutbound.getId());//设置父级序号
                detailed.setProductName(warehouseOutbound.getProductName()[i]);
                detailed.setProductId(warehouseOutbound.getProductId()[i]);
                detailed.setAmount(warehouseOutbound.getAmount()[i]);
                detailed.setAmountUnit(warehouseOutbound.getAmountUnit()[i]);
                detailed.setCostPrice(warehouseOutbound.getCostPrice()[i]);
                detailed.setSubtotal(warehouseOutbound.getSubtotal()[i]);
                detailed.setProductDescribe(warehouseOutbound.getProductDescribe()[i]);
                warehouseOutboundDetailedServiceImpl.addWarehouseOutboundDetailed(detailed);
            }
            return new Response(true,"添加成功,等待审核!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"添加失败,请重试!");
        }
    }


}