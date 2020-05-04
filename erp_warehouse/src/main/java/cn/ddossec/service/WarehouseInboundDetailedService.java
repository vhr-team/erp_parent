package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseInboundDetailed;
import java.util.List;

/**
 * (WarehouseInboundDetailed)表服务接口
 *
 * @author 谷辉
 * @since 2020-04-24 17:08:29
 */
public interface WarehouseInboundDetailedService {

    /**
     * 入库调度表的调度查询
     *
     * @param id 父级序号
     * @param page
     * @param limit
     * @return
     */
    DataGridView queryInboundDetailed(Integer id, int page, int limit);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WarehouseInboundDetailed queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WarehouseInboundDetailed> queryAllByLimit(int offset, int limit);

    /**
     * 新增入库详细单
     *
     * @param warehouseInboundDetailed 实例对象
     */
    void insertWarehouseDetailed(WarehouseInboundDetailed warehouseInboundDetailed);

    /**
     * 修改数据
     *
     * @param warehouseInboundDetailed 实例对象
     * @return 实例对象
     */
    WarehouseInboundDetailed update(WarehouseInboundDetailed warehouseInboundDetailed);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}