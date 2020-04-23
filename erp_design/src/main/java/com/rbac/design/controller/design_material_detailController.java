package com.rbac.design.controller;

import com.rbac.design.entity.design_material_detailresult;
import com.rbac.design.entity.material_detail;
import com.rbac.design.entity.material_details;
import com.rbac.design.pojo.design_material_detail;
import com.rbac.design.service.design_material_detailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-22日 12:37
 */
@RestController
@RequestMapping("/design_material_detail")
public class design_material_detailController {
    @Autowired
    design_material_detailService service;

    @ApiOperation("根据物料id查询")
    @RequestMapping("/selectByproductId")
    public design_material_detailresult selectByproductId(String productId) {
        design_material_detail design_material_detail = service.selectByproductId(productId);
        System.out.println(design_material_detail);
        return new design_material_detailresult(design_material_detail);
    }

    /**
     * 查询所有物料
     *
     * @return
     */
    @ApiOperation("查询所有物料")
    @RequestMapping("/selectAll")
    public material_detail selectAll() {
        material_details details = null;
        List<material_details> material_details = new ArrayList<>();
        List<design_material_detail> design_material_details = service.selectAll();
        System.out.println(design_material_details);
        for (design_material_detail design_material_detail : design_material_details) {
            details = new material_details();
            details.setName(design_material_detail.getProductName());
            details.setValue(design_material_detail.getCostPrice());
            material_details.add(details);
        }
        System.out.println(details);
        return new material_detail("0", "success", material_details);
    }
}
