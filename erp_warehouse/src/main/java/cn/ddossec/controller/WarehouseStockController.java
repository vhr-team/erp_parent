package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseStock;
import cn.ddossec.service.WarehouseStockService;
import cn.hutool.core.date.DateUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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
    @ApiOperation(value = "按库存编号模糊查询+分页查询所有数据")
    @GetMapping(value = {"queryAllByLimit/{offset}/{limit}/{stockId}","queryAllByLimit/{offset}/{limit}"})
    public List<WarehouseStock> queryAllByLimit(@PathVariable("offset") Integer offset,
                                                @PathVariable("limit") Integer limit,
                                                @PathVariable(value = "stockId",required = false) String stockId){
        if (stockId==null){
            stockId="";
        }
        List<WarehouseStock> list = warehouseStockServiceImpl.queryAllByLimit(stockId,offset,limit);
        return list;
    }

    /**
     *
     * @param warehouseStock 安全库存配置单对象
     * @return
     */
    @ApiOperation(value = "新增安全库存配置单")
    @GetMapping(value = "insertSecuritySheet/{warehouseStock}")
    public Response insertSecuritySheet(@PathVariable(value = "warehouseStock") WarehouseStock warehouseStock){
        //获取当前时间
        Date date = DateUtil.date();
        warehouseStock.setRegisterTime(date);

        int count = warehouseStockServiceImpl.insertSecuritySheet(warehouseStock);
        if (count>0){
            //如果执行成功，返回  提交成功,等待审核!
            return new Response(true,"提交成功,等待审核!");
        }
        return new Response(false,"提交失败,请重试!");
    }

    /**
     *
     * @param check_tag 复核标志 0待审核 1通过
     * @return
     */
    @ApiOperation(value = "查询安全库存配置单")
    @GetMapping(value = "querySecuritySheet/{check_tag}")
    public DataGridView querySecuritySheet(@PathVariable(value = "check_tag") String check_tag){
        List<WarehouseStock> list = warehouseStockServiceImpl.querySecuritySheet(check_tag);
        return new DataGridView(list);
    }

    /**
     *
     * @param product_id 产品编号
     * @param checker 复核人
     * @return
     */
    @ApiOperation(value = "库存安全配置单复核")
    @GetMapping(value = "updateSecuritySheet/{product_id}/{checker}")
    public Response updateSecuritySheet(@PathVariable(value = "product_id") String product_id,
                                        @PathVariable(value = "checker") String checker){
        //修改复核标志为1，表示复核通过
        String check_tag = "1";
        //获取当前时间为复核时间
        Date check_time = DateUtil.date();

        int count = warehouseStockServiceImpl.updateSecuritySheet(check_tag,check_time,product_id,checker);
        if (count>0){
            //如果执行成功，返回
            return new Response(true,"复核成功!");
        }
        return new Response(false,"请稍后再试!");
    }


}