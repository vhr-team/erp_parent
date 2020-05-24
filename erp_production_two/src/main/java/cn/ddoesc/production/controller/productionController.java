package cn.ddoesc.production.controller;

import cn.ddoesc.production.pojo.production_order;
import cn.ddoesc.production.service.feign.designService;
import cn.ddoesc.production.service.productionService;
import cn.ddossec.domain.pojo.Response;
import cn.ddossec.domain.pojo.product_design_record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-25日 2:29
 */
@RestController
@RequestMapping("/Feignprodution")
public class productionController {
    @Autowired
    designService feignservice;

    @Autowired
    productionService proservice;


    /**
     * 获取现在时间
     *
     * @return返回字符串格式yyyyMMddHHmmss
     */
    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * 由年月日时分秒+3位随机数
     * 生成流水号
     *
     * @return
     */
    public static String Getnum() {
        String t = getStringDate();
        int x = (int) (Math.random() * 900) + 100;
        String serial = t + x;
        return serial;
    }

    /**
     * 查询档案审核通过且没有制定生产设计的档案
     * @return
     */
    @RequestMapping("/selectPlancheckAll")
    public List<product_design_record> selectPlancheckAll(){
        return feignservice.selectcheckplanAll();
    }

    public Response updatePlancheck(@RequestBody product_design_record record){
        record.setPlanCheckstatus("已完成");
       try {
          feignservice.updatePlancheck(record);
          return new Response(true,"成功");
       }catch (Exception e){
           e.printStackTrace();
           return new Response(false,"失败");
       }
    }*/

    /**
     * 修改档案生产状态 添加生产档案
     * @param order
     * @return
     */
    @RequestMapping("/addproductionOrder")
    public Response addproductionOrder(@RequestBody production_order order) {
        Integer sumprice=0;
        try {
            order.setScheduleId(Getnum());
            sumprice=order.getPrice()*order.getQuantity();
            product_design_record product_design_record = new product_design_record();
            product_design_record.setProductId(order.getProductId());
            product_design_record.setPlanCheckstatus("已完成");
            order.setAggregate(sumprice);
            proservice.addproductionOrder(order);
            feignservice.updatePlancheck(product_design_record);
            return new Response(true,"成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"失败");
        }
    }
}
