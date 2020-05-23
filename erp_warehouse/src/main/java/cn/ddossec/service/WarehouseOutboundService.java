package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseOutbound;

/**
 * (WarehouseOutbound)表服务接口
 *
 * @author 谷辉
 * @since 2020-04-22 14:34:41
 */
public interface WarehouseOutboundService {

    /**
     * 修改库存标志
     */
    void updateStoreTag(Integer parent_id,String store_tag,String attemper);

    /**
     *出库申请单审核
     *
     * @param warehouseOutbound
     * @return
     */
    Response warehouseOutboundDetailedAudit(WarehouseOutbound warehouseOutbound);
    
    /**
     * 查询可调度的数据进行调度
     * @param store_tag 库存标志 1已申请 2已调度
     * @param page
     * @param limit
     * @return
     */
    DataGridView queryWarehouseOutbound(String store_tag,Integer page,Integer limit);

    /**
     * 添加出库申请单
     *
     * @param warehouseOutbound
     * @return
     */
    Response addWarehouseOutbound(WarehouseOutbound warehouseOutbound);

}