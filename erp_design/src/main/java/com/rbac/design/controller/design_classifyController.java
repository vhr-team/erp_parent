package com.rbac.design.controller;

import com.rbac.design.entity.Response;
import com.rbac.design.pojo.design_classify;
import com.rbac.design.service.design_classifyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-18日 11:48
 */
@RestController
@RequestMapping("/design_classify")
public class design_classifyController {
    @Autowired
    private design_classifyService service;

    /**
     *查询全部分类
     */
    @ApiOperation("查询全部分类")
    @GetMapping("/design_classifyAll")
    public List<design_classify> design_classifyAll(){
        return service.queryAll();
    }

    /**
     * 添加分类选项
     * @param classify
     * @return
     */
    @ApiOperation("添加分类选项")
    @PostMapping("/addclassify")
    public Response addclassify(@RequestBody design_classify classify){
        try {
            service.adddesign_classify(classify);
            return new Response(true,"添加成功");
        }catch (Exception e){
            return new Response(true,"添加失败");
        }
    }

    @ApiOperation("/根据主键删除分类")
    @PostMapping("/deleteclassifyById")
    public Response deleteclassifyById(@RequestBody design_classify classify){
        try {
            service.deleteclassifyById(classify);
            return new Response(true,"删除成功");
        }catch (Exception e){
            return new Response(true,"删除失败");
        }
    }

}
