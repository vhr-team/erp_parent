package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.domain.WarehouseInboundDetailed;
import cn.ddossec.service.WarehouseInboundDetailedService;
import cn.ddossec.service.WarehouseInboundService;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.ObjectId;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


/**
 * (WarehouseInbound)表控制层
 *
 * @author 谷辉
 * @since 2020-04-24 17:06:40
 */
@RestController
@RequestMapping("warehouseInbound")
public class WarehouseInboundController {
    /**
     * 服务对象
     */
    @Autowired
    private WarehouseInboundService warehouseInboundServiceImpl;




    /**
     * 查询可调度入库数据
     *
     * @param storeTag 库存标志
     * @param page 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @ApiOperation(value = "查询可调度入库数据")
    @RequestMapping("queryInboundLimit")
    public DataGridView queryInboundLimit(@RequestParam("storeTag") String storeTag,
                                          @RequestParam("page") int page,
                                          @RequestParam("limit") int limit){
        return warehouseInboundServiceImpl.queryInboundLimit(storeTag, page, limit);
    }


    /**
     * 入库申请登记
     * @return
     */
    @ApiOperation(value = "入库申请登记")
    @RequestMapping("insertWarehousing")
    public Response insertWarehousing(@RequestBody WarehouseInbound warehouseInbound){
        try{
            warehouseInboundServiceImpl.insertWarehousing(warehouseInbound);
            return new Response(true,"提交成功,等待审核!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"提交失败,请重试!");
        }
    }


    /**
     * 入库申请审核
     *
     * @param check_tag 入库标志 0待审核 1复核通过 2复核不通过
     *        check_time 复核时间
     * @param checker 复核人
     * @param inbound_id 入库单编号 (随机生成)
     * @return
     */
    /*@ApiOperation(value = "入库审核")
    @RequestMapping("updateWarehousing/{check_tag}/{checker}/{inbound_id}")
    public Response updateWarehousing(@PathVariable(value = "check_tag") String check_tag,@PathVariable(value = "checker") String checker,@PathVariable(value = "inbound_id") String inbound_id) {
        Date check_time = DateUtil.date();
        try{
            warehouseInboundServiceImpl.updateWarehousing(check_tag,check_time,checker,inbound_id);
            return new Response(true,"审核完成!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"请稍后再试!");
        }
    }*/



}