package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.domain.WarehouseInboundDetailed;
import cn.ddossec.service.WarehouseInboundDetailedService;
import cn.ddossec.service.WarehouseInboundService;
import cn.ddossec.service.WarehouseStockService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * (WarehouseInboundDetailed)表控制层
 *
 * @author 谷辉
 * @since 2020-04-24 17:08:29
 */
@RestController
@RequestMapping("warehouseInboundDetailed")
public class WarehouseInboundDetailedController {
    /**
     * 服务对象
     */
    @Autowired
    private WarehouseInboundDetailedService warehouseInboundDetailedServiceImpl;

    @Autowired
    private WarehouseInboundService warehouseInboundServiceImpl;

    @Autowired
    private WarehouseStockService warehouseStockServiceImpl;


    /**
     * 入库调度提交
     *
     * @param id 入库详细单序号
     * @param parent_id 父级序号
     * @param gatherTag 库存标志 1为已登记 2为已调度
     * @param attemper 调度人
     * @return
     */
    @ApiOperation(value = "入库调度提交")
    @RequestMapping("InboundDetailedCommit")
    public Response InboundDetailedCommit(Integer id, Integer parent_id, String gatherTag, String attemper){
        return warehouseInboundDetailedServiceImpl.InboundDetailedCommit(id, parent_id, gatherTag, attemper);
    }


    /**
     * 通过产品编号获取安全库存的当前存储量和最大存储量，求出剩余存储量
     *
     * @param product_id 库存编号
     * @param page
     * @param limit
     * @return
     */
    @ApiOperation("通过产品编号获取安全库存的当前可存放数量")
    @RequestMapping("queryInventory")
    public DataGridView queryInventory(String product_id, Integer page, Integer limit) {
        return warehouseStockServiceImpl.queryInventory(product_id, page, limit);
    }

    /**
     * 入库调度表的调度查询
     *
     * @param id 父级序号
     * @param page
     * @param limit
     * @return
     */
    @ApiOperation(value = "入库调度表的调度查询")
    @RequestMapping("queryInboundDetailed")
    public DataGridView queryInboundDetailed(@RequestParam("id") Integer id,
                                             @RequestParam("page") int page,
                                             @RequestParam("limit") int limit) {

       return warehouseInboundDetailedServiceImpl.queryInboundDetailed(id, page, limit);
    }


}