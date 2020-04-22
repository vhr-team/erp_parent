package cn.ddossec.service.impl;

import cn.ddossec.domain.WarehouseStock;
import cn.ddossec.mapper.WarehouseStockMapper;
import cn.ddossec.service.WarehouseStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (WarehouseStock)表服务实现类
 *
 * @author 谷辉
 * @since 2020-04-19 15:05:40
 */
@SuppressWarnings("all")
@Service("warehouseStockServiceImpl")
public class WarehouseStockServiceImpl implements WarehouseStockService {
    @Autowired
    private WarehouseStockMapper warehouseStockMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WarehouseStock queryById(Integer id) {
        return this.warehouseStockMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param stockId 根据库存编号模糊查询
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WarehouseStock> queryAllByLimit(String stockId, int offset, int limit) {
        return this.warehouseStockMapper.queryAllByLimit(stockId, offset, limit);
    }

    /**
     * 新增数据
     *
     * @param warehouseStock 实例对象
     * @return 实例对象
     */
    @Override
    public WarehouseStock insert(WarehouseStock warehouseStock) {
        this.warehouseStockMapper.insert(warehouseStock);
        return warehouseStock;
    }

    /**
     * 修改数据
     *
     * @param warehouseStock 实例对象
     * @return 实例对象
     */
    @Override
    public WarehouseStock update(WarehouseStock warehouseStock) {
        this.warehouseStockMapper.update(warehouseStock);
        return this.queryById(warehouseStock.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.warehouseStockMapper.deleteById(id) > 0;
    }
}