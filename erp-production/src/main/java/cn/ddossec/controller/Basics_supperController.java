package cn.ddossec.controller;


import cn.ddossec.domain.Basics_supper;
import cn.ddossec.service.Basics_supperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *供货商控制器
 */
@RestController
@RequestMapping("/supper")
public class Basics_supperController {

    @Autowired
    Basics_supperService basics_supperService;

    @RequestMapping("/getAllBasics_supper")
    public List<Basics_supper> getAllBasics_supper(Model model){
        List<Basics_supper> list = basics_supperService.findAllBasics_supper();
        model.addAttribute("list",list);
        return list;
    }
}
