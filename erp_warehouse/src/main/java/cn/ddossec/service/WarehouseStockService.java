package cn.ddossec.service;

import cn.ddossec.domain.WarehouseStock;
import java.util.List;

/**
 * (WarehouseStock)表服务接口
 *
 * @author 谷辉
 * @since 2020-04-19 15:05:40
 */
public interface WarehouseStockService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WarehouseStock queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WarehouseStock> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param warehouseStock 实例对象
     * @return 实例对象
     */
    WarehouseStock insert(WarehouseStock warehouseStock);

    /**
     * 修改数据
     *
     * @param warehouseStock 实例对象
     * @return 实例对象
     */
    WarehouseStock update(WarehouseStock warehouseStock);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}