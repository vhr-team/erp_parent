package com.rbac.design.controller;

import com.rbac.design.entity.*;
import com.rbac.design.pojo.design_classify;
import com.rbac.design.pojo.design_material;
import com.rbac.design.pojo.design_material_detail;
import com.rbac.design.service.design_classifyService;
import com.rbac.design.service.design_materialService;
import com.rbac.design.service.design_material_detailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-22日 11:12
 */
@RestController
@RequestMapping("/design_material")
public class design_materialController {
    @Autowired
    design_materialService service;
    @Autowired
    design_classifyService classifyService;

    @Autowired
    design_material_detailService detailService;

    @ApiOperation("分页查询")
    @RequestMapping("/findPage")
    public PageResult findPage(Integer page, Integer pageSize, design_material material) {
        return service.findpage(page, pageSize, material);
    }

    /**
     * 物料修改
     *
     * @param id
     * @param proid
     * @param type
     * @param product_describe
     * @param firstKindName
     * @param secondKindName
     * @param productName
     * @param moduleDescribe
     * @param amountUnit
     * @param cost_price_sum
     * @param changer
     * @return
     */
    @ApiOperation("修改物料&&物料详细")
    @RequestMapping("/updatematerial")
    public Response updatematerial(@RequestParam("id") Integer id,
                                   @RequestParam("proid") String proid,
                                   @RequestParam("type") String type,
                                   @RequestParam("product_describe") String product_describe,
                                   @RequestParam("firstKindName") String firstKindName,
                                   @RequestParam("secondKindName") String secondKindName,
                                   @RequestParam("productName") String productName,
                                   @RequestParam("moduleDescribe") String moduleDescribe,
                                   @RequestParam("amountUnit") String amountUnit,
                                   @RequestParam("cost_price_sum") Double cost_price_sum,
                                   @RequestParam("changer") String changer) {
        design_material material = new design_material();
        material.setId(id);
        material.setFirstKindName(firstKindName);
        material.setSecondKindName(secondKindName);
        material.setProductName(productName);
        material.setModuleDescribe(moduleDescribe);
        material.setCostPriceSum(cost_price_sum);
        material.setCheckTag("等待审核");
        material.setChangeTag("已变更");
        material.setChanger(changer);
        material.setProductId(proid);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        material.setChangeTime(df.format(new Date()).toString());// 初始化日期
        try {
            detailService.update_detail(proid, productName, type, product_describe, amountUnit);
            service.updatedesign_material(material);
            return new Response(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "修改失败");
        }
    }

    @ApiOperation("添加物料&&物料详细")
    @RequestMapping("/addmaterial")
    public Response addmaterial(@RequestParam("type") String type,
                                @RequestParam("product_describe") String product_describe,
                                @RequestParam("firstKindName") String firstKindName,
                                @RequestParam("secondKindName") String secondKindName,
                                @RequestParam("productName") String productName,
                                @RequestParam("moduleDescribe") String moduleDescribe,
                                @RequestParam("amountUnit") String amountUnit,
                                @RequestParam("cost_price_sum") Double cost_price_sum,
                                @RequestParam("residualAmount") Integer residualAmount,
                                @RequestParam("changer") String changer) {

        design_classify classifyfirst = new design_classify();
        design_classify classifysecond = new design_classify();
        classifysecond.setKindName(secondKindName);
        classifyfirst.setKindName(firstKindName);
        design_classify classifyOne = classifyService.queryByName(classifyfirst);
        design_classify classifyTwo = classifyService.queryByName(classifysecond);
        design_material material = new design_material();

        Date date = new Date();
        Object time = date.getTime();
        String priductId = time.toString();

        material.setDesignId("wl" + priductId);
        material.setDesigner(changer);
        material.setCheckTag("等待审核"); //审核标志
        material.setFirstKindId(classifyOne.getId().toString());
        material.setSecondKindId(classifyTwo.getId().toString());
        material.setProductId(priductId);//商品ID
        material.setFirstKindName(firstKindName);//一级分类
        material.setSecondKindName(secondKindName);//二级分类
        material.setProductName(productName);//产品名称
        material.setModuleDescribe(moduleDescribe);//设计要求
        material.setCostPriceSum(cost_price_sum);//物料总成本
        material.setChangeTag("未变更");//变更状态
        material.setRegister(changer);//登记人
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        material.setRegisterTime(df.format(new Date()).toString());// 登记时间

        design_material_detail detail = new design_material_detail();
        detail.setProductId(priductId);//产品编号
        detail.setProductName(productName);//产品名称
        detail.setType(type);//产品类型
        detail.setProductDescribe(product_describe);//产品描述
        detail.setAmountUnit(amountUnit);//单位
        detail.setResidualAmount(residualAmount);//数量
        detail.setCostPrice(cost_price_sum);//总价
        try {
            detailService.add_detail(detail);
            service.adddesign_material(material);
            return new Response(true, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "添加失败");
        }
    }


    @ApiOperation("删除物料")
    @RequestMapping("/delete_material")
    public Response delete_material(@RequestParam("proid") String proid) {
        try {
            service.delete_design_material(proid);
            detailService.delete_detail(proid);
            return new Response(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "删除失败");
        }
    }


    @RequestMapping("/selectAll")
    public material_detail selectAll() {
        material_details details = null;
        List<material_details> material_details = new ArrayList<>();
        List<design_material> design_material_details = service.selectAll();
        System.out.println(design_material_details);
        for (design_material design_material_detail : design_material_details) {
            details = new material_details();
            details.setName(design_material_detail.getProductName());
            details.setValue(design_material_detail.getCostPriceSum());
            material_details.add(details);
        }
        return new material_detail("0", "success", material_details);
    }


    @ApiOperation("查询未审核的物料")
    @RequestMapping("/design_materialcheck")
    public PageResult design_materialcheck(Integer page, Integer pageSize, design_material material) {
        return service.design_materialcheck(page, pageSize, material);
    }

    @RequestMapping("/check")
    public Response check(design_material material) {
        try {
            service.check(material);
            return new Response(true, "审核成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "审核失败");
        }
    }

    @RequestMapping("/miuticheck")
    public Response checkmiuti(@RequestBody miutichecker checkermiuti) {
        try {
            service.miuticheck(checkermiuti);
            return new Response(true, "审核成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "审核失败");
        }
    }
}

