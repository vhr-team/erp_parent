package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.service.ProductTypeService;
import cn.ddossec.vo.ProductTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 30315
 * @title: ProductTypeController
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2311:46
 */
@RequestMapping("productType")
@RestController
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    /**
     * 查询所有类别信息
     * @param productTypeVo
     * @return
     */
    @GetMapping("queryAllProductType")
    public DataGridView ProductType(ProductTypeVo productTypeVo){
        return this.productTypeService.ProductType(productTypeVo);
    }

}
