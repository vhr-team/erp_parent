package com.rbac.design.controller;

import com.rbac.design.entity.PageResult;
import com.rbac.design.entity.Response;
import com.rbac.design.pojo.design_record;
import com.rbac.design.service.design_record_Service;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Response addrecord(@RequestBody design_record record){
        try {
            service.addrecord(record);
            return new Response(true,"添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(true,"添加失败");
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
                return new Response(true, "修改失败");
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
            return new Response(true, "失败");
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
}
