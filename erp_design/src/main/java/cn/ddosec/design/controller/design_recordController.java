package cn.ddosec.design.controller;

import cn.ddosec.design.entity.PageResult;
import cn.ddosec.design.entity.Response;
import cn.ddosec.design.pojo.product_design_record;
import cn.ddosec.design.service.design_recordService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joker_dj
 * @create 2020-04-30日 10:33
 */
@RestController
@RequestMapping("/design_record")
public class design_recordController {
    @Autowired
    design_recordService service;

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

}
