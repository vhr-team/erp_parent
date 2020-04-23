package cn.ddossec.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

/**
 * @author 30315
 * @title: ProductType
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2310:49
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName(value = "bus_product_type")
public class ProductType implements Serializable {
    /**
     * 商品类别ID
     */
    @TableId(value = "product_type_id", type = IdType.AUTO)
    private Integer productTypeId;

    /**
     * 供应商ID
     */
    @TableField(value = "supper_id")
    private Integer supperId;

    /**
     * 商品类别名称
     */
    @TableField(value = "name")
    private String name;

    @TableField(exist = false)
    private String supperName;

    private static final long serialVersionUID = 1L;

    public static final String COL_PRODUCT_TYPE_ID = "product_type_id";

    public static final String COL_SUPPER_ID = "supper_id";

    public static final String COL_NAME = "name";
}
