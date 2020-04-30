package cn.ddossec.controller;


import cn.ddossec.domain.Product_designprocess;
import cn.ddossec.domain.Production_mdesign_procedure;
import cn.ddossec.service.Product_designprocessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工序单
 */
@RestController
@RequestMapping("/designprocess")
public class Product_designprocessController {
    @Autowired
    private Product_designprocessService product_designprocessService;

    @RequestMapping("/getAllProduct_designprocess")
    public Map<String,Object> getAllProduct_designprocess(){
        Map<String,Object> rut = new HashMap<>();
        /*获取所有信息*/
        List<Product_designprocess> list = product_designprocessService.findAllProduction_modesign_procedure();
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut ;
    }
    @RequestMapping("/getAllDid")
    public Map<String,Object> getAllDid(String design_id){
        Map<String,Object> rut = new HashMap<>();
        /*获取所有信息*/
        List<Product_designprocess> list = product_designprocessService.findDId(design_id);
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut ;
    }


    /*
     * 添加
     * @param Product_designprocess
     * @return
     */
    @RequestMapping("/insertProduction")
    public String insertProduction(Product_designprocess product_designprocess){

        product_designprocessService.insertProduction_modesign_procedure(product_designprocess);
        return "OK";
    }
}




