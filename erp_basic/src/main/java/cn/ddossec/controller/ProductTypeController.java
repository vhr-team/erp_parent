package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.ProductType;
import cn.ddossec.service.ProductTypeService;
import cn.ddossec.vo.ProductTypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 30315
 * @title: ProductTypeController
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2311:46
 */
@RequestMapping("productType")
@RestController
@Slf4j
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    /**
     * 查询所有类别信息
     *
     * @param productTypeVo
     * @return
     */
    @GetMapping("queryAllProductType")
    public DataGridView ProductType(ProductTypeVo productTypeVo) {
        return this.productTypeService.ProductType(productTypeVo);
    }

    @PostMapping("addProductType")
    public ResultObj addProductType(@RequestBody ProductType productType) {
        try {
            this.productTypeService.save(productType);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            return ResultObj.ADD_ERROR;
        }
    }

    @PostMapping("checkProductType")
    public Map<String, Object> checkProductType(ProductType productType) {
        Map<String, Object> map = new HashMap<>();
        try {
            this.productTypeService.checkProductType(productType);
        } catch (Exception e) {
            map.put("msg", )
        }
        return map;
    }

}
