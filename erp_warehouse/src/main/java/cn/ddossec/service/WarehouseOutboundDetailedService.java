package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
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
     *
     * @param id 出库详细单序号（用于条件查询出库详细单）
     * @return
     */
    DataGridView queryWarehouseOutboundDetailed(Integer page,Integer limit,Integer id);

    /**
     * 添加出库申请详细单
     *
     * @param warehouseOutboundDetailed
     */
    void addWarehouseOutboundDetailed(WarehouseOutboundDetailed warehouseOutboundDetailed);
}