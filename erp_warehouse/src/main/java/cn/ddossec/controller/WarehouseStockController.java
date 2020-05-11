package cn.ddossec.controller;

import cn.ddosec.design.entity.PageResult;
import cn.ddosec.design.pojo.product_design_record;
import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseStock;
import cn.ddossec.service.WarehouseStockService;
import cn.ddossec.service.designRecordFeignService;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.ObjectId;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


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

    @Autowired
    private designRecordFeignService designRecordFeignService;


    /**
     *   查询设计审核状态
     * @param page
     * @param pageSize
     * @param checkTag 审核标志
     * @return
     */
    @ApiOperation(value = "根据设计审核通过查询出制定安全库存配置单")
    @RequestMapping(value = "findPagecheck")
    public PageResult findPagecheck(@RequestParam("page") Integer page,
                                    @RequestParam("limit") Integer pageSize,
                                    @RequestParam("checkTag") String checkTag,
                                    @RequestParam("inventoryStatus") Integer inventoryStatus){
        product_design_record record = new product_design_record();
        record.setCheckTag(checkTag);
        record.setInventoryStatus(inventoryStatus);
        return designRecordFeignService.findPagecheck(page, pageSize, record);
    }



    /**
     * 新增安全库存配置单
     *
     * @param warehouseStock 安全库存配置单对象
     * @return
     */
    @ApiOperation(value = "新增安全库存配置单")
    @PostMapping(value = "insertSecuritySheet")
    public Response insertSecuritySheet(@RequestBody WarehouseStock warehouseStock){
        //生成库存编号
        warehouseStock.setStockId(ObjectId.next());
        //获取当前时间
        Date date = DateUtil.date();
        warehouseStock.setRegisterTime(date);
        try{
            warehouseStockServiceImpl.insertSecuritySheet(warehouseStock);
            return new Response(true,"提交成功,等待审核!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"提交失败,请重试!");
        }
    }

    /**
     * 查询安全库存配置单
     *
     * @param checkTag 复核标志 0待审核 1审核通过 2审核未通过
     * @param productName 按照产品名称模糊查询
     * @param page 从多少页开始
     * @param limit 每页显示数
     * @return
     */
    @ApiOperation(value = "查询安全库存配置单")
    @GetMapping(value = "querySecuritySheet")
    public DataGridView querySecuritySheet(@RequestParam("check_tag") String checkTag,
                                           @RequestParam("product_name") String productName,
                                           @RequestParam("page") int page,
                                           @RequestParam("limit") int limit){
        if (productName==null){
            productName="";
        }
        return warehouseStockServiceImpl.querySecuritySheet(checkTag,productName,page,limit);
    }

    /**
     * 库存安全配置单复核
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
        try{
            warehouseStockServiceImpl.updateSecuritySheet(check_tag,check_time,product_id,checker);
            return new Response(true,"复核成功!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"请稍后再试!");
        }
    }

    /**
     * 通过序号修改安全库存配置
     * @param minAmount 库存报警下限
     * @param maxAmount 库存报警上限
     * @param maxCapacityAmount 最大存储量
     * @param Id 序号
     */
    @ApiOperation(value = "修改安全库存")
    @RequestMapping("updateAmount")
    public Response updateAmount(@RequestParam(value = "minAmount") Integer minAmount,
                                 @RequestParam(value = "maxAmount") Integer maxAmount,
                                 @RequestParam(value = "maxCapacityAmount") Integer maxCapacityAmount,
                                 @RequestParam("id") Integer Id){
        try {
            if (minAmount<=0||maxAmount<=50||maxCapacityAmount<500||maxAmount>maxCapacityAmount||minAmount>=maxCapacityAmount||minAmount>=maxAmount){
                return new Response(false,"修改失败,请按照正常逻辑修改!");
            }else {
                warehouseStockServiceImpl.updateAmount(minAmount, maxAmount, maxCapacityAmount, Id);
                return new Response(true,"修改成功!");
            }
        }catch (Exception e){
            e.printStackTrace();
            return new Response(true,"修改失败,请重试!");
        }
    }

    @ApiOperation(value = "根据序号删除数据")
    @RequestMapping("deleteByProductId")
    public Response deleteByProductId(Integer id){
        System.out.println(id);
        try {
            int count = warehouseStockServiceImpl.deleteByProductId(id);
            if (count>0){
                return new Response(true,"删除成功!");
            }else {
                return new Response(false,"删除失败,没有找到当前序号!");
            }
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"删除失败,请重试!");
        }
    }


}