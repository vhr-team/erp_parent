package cn.ddossec.service;

import cn.ddossec.domain.WarehouseOutboundDetailed;
import java.util.List;

/**
 * (WarehouseOutboundDetailed)表服务接口
 *
 * @author 谷辉
 * @since 2020-04-22 15:33:29
 */
public interface WarehouseOutboundDetailedService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WarehouseOutboundDetailed queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WarehouseOutboundDetailed> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param warehouseOutboundDetailed 实例对象
     * @return 实例对象
     */
    WarehouseOutboundDetailed insert(WarehouseOutboundDetailed warehouseOutboundDetailed);

    /**
     * 修改数据
     *
     * @param warehouseOutboundDetailed 实例对象
     * @return 实例对象
     */
    WarehouseOutboundDetailed update(WarehouseOutboundDetailed warehouseOutboundDetailed);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}