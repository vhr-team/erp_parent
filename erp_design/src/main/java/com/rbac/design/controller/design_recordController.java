package com.rbac.design.controller;

import com.rbac.design.entity.PageResult;
import com.rbac.design.entity.Response;
import com.rbac.design.pojo.design_record;
import com.rbac.design.service.design_record_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-17日 10:38
 */
@RestController
@RequestMapping("/design_record")
public class design_recordController {

    @Autowired
    private design_record_Service service;

    /**
     * 查询所有产品档案
     */
    @GetMapping("/design_recordAll")
    public void design_recordAll() {
        List<design_record> design_records = service.queryAll();
        System.out.println(design_records);
    }

    /**
     * 分页查询
     *
     * @param page     页码
     * @param pageSize 行数
     * @param record   传入的查询值
     * @return 总记录数 查询的数据
     */
    @GetMapping("/findPage")
    public PageResult findPage(Integer page, Integer pageSize, design_record record) {
        PageResult list = service.findPage(page, pageSize, record);
        return list;
    }

    /**
     * 添加产品档案
     * @param record 添加的产品集合
     * @return
     */
    @RequestMapping("/addrecord")
    public Response addrecord(@RequestBody design_record record){
        try {
            service.addrecord(record);
            return new Response(true,"添加成功");
        }catch (Exception e){
            return new Response(true,"添加失败");
        }
    }

    @RequestMapping("/updaterecordById")
    public Response updaterecordById(@RequestBody design_record record){
        try {
            service.updaterecordById(record);
            return new Response(true,"修改成功");
        }catch (Exception e){
            return new Response(true,"修改失败");
        }
    }

}
