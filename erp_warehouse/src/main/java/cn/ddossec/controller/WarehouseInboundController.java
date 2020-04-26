package cn.ddossec.controller;

import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.service.WarehouseInboundService;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.ObjectId;
import io.swagger.annotations.ApiOperation;
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
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WarehouseInbound selectOne(Integer id) {
        return this.warehouseInboundServiceImpl.queryById(id);
    }

    /**
     * 入库申请登记
     *
     * @param warehouseInbound 实例对象
     * @return 实例对象
     */
    @ApiOperation(value = "入库申请登记")
    @RequestMapping("insertWarehousing")
    public Response insertWarehousing(WarehouseInbound warehouseInbound){
        String id = ObjectId.next(); //生成随机入库单编号
        warehouseInbound.setInboundId(id);
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
     * @param check_tag 入库标志 0待审核 1复核不通过 2复核通过
     *        check_time 复核时间
     * @param checker 复核人
     * @param inbound_id 入库单编号 (随机生成)
     * @return
     */
    @ApiOperation(value = "入库审核")
    @RequestMapping("updateWarehousing/{check_tag}/{checker}/{inbound_id}")
    public Response updateWarehousing(@PathVariable(value = "check_tag") String check_tag,@PathVariable(value = "checker") String checker,@PathVariable(value = "inbound_id") String inbound_id) {
        Date check_time = DateUtil.date();
        try{
            warehouseInboundServiceImpl.updateWarehousing(check_tag,check_time,checker,inbound_id);
            return new Response(true,"审核成功!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"请稍后再试!");
        }
    }



}