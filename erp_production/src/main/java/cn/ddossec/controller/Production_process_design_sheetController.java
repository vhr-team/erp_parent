package cn.ddossec.controller;

import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.service.Production_process_design_sheetService;
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
public class Production_process_design_sheetController {

    @Autowired
    Production_process_design_sheetService production_process_design_sheetService;

    @RequestMapping("/getAllProductionProcess")
    public Map<String,Object> getAllProductionProcess(){
        Map<String,Object> rut = new HashMap<>();
        List<Production_process_design_sheet> list = production_process_design_sheetService.finfAllProduction_process_design_sheet();
        rut.put("data",list);
        return rut;
    }

    @RequestMapping("/delProductionSheetById")
    public String delProductionSheetById(int id){
        production_process_design_sheetService.delProduction_process_design_sheetById(id);
        return "200";
    }

    @RequestMapping("/insertProductionSheet")
    public String insertProductionSheet(Production_process_design_sheet production_process_design_sheet){
        production_process_design_sheetService.insertProduction_mdesign_procedure(production_process_design_sheet);
        return "添加成功";
    }

    @RequestMapping("/editItemsProductionSheet")
    public String editItemsProductionSheet(@PathVariable("id") Integer id, Model model){
        Production_process_design_sheet production_process_design_sheet = production_process_design_sheetService.selectById(id);
        model.addAttribute("production_process_design_sheetService",production_process_design_sheetService);
        return "update";
    }

    @RequestMapping("/updateProductionSheetById")
    public String updateProductionSheetById(Production_process_design_sheet production_process_design_sheet){
        boolean b = production_process_design_sheetService.updateProduction_process_design_sheet(production_process_design_sheet);
        if (b){
            return "修改成功";
        }
        return "No";
    }

}
