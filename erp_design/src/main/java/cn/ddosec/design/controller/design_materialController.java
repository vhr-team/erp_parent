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

import java.util.List;

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

    @ApiOperation("修改物料")
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

    @ApiOperation("查询所有物料")
    @RequestMapping("/selectAll")
    public List<product_design_material> selectAll() {
        return service.selectAll();
    }

    @ApiOperation("根据物料编号查询物料名称")
    @RequestMapping("/selectById")
    public product_design_material selectById(String ID) {
        product_design_material product_design_material = service.selectById(ID);
        return product_design_material;
    }
}
