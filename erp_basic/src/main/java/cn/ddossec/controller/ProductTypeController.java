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

    /**
     * 添加商品类别
     * @param productType
     * @return
     */
    @PostMapping("addProductType")
    public ResultObj addProductType(@RequestBody ProductType productType) {
        try {
            this.productTypeService.save(productType);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 校验该供应商的类别是否存在
     * @param productType
     * @return
     */
    @PostMapping("checkProductType")
    public Map<String, Object> checkProductType(@RequestBody ProductType productType) {
        Map<String, Object> map = new HashMap<>();
        try {
            ProductType checkProductType = this.productTypeService.checkProductType(productType);
            if (null != checkProductType) {
                map.put("msg", "当前的供应商下的类别已经存在!");
                map.put("code", -1);
            }
        } catch (Exception e) {
        }
        map.put("msg", "类别名称不相同");
        map.put("code", 200);
        return map;
    }

    /**
     * 修改商品类别
     * @param productType
     * @return
     */
    @PostMapping("updateProductType")
    public ResultObj updateProductType(@RequestBody ProductType productType) {
        try {
            this.productTypeService.updateById(productType);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.UPDATE_ERROR;
        }
    }

    /**
     * 删除商品类别
     * @param productTypeId
     * @return
     */
    @GetMapping("deleteProductType")
    public ResultObj deleteProductType(Integer productTypeId) {
        try {
            this.productTypeService.removeById(productTypeId);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 根据供应商ID查询商品类别
     * @param providerid
     * @return
     */
    @GetMapping("queryProductTypeByProviderid")
    public Object queryProductTypeByProviderid(Integer providerid){
        return this.productTypeService.queryProductTypeByProviderid(providerid);
    }
}
