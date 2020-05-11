package cn.ddossec.controller;

import cn.ddossec.domain.Production_order;
import cn.ddossec.service.Production_orderService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
