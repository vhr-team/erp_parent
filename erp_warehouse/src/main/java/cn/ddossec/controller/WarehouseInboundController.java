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
    @RequestMapping("insertWarehousing/{warehouseInbound}")
    public Response insertWarehousing(@PathVariable(value = "warehouseInbound") WarehouseInbound warehouseInbound){
        String id = ObjectId.next(); //生成随机入库单编号
        warehouseInbound.setInboundId(id);

        int count = warehouseInboundServiceImpl.insertWarehousing(warehouseInbound);
        if (count>0){
            return new Response(true,"申请成功,等待复核!");
        }else {
            return new Response(false,"申请失败，请重试!");
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

        int count = warehouseInboundServiceImpl.updateWarehousing(check_tag,check_time,checker,inbound_id);
        if (count>0){
            return new Response(true,"审核成功!");
        }else {
            return new Response(false,"审核失败,请重试!");
        }
    }



}