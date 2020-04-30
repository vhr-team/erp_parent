package cn.ddossec.controller;

import cn.ddossec.domain.Product_auditTable;
import cn.ddossec.domain.Product_designprocess;
import cn.ddossec.service.Product_auditTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/productaudit")
public class Product_auditTableController {

    @Autowired
    private Product_auditTableService product_auditTableService;

    @RequestMapping("/getAllProduct_auditTable")
    public Map<String,Object> getAllProduct_auditTable(){
        Map<String,Object> rut = new HashMap<>();
        /*获取所有信息*/
        List<Product_auditTable> list = product_auditTableService.findAllProduct_auditTable();
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut ;
    }
    @RequestMapping("/IsgetAllProduct_auditTable")
    public Map<String,Object> IsgetAllProduct_auditTable(){
        Map<String,Object> rut = new HashMap<>();
        /*获取所有信息*/
        List<Product_auditTable> list = product_auditTableService.IsfindAllProduct_auditTable();
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut ;
    }

    @RequestMapping("/auditSjdShb")
    public String auditSjdShb(String  shState,String audit_date,Integer sjdId,Integer shdId){
      product_auditTableService.auditSjdShb(shState,audit_date,sjdId,shdId);
        return "OK";
    }
}
