package com.rbac.design.controller;

import com.rbac.design.entity.PageResult;
import com.rbac.design.entity.Response;
import com.rbac.design.entity.treeResult;
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
     * 查询全部分类
     */
    @ApiOperation("查询全部分类")
    @GetMapping("/design_classifyAll")
    public treeResult design_classifyAll(design_classify classify) {
        List<design_classify> design_classifies = service.queryAll(classify);
        treeResult treeResult = new treeResult("0", "", design_classifies.size(), design_classifies);
        return treeResult;
    }

    /**
     * 添加分类选项
     * @param classify
     * @return
     */
    @ApiOperation("添加分类选项")
    @PostMapping("/addclassify")
    public Response addclassify(@RequestBody design_classify classify) {
        System.out.println(classify);
        design_classify design_classify = service.queryByName(classify);
        if (classify.getKindName() != "") {
            classify.setpId(design_classify.getId());
        } else {
            classify.setKindId("父级");
            classify.setKindLevel(1);

        }
        classify.setKindName(classify.getName());
        try {
            service.adddesign_classify(classify);
            return new Response(true, "添加成功");
        } catch (Exception e) {
            return new Response(true, "添加失败");
        }
    }

    @ApiOperation("/根据主键删除分类")
    @PostMapping("/deleteclassifyById")
    public Response deleteclassifyById(@RequestParam("id") Integer id, @RequestParam("kindId") String kindId) {
        try {
            service.deleteclassifyById(id, kindId);
            return new Response(true, "删除成功");
        } catch (Exception e) {
            return new Response(true, "删除失败");
        }
    }

    /**
     * 分页查询
     */
    @ApiOperation("分类分页查询")
    @RequestMapping("/findpage")
    public PageResult findpage(Integer page, Integer pageSize, design_classify classify) {
        return service.findPage(page, pageSize, classify);

    }

    @ApiOperation("修改分类")
    @RequestMapping("/updateclassify")
    public Response updateclassify(@RequestBody design_classify classify) {
        if (classify.getKindName() != "") {
            design_classify design_classify = service.queryByName(classify);
            classify.setKindName(classify.getName());
            classify.setpId(design_classify.getId());
        } else {
            classify.setKindName(classify.getName());
        }

        try {
            service.updateclassifyById(classify);
            return new Response(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(true, "修改失败");
        }
    }
}
