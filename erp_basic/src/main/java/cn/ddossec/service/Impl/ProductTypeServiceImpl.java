package cn.ddossec.service.Impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Basics_supper;
import cn.ddossec.domain.ProductType;
import cn.ddossec.mapper.Basics_supperMapper;
import cn.ddossec.mapper.ProductTypeMapper;
import cn.ddossec.service.ProductTypeService;
import cn.ddossec.vo.ProductTypeVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 30315
 * @title: ProductTypeServiceImpl
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2310:49
 */
@Service
@Transactional
@Slf4j
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements ProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Autowired
    private Basics_supperMapper basics_supperMapper;

    @Override
    public DataGridView ProductType(ProductTypeVo productTypeVo) {
        // 设置分页
        IPage<ProductType> page = new Page<>(productTypeVo.getPage(), productTypeVo.getPageSize());

        // 设置查询条件
        QueryWrapper<ProductType> qw = new QueryWrapper<>();
        qw.eq(null != productTypeVo.getSupperId(), "supper_id", productTypeVo.getSupperId());
        qw.like(StringUtils.isNotBlank(productTypeVo.getName()), "name", productTypeVo.getName());

        // 排序
        qw.orderByDesc("product_type_id");

        this.productTypeMapper.selectPage(page, qw);
        List<ProductType> typeList = page.getRecords();

        // 查询供应商
        List<Basics_supper> allBasics_supper = this.basics_supperMapper.findAllBasics_supper();

        // 设置类别供应商的名称
        for (ProductType type : typeList) {
            for (Basics_supper supper : allBasics_supper) {
                if (type.getSupperId().equals(supper.getId())) {
                    type.setSupperName(supper.getName());
                }
            }
        }

        return new DataGridView(page.getTotal(),typeList);
    }
}
