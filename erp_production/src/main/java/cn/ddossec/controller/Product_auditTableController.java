package cn.ddossec.controller;

import cn.ddossec.domain.Product_auditTable;
import cn.ddossec.domain.Product_designprocess;
import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.service.Product_auditTableService;
import cn.ddossec.service.Product_designprocessService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
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

    @Autowired
    private Product_designprocessService  product_designprocessService;
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
    @RequestMapping("/edittSjdShb")
    public String edittSjdShb(Production_process_design_sheet production_process_design_sheet , Integer prdouctId , String  gprocuJson1,Integer sjdId ,Integer shdId,String edie_date){
        Gson gson = new Gson();
        List<Product_designprocess> plgList=   gson.fromJson(gprocuJson1,new TypeToken<List<Product_designprocess>>(){}.getType());
       product_designprocessService.updateProduct_designprocess(plgList,sjdId,shdId,edie_date);
        return "OK";
    }

}
