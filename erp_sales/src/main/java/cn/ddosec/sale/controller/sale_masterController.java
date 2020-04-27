package cn.ddosec.sale.controller;

import cn.ddosec.sale.entity.PageResult;
import cn.ddosec.sale.service.sale_masterService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joker_dj
 * @create 2020-04-27日 13:39
 */
@RestController
@RequestMapping("/salemaster")
public class sale_masterController {
    @Autowired
    private sale_masterService service;

    @RequestMapping("/findPage")
    @ApiOperation("分页查询销售主表")
    public PageResult findPage(Integer page, Integer pageSize) {

        PageResult page1 = service.findPage(page, pageSize);
        return service.findPage(page, pageSize);
    }

}
