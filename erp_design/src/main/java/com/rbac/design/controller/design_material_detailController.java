package com.rbac.design.controller;

import com.rbac.design.entity.design_material_detailresult;
import com.rbac.design.pojo.design_material_detail;
import com.rbac.design.service.design_material_detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joker_dj
 * @create 2020-04-22日 12:37
 */
@RestController
@RequestMapping("/design_material_detail")
public class design_material_detailController {
    @Autowired
    design_material_detailService service;

    @RequestMapping("/selectByproductId")
    public design_material_detailresult selectByproductId(String productId) {
        design_material_detail design_material_detail = service.selectByproductId(productId);
        System.out.println(design_material_detail);
        return new design_material_detailresult(design_material_detail);
    }
}
