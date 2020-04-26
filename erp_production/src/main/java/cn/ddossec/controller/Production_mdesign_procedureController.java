package cn.ddossec.controller;

import cn.ddossec.domain.Production_mdesign_procedure;
import cn.ddossec.service.Production_mdesign_procedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/production")
public class Production_mdesign_procedureController {

    @Autowired
    Production_mdesign_procedureService production_mdesign_procedureService;



    @RequestMapping("/getAllProduction")
    public Map<String,Object>  getAllProduction(){
        Map<String,Object> rut = new HashMap<>();
        /*获取所有信息*/
        List<Production_mdesign_procedure> list = production_mdesign_procedureService.findAllProduction_mdesign_procedure();
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut ;
    }

    /*
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping("/delProductionById/{id}")
    public String delProductionById(@PathVariable("id") int id){
        production_mdesign_procedureService.delProduction_mdesign_procedureById(id);
        return "redirect:/production/getAllproduction";
    }

    /*
     * 添加
     * @param production_mdesign_procedure
     * @return
     */
    @RequestMapping("/insertProduction")
    public String insertProduction(Production_mdesign_procedure production_mdesign_procedure){
        production_mdesign_procedureService.insertProduction_mdesign_procedure(production_mdesign_procedure);
        return "redirect:/production/getAllproduction";
    }


    /*
     * 修改之前查询数据
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/editItemsProduction/{id}")
    public String editItemsProduction(@PathVariable("id") Integer id,Model model){
        /*调用service根据id查询*/
        Production_mdesign_procedure production_mdesign_procedure = production_mdesign_procedureService.selectById(id);
        model.addAttribute("production_mdesign_procedure",production_mdesign_procedure);
        return "update";
    }

    /*
     * 修改
     * @param production_mdesign_procedure
     * @return
     */
    @RequestMapping("/updateProductionById")
    public ModelAndView updateProductionById(Production_mdesign_procedure production_mdesign_procedure){
        ModelAndView mv = new ModelAndView();
        boolean b = production_mdesign_procedureService.updateProduction_mdesign_procedure(production_mdesign_procedure);
        if(b){
            mv.setViewName("redirect:production/getAllProduction");
        }
        return mv;
    }

}
