package cn.ddossec.service.impl;

import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.mapper.WarehouseInboundMapper;
import cn.ddossec.service.WarehouseInboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WarehouseInbound queryById(Integer id) {
        return this.warehouseInboundMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WarehouseInbound> queryAllByLimit(int offset, int limit) {
        return this.warehouseInboundMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param warehouseInbound 实例对象
     * @return 实例对象
     */
    @Override
    public WarehouseInbound insert(WarehouseInbound warehouseInbound) {
        this.warehouseInboundMapper.insert(warehouseInbound);
        return warehouseInbound;
    }

    /**
     * 修改数据
     *
     * @param warehouseInbound 实例对象
     * @return 实例对象
     */
    @Override
    public WarehouseInbound update(WarehouseInbound warehouseInbound) {
        this.warehouseInboundMapper.update(warehouseInbound);
        return this.queryById(warehouseInbound.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.warehouseInboundMapper.deleteById(id) > 0;
    }
}