package cn.ddossec.controller;

import cn.ddossec.domain.Production_order;
import cn.ddossec.service.Production_orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/production")
public class Production_orderController {

    @Autowired
    Production_orderService production_orderService;

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
    public String insertProduction_order(Production_order production_order){
        production_orderService.insertProductionOrder(production_order);
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

}
