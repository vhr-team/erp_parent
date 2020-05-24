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
     *出库登记复核
     *
     * @param id 出库单 序号
     * @param paid_amount_sum 出库单 确认出库总件数
     * @param product_id 详细表 产品编号
     * @param paid_amount 详细表 确认出库件数
     * @return
     */
    Response WarehouseOutboundAudit(Integer id,Integer paid_amount_sum,String[] product_id,Integer[] paid_amount);

    /**
     * 出库登记提交
     *
     * @param warehouseOutbound
     * @return
     */
    Response OutboundCommit(WarehouseOutbound warehouseOutbound);

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
     * @param check_tag 出库管理 0待审核 1已审核
     * @param page
     * @param limit
     * @return
     */
    DataGridView queryWarehouseOutbound(String store_tag,String check_tag,Integer page,Integer limit);

    /**
     * 添加出库申请单
     *
     * @param warehouseOutbound
     * @return
     */
    Response addWarehouseOutbound(WarehouseOutbound warehouseOutbound);

}