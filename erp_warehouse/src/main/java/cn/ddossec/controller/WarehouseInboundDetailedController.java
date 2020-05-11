package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.domain.WarehouseInboundDetailed;
import cn.ddossec.service.WarehouseInboundDetailedService;
import cn.ddossec.service.WarehouseInboundService;
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