package cn.ddossec.controller;

import cn.ddossec.PageResult;
import cn.ddossec.domain.pojo.product_design_record;
import cn.ddossec.service.feign.Designfegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/design_record")
public class Production_recordController {

    @Autowired
    Designfegin service;

    @RequestMapping("/selectprocessAll")
    public List<product_design_record> selectprocessAll(){
        return  service.selectprocessAll();
    }



    @RequestMapping("/findPage")
    public PageResult findPage(@RequestParam Integer page,@RequestParam Integer pageSize){
        return service.findPage(page,pageSize);
    }



}
