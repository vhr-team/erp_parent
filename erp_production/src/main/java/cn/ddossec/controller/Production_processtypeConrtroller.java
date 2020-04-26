package cn.ddossec.controller;

import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.domain.Production_processtype;
import cn.ddossec.service.Production_processtypeService;
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
public class Production_processtypeConrtroller {

    @Autowired
    Production_processtypeService production_processtypeService;


    /**
     * 查询
     * @return
     */
    @RequestMapping("/getAllProductionProcesstype")
    public Map<String,Object> getAllProductionProcesstype(){
        Map<String,Object> rut = new HashMap<>();
        List<Production_processtype> list = production_processtypeService.finfAllProductionProcesstype();
        rut.put("data",list);
        return rut;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delProductionProcesstypeById")
    public String delProductionProcesstypeById(int id){
        production_processtypeService.delProductionPprocesstypeById(id);
        return "200";
    }

    /**
     * 添加
     * @param production_processtype
     * @return
     */
    @RequestMapping("/insertProductionProcesstype")
    public String insertProductionProcesstype(Production_processtype production_processtype){
        production_processtypeService.insertProductionProcesstype(production_processtype);
        return "添加成功";
    }


    @RequestMapping("/editItemsProductionProcess")
    public String editItemsProductionProcess(@PathVariable("id") Integer id, Model model){
        Production_process_design_sheet production_process_design_sheet = production_processtypeService.selectById(id);
        model.addAttribute("production_process_design_sheet",production_process_design_sheet);
        return "update";
    }

    /**
     * 修改
     * @param production_processtype
     * @return
     */
    @RequestMapping("/updateProductionProcessById")
    public String updateProductionProcessById(Production_processtype production_processtype){
        boolean b = production_processtypeService.updateProductionProcesstype(production_processtype);
        if (b){
            return "修改成功";
        }
        return "No";
    }




}
