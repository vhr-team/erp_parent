package cn.ddossec.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (WarehouseStock)实体类
 *
 * @author 谷辉
 * @since 2020-04-19 15:05:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseStock implements Serializable {
    private static final long serialVersionUID = -25726372263747358L;
    /**
    * 序号
    */
    private Integer id;
    /**
    * 库存编号
    */
    private String stockId;
    /**
    * 产品编号
    */
    private String productId;
    /**
    * 产品名称
    */
    private String productName;
    /**
    * 产品一级分类编号
    */
    private String firstKindId;
    /**
    * 产品一级分类名称
    */
    private String firstKindName;
    /**
    * 产品二级分类编号
    */
    private String secondKindId;
    /**
    * 产品二级分类名称
    */
    private String secondKindName;
    /**
    * 库存报警下限数
    */
    private Integer minAmount;
    /**
    * 库存报警上限数
    */
    private Integer maxAmount;
    /**
    * 最大存储量
    */
    private Integer maxCapacityAmount;
    /**
    * 当前存储量
    */
    private Integer amount;
    /**
    * 配置要求
    */
    private String config;
    /**
    * 登记人
    */
    private String register;
    /**
    * 登记时间
    */
    private Date registerTime;
    /**
    * 复核人
    */
    private String checker;
    /**
    * 复核时间
    */
    private Date checkTime;
    /**
    * 复核标志
    */
    private String checkTag;

}