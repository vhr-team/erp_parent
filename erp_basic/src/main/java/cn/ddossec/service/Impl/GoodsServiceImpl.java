package cn.ddossec.service.Impl;

import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Basics_supper;
import cn.ddossec.domain.Goods;
import cn.ddossec.domain.ProductType;
import cn.ddossec.mapper.Basics_supperMapper;
import cn.ddossec.mapper.GoodsMapper;
import cn.ddossec.mapper.ProductTypeMapper;
import cn.ddossec.service.GoodsService;
import cn.ddossec.vo.GoodsVo;
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
 * @title: GoodsServiceImpl
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2410:14
 */
@Service
@Transactional
@Slf4j
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Autowired
    private Basics_supperMapper basics_supperMapper;

    /**
     * 查询所有商品，可以带查询条件
     *
     * @param goodsVo
     * @return
     */
    @Override
    public DataGridView queryAllGoods(GoodsVo goodsVo) {
        // 1.分页
        IPage<Goods> page = new Page<>(goodsVo.getPage(), goodsVo.getPageSize());

        // 2.设置查询条件
        QueryWrapper<Goods> qw = new QueryWrapper<>();
        qw.eq("available", Constant.AVAILABLE_TRUE);
        qw.eq(null != goodsVo.getProviderid(), "providerid", goodsVo.getProviderid());
        qw.eq(null != goodsVo.getProducttypeid(), "productTypeId", goodsVo.getProducttypeid());

        qw.ge(null != goodsVo.getMinInPrice(), "inprice", goodsVo.getMinInPrice());
        qw.le(null != goodsVo.getMaxInPrice(), "inprice", goodsVo.getMaxInPrice());

        qw.ge(null != goodsVo.getMinOutPrice(), "price", goodsVo.getMinOutPrice());
        qw.le(null != goodsVo.getMaxOutPrice(), "price", goodsVo.getMaxOutPrice());

        qw.like(StringUtils.isNotBlank(goodsVo.getGoodsname()), "goodsname", goodsVo.getGoodsname());
        qw.like(StringUtils.isNotBlank(goodsVo.getUnit()), "unit", goodsVo.getUnit());
        qw.like(StringUtils.isNotBlank(goodsVo.getProducer()), "producer", goodsVo.getProducer());
        qw.like(StringUtils.isNotBlank(goodsVo.getSize()), "size", goodsVo.getSize());
        qw.like(StringUtils.isNotBlank(goodsVo.getProductcode()), "productcode", goodsVo.getProductcode());
        qw.like(StringUtils.isNotBlank(goodsVo.getPromitcode()), "promitcode", goodsVo.getPromitcode());
        qw.like(StringUtils.isNotBlank(goodsVo.getDescription()), "description", goodsVo.getDescription());

        this.baseMapper.selectPage(page, qw);
        List<Goods> goodsList = page.getRecords();

        for (Goods goods : goodsList) {
            // 3.翻译供应商
            List<Basics_supper> supperList = this.basics_supperMapper.findAll();
            for (Basics_supper supper : supperList) {
                if (null != goods.getProviderid() && goods.getProviderid().equals(supper.getId())) {
                    goods.setProvidername(supper.getName());
                }
            }

            // 4.翻译商品类别
            List<ProductType> productTypeList = productTypeMapper.selectList(null);
            for (ProductType type : productTypeList) {
                if (null != goods.getProducttypeid() && goods.getProducttypeid().equals(type.getProductTypeId())) {
                    goods.setProductname(type.getName());
                }
            }
        }

        return new DataGridView(page.getTotal(), goodsList);
    }
}
