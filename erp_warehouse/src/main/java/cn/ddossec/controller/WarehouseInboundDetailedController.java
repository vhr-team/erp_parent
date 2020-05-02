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
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WarehouseInboundDetailed selectOne(Integer id) {
        return this.warehouseInboundDetailedServiceImpl.queryById(id);
    }

    /**
     * 查询待入库调度数据
     *
     * @param checkTag 入库审核状态
     * @param page 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @ApiOperation(value = "查询待调度入库数据")
    @RequestMapping("queryInboundLimit")
    public DataGridView queryInboundLimit(@Param("checkTag") String checkTag,
                                          @Param("page") int page,
                                          @Param("limit") int limit){
        return warehouseInboundServiceImpl.queryInboundLimit(checkTag, page, limit);
    }

}