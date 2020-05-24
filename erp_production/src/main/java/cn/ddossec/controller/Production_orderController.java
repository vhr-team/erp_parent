package cn.ddossec.controller;

import cn.ddossec.domain.Production_order;
import cn.ddossec.service.Production_orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 生产调度管理控制器
 */

@RestController
@RequestMapping("/production")
public class Production_orderController {

    @Autowired
    Production_orderService production_orderService;



    /**
     * 获取当前时间
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
     * 查询派工单
     * @return
     */
    @RequestMapping("/getAllProduction_order")
    public Map<String,Object> getAllProduction_order(){
        Map<String,Object> rut = new HashMap<>();
        List<Production_order> list = production_orderService.findAllProductionOrder();
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut;
    }

    /**
     * 添加派工单
     * @param production_order
     * @return
     */
    @RequestMapping("/insertProduction_order")
    public String insertProduction_order( Production_order production_order){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        production_order.setSchedule_id(Getnum());//设置单号
        production_order.setQutbound_order_id(Getnum());
        try {
            production_order.setReview_time(formatter.parse(formatter.format(new Date())));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int aggregate = 0;
        aggregate = production_order.getQuantity() * production_order.getPrice();//计算总价 = 单价 * 数量
        production_order.setAggregate(aggregate);//总价
        production_orderService.insertProductionOrder(production_order);
        System.out.println(production_order);
        return "添加成功";
    }


    @RequestMapping("/editItemsProductionOrder")
    public String editItemsProductionOrder(@PathVariable("id") Integer id, Model model){
        Production_order production_order = production_orderService.selectById(id);
        model.addAttribute("production_order",production_order);
        return "update";
    }

    @RequestMapping("/updateProductionOrderById")
    public String updateProductionOrderById(String id){
        boolean b = production_orderService.updateProductionOrder(id);
        if (b){
            return "提交成功";
        }
        return "提交失败";
    }


    @RequestMapping("/getFindByProduction_generate")
    public Map<String,Object> getFindByProduction_generate(){
        Map<String,Object> rut = new HashMap<>();
        List<Production_order> list = production_orderService.findByProduction_generate();
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        System.out.println(list);
        return rut;
    }

    @RequestMapping("/updatechecked_audit")
    public String updatechecked_audit(String id){
        boolean b = production_orderService.updatechecked_audit(id);
        if (b){
            return "审核成功";
        }
        return "审核失败";
    }


    @RequestMapping("/getFindByChecked_audit")
    public Map<String,Object> getFindByChecked_audit(){
        Map<String,Object> rut = new HashMap<>();
        List<Production_order> list = production_orderService.findByChecked_audit();
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut;
    }


    @RequestMapping("/findByAdd_status")
    public Map<String,Object> findByAdd_status(){
        Map<String,Object> rut = new HashMap<>();
        List<Production_order> list = production_orderService.findByAdd_status();
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut;
    }

    @RequestMapping("/updateAdd_status")
    public String updateAdd_status(String id){
        boolean b = production_orderService.updateAdd_status(id);
        if (b){
            return "审核成功";
        }
        return "审核失败";

    }



}
