package com.rbac.design.controller;

import com.rbac.design.entity.PageResult;
import com.rbac.design.pojo.design_record;
import com.rbac.design.service.design_record_Service;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping("/design_recordAll")
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
    @RequestMapping("/findPage")
    public PageResult findPage(Integer page, Integer pageSize, design_record record) {
        PageResult list = service.findPage(page, pageSize, record);
        return list;
    }
}
