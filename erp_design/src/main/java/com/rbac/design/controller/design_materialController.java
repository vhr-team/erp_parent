package com.rbac.design.controller;

import com.rbac.design.entity.PageResult;
import com.rbac.design.pojo.design_material;
import com.rbac.design.service.design_materialService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joker_dj
 * @create 2020-04-22日 11:12
 */
@RestController
@RequestMapping("/design_material")
public class design_materialController {
    @Autowired
    design_materialService service;

    @ApiOperation("分页查询")
    @RequestMapping("/findPage")
    public PageResult findPage(Integer page, Integer pageSize, design_material material) {
        return service.findpage(page, pageSize, material);
    }
}
