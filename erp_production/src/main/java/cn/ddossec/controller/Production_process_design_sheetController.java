package cn.ddossec.controller;

import cn.ddossec.domain.Product_designprocess;
import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.mapper.Product_designprocessMapper;
import cn.ddossec.service.Production_process_design_sheetService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/process")
public class Production_process_design_sheetController {

    @Autowired
    Production_process_design_sheetService production_process_design_sheetService;

    @RequestMapping("/getAllProductionProcess")
    public Map<String,Object> getAllProductionProcess(){
        Map<String,Object> rut = new HashMap<>();
        List<Production_process_design_sheet> list = production_process_design_sheetService.findAll();
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut;
    }


    @RequestMapping("/insertProductionSheet")
    public String insertProductionSheet(Production_process_design_sheet production_process_design_sheet ,Integer prdouctId ,String  gprocuJson1){
        production_process_design_sheet.setDesign_number(getOrderIdByUUId());
        System.out.println("设计单号"+prdouctId);
        Gson gson = new Gson();
        List<Product_designprocess> plgList=   gson.fromJson(gprocuJson1,new TypeToken<List<Product_designprocess>>(){}.getType());

      //  System.out.println(production_process_design_sheet);
      //  System.out.println(getOrderIdByUUId());
        System.out.println(production_process_design_sheet);
   production_process_design_sheetService.addProduction_process_design_sheet(production_process_design_sheet,prdouctId,plgList);
        return "添加成功";
    }
    public static String getOrderIdByUUId() {
        int first = new Random(10).nextInt(8) + 1;
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数
            hashCodeV = -hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return first + String.format("%015d", hashCodeV);
    }


}
