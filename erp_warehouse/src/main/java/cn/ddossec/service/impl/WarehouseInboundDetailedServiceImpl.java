package cn.ddossec.service.impl;

import cn.ddossec.domain.WarehouseInboundDetailed;
import cn.ddossec.mapper.WarehouseInboundDetailedMapper;
import cn.ddossec.service.WarehouseInboundDetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (WarehouseInboundDetailed)表服务实现类
 *
 * @author 谷辉
 * @since 2020-04-24 17:08:29
 */
@SuppressWarnings("all")
@Service("warehouseInboundDetailedServiceImpl")
public class WarehouseInboundDetailedServiceImpl implements WarehouseInboundDetailedService {
    @Autowired
    private WarehouseInboundDetailedMapper warehouseInboundDetailedMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WarehouseInboundDetailed queryById(Integer id) {
        return this.warehouseInboundDetailedMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WarehouseInboundDetailed> queryAllByLimit(int offset, int limit) {
        return this.warehouseInboundDetailedMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param warehouseInboundDetailed 实例对象
     * @return 实例对象
     */
    @Override
    public WarehouseInboundDetailed insert(WarehouseInboundDetailed warehouseInboundDetailed) {
        this.warehouseInboundDetailedMapper.insert(warehouseInboundDetailed);
        return warehouseInboundDetailed;
    }

    /**
     * 修改数据
     *
     * @param warehouseInboundDetailed 实例对象
     * @return 实例对象
     */
    @Override
    public WarehouseInboundDetailed update(WarehouseInboundDetailed warehouseInboundDetailed) {
        this.warehouseInboundDetailedMapper.update(warehouseInboundDetailed);
        return this.queryById(warehouseInboundDetailed.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.warehouseInboundDetailedMapper.deleteById(id) > 0;
    }
}