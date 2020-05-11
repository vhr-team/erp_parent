package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseOutboundDetailed;
import cn.ddossec.mapper.WarehouseOutboundDetailedMapper;
import cn.ddossec.service.WarehouseOutboundDetailedService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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


    @Override
    public DataGridView queryWarehouseOutboundDetailed(Integer page,Integer limit,Integer id) {
        QueryWrapper<WarehouseOutboundDetailed> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id","product_name","product_id","amount").eq("parent_id",id);

        return null;
    }
}