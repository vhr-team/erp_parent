package cn.ddossec.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 30315
 * @title: Goods
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2410:14
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "bus_goods")
public class Goods implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "goodsname")
    private String goodsname;

    @TableField(value = "produceplace")
    private String produceplace;

    @TableField(value = "size")
    private String size;

    @TableField(value = "goodspackage")
    private String goodspackage;

    @TableField(value = "productcode")
    private String productcode;

    @TableField(value = "promitcode")
    private String promitcode;

    @TableField(value = "description")
    private String description;

    @TableField(value = "price")
    private Double price;

    @TableField(value = "number")
    private Integer number;

    @TableField(value = "dangernum")
    private Integer dangernum;

    @TableField(value = "goodsimg")
    private String goodsimg;

    @TableField(value = "available")
    private Integer available;

    /**
     *  商品进货价
     */
    @TableField(value = "inprice")
    private Double inprice;

    /**
     * 供应商ID
     */
    @TableField(value = "providerid")
    private Integer providerid;

    /**
     * 供应商名称
     */
    @TableField(exist = false)
    private String providername;

    /**
     * 商品类别
     */
    @TableField(value = "productTypeId")
    private Integer producttypeid;

    /**
     * 商品类别名称
     */
    @TableField(exist = false)
    private String productname;

    /**
     * 生产厂家
     */
    @TableField(value = "producer")
    private String producer;

    /**
     * 商品单位
     */
    @TableField(value = "unit")
    private String unit;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_GOODSNAME = "goodsname";

    public static final String COL_PRODUCEPLACE = "produceplace";

    public static final String COL_SIZE = "size";

    public static final String COL_GOODSPACKAGE = "goodspackage";

    public static final String COL_PRODUCTCODE = "productcode";

    public static final String COL_PROMITCODE = "promitcode";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_PRICE = "price";

    public static final String COL_NUMBER = "number";

    public static final String COL_DANGERNUM = "dangernum";

    public static final String COL_GOODSIMG = "goodsimg";

    public static final String COL_AVAILABLE = "available";

    public static final String COL_PROVIDERID = "providerid";

    public static final String COL_PRODUCTTYPEID = "productTypeId";

    public static final String COL_PRODUCER = "producer";

    public static final String COL_UNIT = "unit";
}
