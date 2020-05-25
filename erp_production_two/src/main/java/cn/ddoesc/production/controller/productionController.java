package cn.ddoesc.production.controller;

import cn.ddoesc.production.pojo.production_order;
import cn.ddoesc.production.service.feign.designService;
import cn.ddoesc.production.service.productionService;
import cn.ddossec.domain.pojo.Response;
import cn.ddossec.domain.pojo.product_design_record;
import org.bouncycastle.jcajce.provider.digest.MD2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     *
     * @return
     */
    @RequestMapping("/selectPlancheckAll")
    public List<product_design_record> selectPlancheckAll() {
        return feignservice.selectcheckplanAll();
    }

    public Response updatePlancheck(@RequestBody product_design_record record) {
        record.setPlanCheckstatus("已完成");
        try {
            feignservice.updatePlancheck(record);
            return new Response(true, "成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "失败");
        }
    }

    /**
     * 修改档案生产状态 添加生产档案
     *
     * @param order
     * @return
     */
    @RequestMapping("/addproductionOrder")
    public Response addproductionOrder(production_order order) {
        Integer sumprice = 0;
        try {
            order.setId(null);
            order.setScheduleId(Getnum());
            sumprice = order.getListPrice() * order.getQuantity();
            product_design_record product_design_record = new product_design_record();
            product_design_record.setProductId(order.getProductId());
            product_design_record.setPlanCheckstatus("已完成");
            order.setAggregate(sumprice);
            proservice.addproductionOrder(order);
            feignservice.updatePlancheck(product_design_record);
            return new Response(true, "成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "失败");
        }
    }

    /**
     * 生产审核  传入 产品编号 计划单编号和审核状态（审核通过/审核不通过）
     *
     * @param order
     * @return
     */
    @RequestMapping("/updatecheck")
    public Response updatecheck(production_order order) {
        try {
            if ("审核不通过".equals(order.getCheckedAudit())) {
                product_design_record product_design_record = new product_design_record();
                product_design_record.setProductId(order.getProductId());
                product_design_record.setPlanCheckstatus("未完成");
            } else {
                order.setProductionGenerate("已生成");
                proservice.updatecheck(order);
            }

            return new Response(true, "审核成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "审核失败");
        }
    }

    /**
     * 查询生产状态已生成且 审核通过的计划单
     *
     * @param order [可传入产品名称查询]
     * @return
     */
    @RequestMapping("/selectOrderList")
    Object selectOrderList(@RequestParam(required = false) @RequestBody production_order order) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("data", proservice.selectOrderList(order));
        return map;
    }

    /**
     * 指定派送人
     * 传入计划单编号,派送人姓名
     */
    @RequestMapping("/updatedispach")
    public Response updatedispach(production_order order) {
        try {
            proservice.updateplanperson(order);
            return new Response(true, "成功");
        } catch (Exception e) {
            return new Response(false, "失败");
        }

    }

    /**
     * 查询计划单审核通过,派工单待审核测单子
     */
    @RequestMapping("/selectcheck")
    public List<production_order> selectcheck() {
        return proservice.selectcheck();
    }

    /**
     * 计划单审核通过
     * 传入计划单编号即可
     */
    @RequestMapping("/updatecheckperson")
    public Response updatecheckperson(@RequestBody production_order order) {
        try {
            proservice.updatecheckperson(order);
            return new Response(true, "成功");
        } catch (Exception e) {
            return new Response(false, "失败");
        }

    }

    /**
     * 查询所有已生成的派工单
     */
    @RequestMapping("/selectList")
    public List<production_order> selectList() {
        return proservice.selectList();
    }

}
