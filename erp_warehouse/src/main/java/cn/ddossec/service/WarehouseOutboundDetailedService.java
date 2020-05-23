package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseOutbound;
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
     * 出库调度提交
     *
     * @param id 详细表 序号
     * @param parent_id 详细表 父级序号
     * @param attemper 调度人
     * @param pay_tag 详细表 出库标志
     * @return
     */
    Response OutboundDetailedCommit(Integer id,Integer parent_id,String attemper,String pay_tag);


    /**
     * 修改出库单库存标志
     *
     * @param parent_id 父级序号
     * @param attemper 调度人
     */
    void updateOutboundStoreTag(Integer parent_id, String attemper);


    /**
     * 修改出库标志
     *
     * @param detailed
     */
    void updateDetailedPayTag(WarehouseOutboundDetailed detailed);

    /**
     *查询出库详细单
     *
     * @param id
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