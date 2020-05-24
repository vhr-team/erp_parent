package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseOutbound;
import cn.ddossec.service.WarehouseOutboundService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * (WarehouseOutbound)表控制层
 *
 * @author 谷辉
 * @since 2020-04-22 14:34:41
 */
@RestController
@RequestMapping("warehouseOutbound")
public class WarehouseOutboundController {
    /**
     * 服务对象
     */
    @Autowired
    private WarehouseOutboundService warehouseOutboundServiceImpl;


    /**
     * 出库登记提交
     *
     * @param warehouseOutbound
     * @return
     */
    @ApiOperation(value = "出库登记提交")
    @RequestMapping("OutboundCommit")
    public Response OutboundCommit(@RequestBody WarehouseOutbound warehouseOutbound) {
        return warehouseOutboundServiceImpl.OutboundCommit(warehouseOutbound);
    }


    /**
     * 出库申请单审核
     *
     * @param warehouseOutbound
     * @return
     */
    @ApiOperation(value = "出库申请单审核")
    @RequestMapping("warehouseOutboundDetailedAudit")
    public Response warehouseOutboundDetailedAudit(@RequestBody WarehouseOutbound warehouseOutbound) {
        return warehouseOutboundServiceImpl.warehouseOutboundDetailedAudit(warehouseOutbound);
    }


    /**
     * 查询可调度的数据进行调度
     * @param store_tag 库存标志 1已申请 2已调度
     * @param check_tag 出库管理 0待审核 1已审核
     * @param page
     * @param limit
     * @return
     */
    @ApiOperation(value = "查询可调度的数据进行调度")
    @RequestMapping("queryWarehouseOutbound")
    public DataGridView queryWarehouseOutbound(@RequestParam(value = "store_tag",required = false) String store_tag,
                                               @RequestParam(value = "check_tag",required = false)String check_tag,
                                               @RequestParam("page") Integer page,
                                               @RequestParam("limit") Integer limit){
        return warehouseOutboundServiceImpl.queryWarehouseOutbound(store_tag, check_tag, page, limit);
    }


    /**
     * 添加出库申请单
     *
     * @param warehouseOutbound
     * @return
     */
    @ApiOperation(value = "添加出库申请单")
    @RequestMapping("addWarehouseOutbound")
    public Response addWarehouseOutbound(@RequestBody WarehouseOutbound warehouseOutbound){
        return warehouseOutboundServiceImpl.addWarehouseOutbound(warehouseOutbound);
    }

}