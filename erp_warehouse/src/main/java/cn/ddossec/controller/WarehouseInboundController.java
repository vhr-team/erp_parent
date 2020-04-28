package cn.ddossec.controller;

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

    @Autowired
    private WarehouseInboundDetailedService warehouseInboundDetailedServiceImpl;
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
     * @return
     */
    @ApiOperation(value = "入库申请登记")
    @RequestMapping("insertWarehousing")
    public Response insertWarehousing(@Param("storer") String storer,
                                      @Param("reason") String reason,
                                      @Param("amountSum") Integer amountSum,
                                      @Param("costPriceSum") Double costPriceSum,
                                      @Param("register") String register,
                                      @Param("pemark") String pemark,
                                      @Param("productName") String productName,
                                      @Param("productId") String productId,
                                      @Param("productDescribe") String productDescribe,
                                      @Param("amount") Integer amount,
                                      @Param("amountUnit") String amountUnit,
                                      @Param("costPrice") Double costPrice,
                                      @Param("subtotal") Integer subtotal){
        String inboundId = ObjectId.next(); //生成随机入库单编号
        Date registerTime = DateUtil.date(); //登记时间
        WarehouseInbound warehouseInbound = new WarehouseInbound();
        warehouseInbound.setInboundId(inboundId); //入库单编号
        warehouseInbound.setStorer(storer); //入库人
        warehouseInbound.setReason(reason); //入库理由
        warehouseInbound.setAmountSum(amountSum); //总件数
        warehouseInbound.setCostPriceSum(costPriceSum); //总金额
        warehouseInbound.setRegister(register); //登记人
        warehouseInbound.setRegisterTime(registerTime); //登记时间
        warehouseInbound.setPemark(pemark); //备注
        WarehouseInboundDetailed warehouseInboundDetailed = new WarehouseInboundDetailed();
        warehouseInboundDetailed.setProductName(productName); //产品名称
        warehouseInboundDetailed.setProductId(productId); //产品编号
        warehouseInboundDetailed.setProductDescribe(productDescribe); //描述
        warehouseInboundDetailed.setAmount(amount); //数量
        warehouseInboundDetailed.setAmountUnit(amountUnit); //单位
        warehouseInboundDetailed.setCostPrice(costPrice); //单价
        warehouseInboundDetailed.setSubtotal(subtotal); //小计
        try{
            int count = warehouseInboundServiceImpl.insertWarehousing(warehouseInbound);
            if (count>0){
                Integer ParentId = warehouseInboundServiceImpl.queryId(inboundId); //获取到父级编号
                warehouseInboundDetailed.setParentId(ParentId); //父级编号
            }else{
                return new Response(false,"提交失败!");
            }
            warehouseInboundDetailedServiceImpl.insertWarehouseDetailed(warehouseInboundDetailed);
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
            return new Response(true,"审核完成!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"请稍后再试!");
        }
    }



}