package cn.ddossec.controller;

import cn.ddossec.domain.Production_mdesign_procedure;
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


    /**
     * 获取所有
     * @return
     */
    @RequestMapping("/getAllProductionSheet")
    public Map<String,Object> getAllProductionSheet(){
        Map<String,Object> rut = new HashMap<>();
        List<Production_process_design_sheet> list = production_process_design_sheetService.findAllProductionSheet();
        rut.put("data",list);
        return rut;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delProductionSheetById")
    public String delProductionSheetById(int id){
        production_process_design_sheetService.delProductionSheetById(id);
        return "删除成功";
    }

    /**
     *添加
     * @param production_process_design_sheet
     * @return
     */
    @RequestMapping("/insertProductionSheet")
    public String insertProductionSheet(Production_process_design_sheet production_process_design_sheet){
        production_process_design_sheetService.insertProductionSheet(production_process_design_sheet);
        return "添加成功";
    }

    /**
     * 修改前查询数据
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/editItemsProductionSheet")
    public String editItemsProductionSheet(@PathVariable("id") Integer id, Model model){
        Production_mdesign_procedure production_mdesign_procedure = production_process_design_sheetService.selectById(id);
        model.addAttribute("production_mdesign_procedure",production_mdesign_procedure);
        return "update";
    }

    /**
     * 修改
     * @param production_process_design_sheet
     * @return
     */
    @RequestMapping("/updateProductionSheetById")
    public String updateProductionSheetById(Production_process_design_sheet production_process_design_sheet){
        boolean b = production_process_design_sheetService.updateProductionSheet(production_process_design_sheet);
        if (b){
            return "修改成功";
        }
        return "No";
    }

}
