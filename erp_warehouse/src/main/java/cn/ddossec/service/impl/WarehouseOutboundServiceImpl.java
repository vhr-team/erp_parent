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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
     * 查询可调度的数据进行调度
     * @param check_tag 审核标志
     * @param page
     * @param limit
     * @return
     */
    @Override
    public DataGridView queryWarehouseOutbound(String check_tag, Integer page, Integer limit) {
        QueryWrapper<WarehouseOutbound> queryWrapper = new QueryWrapper<>();
        //查询字段  序号，出库单编号，出库理由，登记时间，总件数，总金额(元)
        queryWrapper.select("id","outbound_id","reason","register_time","amount_sum","cost_price_sum").eq("check_tag",check_tag);
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
            warehouseOutbound.setOutboundId(ObjectId.next());//随机生成入库单编号
            warehouseOutbound.setRegisterTime(DateUtil.date());//登记时间
            warehouseOutboundMapper.insert(warehouseOutbound); //插入出库单

            WarehouseOutboundDetailed detailed = null;
            for (int i = 0; i < warehouseOutbound.getProductId().length(); i++) {
                detailed = new WarehouseOutboundDetailed();
                detailed.setParentId(warehouseOutbound.getId());//设置父级序号
                detailed.setProductName(warehouseOutbound.getProductName());
                detailed.setProductId(warehouseOutbound.getProductId());
                detailed.setAmount(warehouseOutbound.getAmount());
                detailed.setAmountUnit(warehouseOutbound.getAmountUnit());
                detailed.setCostPrice(warehouseOutbound.getCostPrice());
                detailed.setSubtotal(warehouseOutbound.getSubtotal());
                detailed.setProductDescribe(warehouseOutbound.getProductDescribe());
                warehouseOutboundDetailedServiceImpl.addWarehouseOutboundDetailed(detailed);
            }
            return new Response(true,"添加成功,等待审核!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"添加失败,请重试!");
        }
    }


}