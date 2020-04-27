package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.ProductType;
import cn.ddossec.vo.ProductTypeVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author 30315
 * @title: ProductTypeService
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2310:49
 */
public interface ProductTypeService extends IService<ProductType> {

    /**
     * 查询所有类别信息
     *
     * @param productTypeVo
     * @return
     */
    DataGridView ProductType(ProductTypeVo productTypeVo);

    ProductType checkProductType(ProductType productType);

    /**
     * 根据供应商ID查询商品类别
     * @param providerid
     * @return
     */
    Object queryProductTypeByProviderid(Integer providerid);

    /**
     * 查询所有类别
     * @return
     */
    List<ProductType> loadAllProductType();
}
