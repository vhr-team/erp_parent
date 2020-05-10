package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseOutbound;
import java.util.List;

/**
 * (WarehouseOutbound)表服务接口
 *
 * @author 谷辉
 * @since 2020-04-22 14:34:41
 */
public interface WarehouseOutboundService {

    /**
     * 查询可调度的数据进行调度
     * @param check_tag 审核标志
     * @param page
     * @param limit
     * @return
     */
    DataGridView queryWarehouseOutbound(String check_tag,Integer page,Integer limit);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WarehouseOutbound queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @Param outbound_id 根据出库单编号模糊查询
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WarehouseOutbound> queryAllByLimit(String outbound_id, int offset, int limit);

    /**
     * 新增数据
     *
     * @param warehouseOutbound 实例对象
     * @return 实例对象
     */
    WarehouseOutbound insert(WarehouseOutbound warehouseOutbound);

    /**
     * 修改数据
     *
     * @param warehouseOutbound 实例对象
     * @return 实例对象
     */
    WarehouseOutbound update(WarehouseOutbound warehouseOutbound);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}