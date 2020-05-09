package cn.ddossec.controller;

import cn.ddossec.domain.Process_design;
import cn.ddossec.domain.Production_mdesign_procedure;
import cn.ddossec.service.Process_design_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/process_design")
public class Process_designController {

    @Autowired

 private   Process_design_Service service;

    @RequestMapping("/getAllProcess_design")
    public Map<String,Object> getAllProcess_design(){
        Map<String,Object> rut = new HashMap<>();
        /*获取所有信息*/
        List<Process_design> list = service.findAll();
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut ;
    }

}
