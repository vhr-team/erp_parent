package cn.ddossec.controller;

import cn.ddossec.domain.WarehouseOutboundDetailed;
import cn.ddossec.service.WarehouseOutboundDetailedService;
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
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WarehouseOutboundDetailed selectOne(Integer id) {
        return this.warehouseOutboundDetailedServiceImpl.queryById(id);
    }

}