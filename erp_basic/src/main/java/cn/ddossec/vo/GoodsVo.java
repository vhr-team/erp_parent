package cn.ddossec.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 30315
 * @title: ProductTypeVo
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2311:45
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class GoodsVo extends BaseVo {

    /**
     * 供应商ID
     */
    private Integer providerid;

    /**
     * 商品名称
     */
    private String goodsname;
    private String size;
    private String productcode;
    private String promitcode;
    private String description;

    /**
     * 商品类别ID
     */
    private Integer producttypeid;

    /**
     * 生产厂家
     */
    private String producer;

    /**
     * 商品单位
     */
    private String unit;

    /**
     *  商品进货价
     */
    private Double minInPrice;
    private Double maxInPrice;

    /**
     *  商品销售价
     */
    private Double minOutPrice;
    private Double maxOutPrice;
}
