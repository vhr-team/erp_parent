package cn.ddosec.design.controller;


import cn.ddosec.design.entity.PageResult;
import cn.ddosec.design.entity.Response;
import cn.ddosec.design.pojo.product_design_record;
import cn.ddosec.design.pojo.product_material_archives;
import cn.ddosec.design.service.design_recordService;
import cn.ddosec.design.service.material_archivesService;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author joker_dj
 * @create 2020-04-30日 10:33
 */
@RestController
@RequestMapping("/design_record")
public class design_recordController {
    @Autowired
    design_recordService service;
    @Autowired
    material_archivesService material_archivesservice;




    /**
     * 根据ID查询档案
     *
     * @param Id
     * @return
     */
    @ApiOperation("根据ID查询档案")
    @RequestMapping("/selectById")
    public product_design_record selectById(Integer Id) {
        return service.selectById(Id);
    }

    @ApiOperation("分页&&条件查询")
    @RequestMapping("/findPage")
    public PageResult findPage(Integer page, Integer pageSize, @RequestBody product_design_record record) {
        return service.findPage(page, pageSize, record);
    }

    @ApiOperation("修改产品档案")
    @RequestMapping("/updaterecord")
    public Response updaterecord(@RequestBody product_design_record record) {
        try {
            product_design_record product_design_record = selectById(record.getId());//根据id获取当前商品信息
            record.setFileChangeAmount(product_design_record.getFileChangeAmount() + 1);//增加修改次数
            service.updaterecord(record);
            return new Response(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "修改失败");
        }
    }

    @ApiOperation("添加产品档案")
    @RequestMapping("/addrecord")
    public Response addrecord(@RequestBody product_design_record record) {
        try {
            service.addrecord(record);
            return new Response(true, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "添加失败");
        }
    }

    @ApiOperation("分页&&条件查询已回收的档案")
    @RequestMapping("/findPagerecycle")
    public PageResult findPagerecycle(Integer page, Integer pageSize, @RequestBody product_design_record record) {
        return service.findPagerecycle(page, pageSize, record);
    }

    /**
     * 档案回收
     *
     * @param record
     * @return
     */
    @RequestMapping("/deleterecord")
    public Response deleterecord(@RequestBody product_design_record record) {
        try {
            service.deleterecord(record);
            return new Response(true, "回收成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "回收失败");
        }
    }

    /**
     * 档案恢复
     *
     * @param record
     */
    @ApiOperation("档案恢复")
    @RequestMapping("/recordrecover")
    public Response recordrecover(@RequestBody product_design_record record) {
        try {
            service.recordrecover(record);
            return new Response(true, "恢复成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "恢复失败");
        }
    }

    @ApiOperation("查询已回收的数量")
    @RequestMapping("/recovernum")
    public int recovernum() {
        return service.recovernum();
    }


    @ApiOperation("查询审核状态")
    @RequestMapping("/findPagecheck")
    public PageResult findPagecheck(Integer page, Integer pageSize, @RequestBody product_design_record record) {
        return service.findPagecheck(page, pageSize, record);
    }

    @ApiOperation("查询没有物料组成id的档案")
    @RequestMapping("/notconstitute")
    public PageResult notconstitute(Integer page, Integer pageSize, @RequestBody product_design_record record) {
        return service.notconstitute(page, pageSize, record);
    }

    /**
     * 查询物料组成
     *
     * @param materielArchivesId
     * @return
     */
    @RequestMapping("/selectBymaterielArchivesId")
    public List<product_material_archives> selectBymaterielArchivesId(String materielArchivesId) {
        return material_archivesservice.selectBymaterielArchivesId(materielArchivesId);
    }


    @ApiOperation("档案审核")
    @RequestMapping("/updatecheck")
    public Response updatecheck(@RequestBody product_design_record record) {
        System.out.println(record);
        try {
            service.updatechecker(record);
            return new Response(true, "审核成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "审核失败");
        }
    }
}
