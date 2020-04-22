package cn.ddossec.service.impl;

import cn.ddossec.domain.WarehouseOutboundDetailed;
import cn.ddossec.mapper.WarehouseOutboundDetailedMapper;
import cn.ddossec.service.WarehouseOutboundDetailedService;
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
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WarehouseOutboundDetailed queryById(Integer id) {
        return this.warehouseOutboundDetailedMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WarehouseOutboundDetailed> queryAllByLimit(int offset, int limit) {
        return this.warehouseOutboundDetailedMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param warehouseOutboundDetailed 实例对象
     * @return 实例对象
     */
    @Override
    public WarehouseOutboundDetailed insert(WarehouseOutboundDetailed warehouseOutboundDetailed) {
        this.warehouseOutboundDetailedMapper.insert(warehouseOutboundDetailed);
        return warehouseOutboundDetailed;
    }

    /**
     * 修改数据
     *
     * @param warehouseOutboundDetailed 实例对象
     * @return 实例对象
     */
    @Override
    public WarehouseOutboundDetailed update(WarehouseOutboundDetailed warehouseOutboundDetailed) {
        this.warehouseOutboundDetailedMapper.update(warehouseOutboundDetailed);
        return this.queryById(warehouseOutboundDetailed.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.warehouseOutboundDetailedMapper.deleteById(id) > 0;
    }
}