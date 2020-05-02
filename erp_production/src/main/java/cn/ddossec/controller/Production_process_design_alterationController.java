package cn.ddossec.controller;

import cn.ddossec.domain.Production_process_design_alteration;
import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.service.Production_process_design_alterationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/production")
public class Production_process_design_alterationController {

    @Autowired
    Production_process_design_alterationService production_process_design_alterationService;


    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/getAllProduct_alteration")
    public Map<String,Object> getAllProduct_alteration(){
        Map<String,Object> rut = new HashMap<>();
        List<Production_process_design_alteration> list = production_process_design_alterationService.findAllProductionAlteration();
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut;
    }

    @RequestMapping("/delProduct_alterationById")
    public String delProduct_alterationById(int id){
        production_process_design_alterationService.delProductionAlterationById(id);
        return "200";
    }

    @RequestMapping("/insertProduct_alteration")
    public String insertProduct_alteration(Production_process_design_alteration production_process_design_alteration){
        production_process_design_alterationService.insertProductionAlteration(production_process_design_alteration);
        return "添加成功";
    }

    @RequestMapping("/editItemsProduct_alteration")
    public String editItemsProduct_alteration(@PathVariable("id") Integer id, Model model){
        Production_process_design_sheet production_process_design_sheet = production_process_design_alterationService.selectById(id);
        model.addAttribute("production_process_design_sheet",production_process_design_sheet);
        return "update";
    }

    @RequestMapping("/updateProduct_alterationById" +
            "")
    public String updateProduct_alterationById(Production_process_design_alteration production_process_design_alteration){
        boolean b = production_process_design_alterationService.updateProductionAlteration(production_process_design_alteration);
        if (b){
            return "修改成功";
        }
        return "No";
    }

}
