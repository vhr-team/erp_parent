package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
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
     * 入库调度提交
     *
     * @param id 入库详细单序号
     * @param parent_id 父级序号
     * @param gatherTag 库存标志 1为已登记 2为已调度
     * @param attemper 调度人
     * @return
     */
    Response InboundDetailedCommit(Integer id, Integer parent_id, String gatherTag, String attemper);

    /**
     *通过父级序号查询所有入库标志
     *
     * @param parent_id 父级序号
     * @param attemper 调度人
     */
    void updatestoreTag(Integer parent_id, String attemper);

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
    //void insertWarehouseDetailed(WarehouseInboundDetailed warehouseInboundDetailed);

}