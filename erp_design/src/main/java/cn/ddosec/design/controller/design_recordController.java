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

    @ApiOperation("分页&&条件查询")
    @RequestMapping("/findPage")
    public PageResult findPage(Integer page, Integer pageSize, @RequestBody product_design_record record) {
        return service.findPage(page, pageSize, record);
    }

    @ApiOperation("修改产品档案")
    @RequestMapping("/updaterecord")
    public Response updaterecord(@RequestBody product_design_record record) {
        try {
            service.updaterecord(record);
            return new Response(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "修改失败");
        }
    }

}
