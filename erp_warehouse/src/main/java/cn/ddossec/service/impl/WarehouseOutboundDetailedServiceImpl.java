package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseOutbound;
import cn.ddossec.domain.WarehouseOutboundDetailed;
import cn.ddossec.mapper.WarehouseOutboundDetailedMapper;
import cn.ddossec.service.WarehouseOutboundDetailedService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (WarehouseOutboundDetailed)表服务实现类
 *
 * @author 谷辉
 * @since 2020-04-22 15:33:29
 */
@SuppressWarnings("all")
@Service("warehouseOutboundDetailedServiceImpl")
public class WarehouseOutboundDetailedServiceImpl implements WarehouseOutboundDetailedService {
    @Autowired
    private WarehouseOutboundDetailedMapper warehouseOutboundDetailedMapper;



    /**
     * 修改出库标志
     *
     * @param detailed
     */
    @Override
    public void updateDetailedPayTag(WarehouseOutboundDetailed detailed) {
        warehouseOutboundDetailedMapper.updateById(detailed);
    }

    /**
     *查询出库详细单
     *
     * @param id
     * @return
     */
    @Override
    public DataGridView queryWarehouseOutboundDetailed(Integer page,Integer limit,Integer id) {
        QueryWrapper<WarehouseOutboundDetailed> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parent_id",id).select("id","product_name","product_id","amount","amount_unit","cost_price","subtotal");
        Page<WarehouseOutboundDetailed> pages = new Page<>();
        IPage iPage = warehouseOutboundDetailedMapper.selectPage(pages,queryWrapper);
        return new DataGridView(iPage.getTotal(),iPage.getRecords());
    }


    /**
     * 添加出库申请详细单
     *
     * @param warehouseOutboundDetailed
     */
    @Override
    public void addWarehouseOutboundDetailed(WarehouseOutboundDetailed warehouseOutboundDetailed) {
        warehouseOutboundDetailedMapper.insert(warehouseOutboundDetailed);
    }
}