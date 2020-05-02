package cn.ddosec.design.controller;

import cn.ddosec.design.entity.PageResult;
import cn.ddosec.design.entity.Response;
import cn.ddosec.design.pojo.product_design_material;
import cn.ddosec.design.service.design_materialService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joker_dj
 * @create 2020-05-01日 14:49
 */
@RestController
@RequestMapping("/design_material")
public class design_materialController {
    @Autowired
    private design_materialService service;

    @RequestMapping("/materialpage")
    public PageResult materialpage(Integer page, Integer pageSize, @RequestBody product_design_material material) {
        return service.findpage(page, pageSize, material);
    }

    @ApiOperation("添加物料")
    @RequestMapping("/addmaterial")
    public Response addmaterial(@RequestBody product_design_material material) {
        try {
            service.addmaterial(material);
            return new Response(true, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "添加失败");
        }
    }

    @ApiOperation("添加物料")
    @RequestMapping("/updatematerial")
    public Response updatematerial(@RequestBody product_design_material material) {
        try {
            service.updatematerial(material);
            return new Response(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "修改失败");
        }
    }
}
