package cn.ddossec.controller;

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
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WarehouseOutbound selectOne(Integer id) {
        return this.warehouseOutboundServiceImpl.queryById(id);
    }

    @ApiOperation(value = "按出库单编号模糊查询+分页查询所有数据")
    @GetMapping(value = {"queryAllByLimit/{offset}/{limit}/{outbound_id}","queryAllByLimit/{offset}/{limit}"})
    public List<WarehouseOutbound> queryAllByLimit(@PathVariable("offset") Integer offset,
                                                   @PathVariable("limit") Integer limit,
                                                   @PathVariable(value = "outbound_id",required = false) String outbound_id){
        if(outbound_id==null){
            outbound_id="";
        }
        List<WarehouseOutbound> list = warehouseOutboundServiceImpl.queryAllByLimit(outbound_id,offset,limit);
        return list;
    }
}