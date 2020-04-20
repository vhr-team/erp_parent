package cn.ddossec.controller;

import cn.ddossec.domain.WarehouseStock;
import cn.ddossec.service.WarehouseStockService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * (WarehouseStock)表控制层
 *
 * @author 谷辉
 * @since 2020-04-19 15:05:40
 */
@RestController
@RequestMapping("warehouseStock")
public class WarehouseStockController {
    /**
     * 服务对象
     */
    @Autowired
    private WarehouseStockService warehouseStockServiceImpl;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "通过主键查询单条数据")
    @GetMapping("selectOne")
    public WarehouseStock selectOne(Integer id) {
        return this.warehouseStockServiceImpl.queryById(id);
    }

    /**
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    @ApiOperation(value = "分页查询所有数据")
    @GetMapping("queryAllByLimit/{offset}/{limit}")
    public List<WarehouseStock> queryAllByLimit(@PathVariable("offset") Integer offset,@PathVariable("limit") Integer limit){
        List<WarehouseStock> list = warehouseStockServiceImpl.queryAllByLimit(offset,limit);
        return list;
    }

}