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
     * 插入入库详细表
     * @param warehouseInboundDetailed
     * @return
     */
    void insertWarehouseDetailed(WarehouseInboundDetailed warehouseInboundDetailed);

}