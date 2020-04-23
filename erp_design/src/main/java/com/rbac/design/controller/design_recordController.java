package com.rbac.design.controller;

import com.rbac.design.entity.PageResult;
import com.rbac.design.entity.Response;
import com.rbac.design.entity.miutichecker;
import com.rbac.design.pojo.design_classify;
import com.rbac.design.pojo.design_record;
import com.rbac.design.service.design_classifyService;
import com.rbac.design.service.design_record_Service;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @Autowired
    design_classifyService classifyService;

    /**
     * 查询所有产品档案
     */
    @GetMapping("/design_recordAll")
    @ApiOperation("查询所有产品档案")
    public List<design_record> design_recordAll() {
        return service.queryAll();
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
    @ApiOperation("分页查询")
    public PageResult findPage(Integer page, Integer pageSize, design_record record) {
        PageResult list = service.findPage(page, pageSize, record);
        return list;
    }

    /**
     * 添加产品档案
     * @param record 添加的产品集合
     * @return
     */
    @PostMapping("/addrecord")
    @ApiOperation("添加产品档案")
    public Response addrecord(@RequestBody design_record record) {
        design_classify classify1 = new design_classify();
        classify1.setKindName(record.getFirstKindName());
        design_classify one = classifyService.queryByName(classify1);
        /*获取分类id*/
        design_classify classify2 = new design_classify();
        classify2.setKindName(record.getSecondKindName());
        design_classify two = classifyService.queryByName(classify2);
        /*设置分类id*/
        record.setFirstKindId(one.getId().toString());
        record.setSecondKindId(two.getId().toString());

        Date date = new Date();
        Object time = date.getTime();
        String priductId = time.toString();
        /*设置产品id*/
        record.setProductId(priductId);
        System.out.println(record);
        try {
            service.addrecord(record);
            return new Response(true, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "添加失败");
        }
    }

    /**
     * 根据主键修改
     * @param record
     * @return
     */
    @ApiOperation("根据主键修改")
    @RequestMapping("/updaterecordById")
    public Response updaterecordById(@RequestBody design_record record) {
        design_record design_record = service.selectById(record);
        if (record.getRealCostPrice() != design_record.getRealCostPrice()) {
            record.setPriceChangeTag("已变更");
        }

        if (design_record == record) {
            return new Response(true, "请修改值在提交");
        } else {
            try {
                service.updaterecordById(record);
                return new Response(true, "修改成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Response(false, "修改失败");
            }
        }

    }


    @ApiOperation("上下架商品")
    @PostMapping("/putawayrecord")
    public Response putawayrecord(@RequestBody design_record record) {
        try {
            service.putawayrecord(record);
            return new Response(true, "成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "失败");
        }
    }

    @RequestMapping("/deletebatch")
    public Response deletebatch(@RequestBody Integer[] idx) {

        try {
            service.deletebatch(idx);
            return new Response(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "删除失败");
        }

    }


    /**
     * 查询未审核的产品
     *
     * @param page     页码
     * @param pageSize 行数
     * @param record   传入的查询值
     * @return 总记录数 查询的数据
     */
    @RequestMapping("/reloadcheck")
    @ApiOperation("查询未审核的产品")
    public PageResult reloadcheck(Integer page, Integer pageSize, design_record record) {
        PageResult list = service.reloadcheck(page, pageSize, record);
        return list;
    }

    @RequestMapping("/check")
    public Response check(design_record record) {
        try {
            service.check(record);
            return new Response(false, "审核成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "审核失败");
        }
    }

    @RequestMapping("/checkmiuti")
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
