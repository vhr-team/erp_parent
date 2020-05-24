package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseOutboundDetailed;
import cn.ddossec.service.WarehouseOutboundDetailedService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * (WarehouseOutboundDetailed)表控制层
 *
 * @author 谷辉
 * @since 2020-04-22 15:33:29
 */
@RestController
@RequestMapping("warehouseOutboundDetailed")
public class WarehouseOutboundDetailedController {
    /**
     * 服务对象
     */
    @Autowired
    private WarehouseOutboundDetailedService warehouseOutboundDetailedServiceImpl;


    /**
     * 查询出库详细单
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "查询出库详细单")
    @RequestMapping("queryWarehouseOutboundDetailed")
    public DataGridView queryWarehouseOutboundDetailed(Integer page, Integer limit, Integer id) {
        return warehouseOutboundDetailedServiceImpl.queryWarehouseOutboundDetailed(page, limit, id);
    }

    @GetMapping("OutboundDetailedCommit")
    public Response OutboundDetailedCommit(Integer id, Integer parent_id, String attemper, String pay_tag) {
        return this.warehouseOutboundDetailedServiceImpl.OutboundDetailedCommit(id, parent_id, attemper, pay_tag);
    }

}