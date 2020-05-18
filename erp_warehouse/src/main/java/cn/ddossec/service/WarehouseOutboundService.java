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
     * 查询可调度的数据进行调度
     * @param check_tag 审核标志
     * @param page
     * @param limit
     * @return
     */
    DataGridView queryWarehouseOutbound(String check_tag,Integer page,Integer limit);

    /**
     * 添加出库申请单
     *
     * @param warehouseOutbound
     * @return
     */
    Response addWarehouseOutbound(WarehouseOutbound warehouseOutbound);

}