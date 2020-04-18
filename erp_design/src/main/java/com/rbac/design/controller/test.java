package com.rbac.design.controller;

import cn.hutool.core.util.StrUtil;
import com.rbac.design.pojo.design_record;
import com.rbac.design.service.design_record_Service;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static net.sf.json.JSONArray.fromObject;
import static net.sf.json.JSONArray.toArray;

/**
 * 测试
 *
 * @author joker_dj
 * @create 2020-04-18日 15:23
 */
@RestController
@RequestMapping("/test")
public class test {
    @Autowired
    private design_record_Service service;

    @RequestMapping("/test")
    public void show() {
        List<design_record> design_records = service.queryAll();
        for (design_record design_record : design_records) {
            String s = design_record.getMaterialList().toString();
            String s1 = StrUtil.removeAll(s, '{', '}', '\'');
            System.out.println(s1);

        }
    }

}
