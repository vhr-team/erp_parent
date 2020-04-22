package cn.ddossec.controller;


import cn.ddossec.domain.Basics_supper;
import cn.ddossec.service.Basics_supperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*
 *供货商控制器
 */
@RestController
@RequestMapping("/supper")
public class Basics_supperController {

    @Autowired
    Basics_supperService basics_supperService;

    /*
     * 查询所有供货商信息
     * @param model
     * @return
     */
    @RequestMapping("/getAllBasics_supper")
    public List<Basics_supper> getAllBasics_supper(Model model){
        List<Basics_supper> list = basics_supperService.findAllBasics_supper();
        model.addAttribute("list",list);
        return list;
    }

    /*
     * 根据id删除供货商
     * @param id
     * @return
     */
    @RequestMapping("/delsupperById/{id}")
    public String delsupperById(@PathVariable("id") int id){
        basics_supperService.delBasics_supperMapperById(id);
        return "redirect:supper/getAllBasics_supper";
    }

    /*
     * 添加供货商
     * @param basics_supper
     * @return
     */
    @RequestMapping("/insertSupper")
    public String insertSupper(Basics_supper basics_supper){
        basics_supperService.insertBasics_supper(basics_supper);
        return "redirect:supper/getAllBasics_supper";
    }


    /*
     * 修改之前查询数据
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("editItemsSupper/{id}")
    public String editItemsSupper(@PathVariable("id") Integer id,Model model){
        /*调用service根据id查询*/
        Basics_supper basics_supper = basics_supperService.selectById(id);
        model.addAttribute("basics_supper",basics_supper);
        return "update";
    }


    /*
     * 修改
     * @param basics_supper
     * @return
     */
    @RequestMapping("/updateSupperById")
    public ModelAndView updateSupperById(Basics_supper basics_supper){
        ModelAndView mv = new ModelAndView();
        boolean b = basics_supperService.updateBasics_supper(basics_supper);
        if (b){
            mv.setViewName("redirect:supper/getAllBasics_supper");
        }
        return mv;
    }

}
