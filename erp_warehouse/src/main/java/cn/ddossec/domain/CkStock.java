package cn.ddossec.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (CkStock)实体类
 *
 * @author makejava
 * @since 2020-04-17 18:20:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CkStock implements Serializable {
    private static final long serialVersionUID = 644440507641036358L;
    /**
    * 序号
    */
    private Integer id;
    /**
    * 库存id
    */
    private String skId;
    /**
    * 产品id
    */
    private String productId;
    /**
    * 产品名称
    */
    private String productName;
    /**
    * 库存报警上限数
    */
    private Integer skAlarmUpper;
    /**
    * 库存报警下限数
    */
    private Integer skAlarmLower;
    /**
    * 最大存储量
    */
    private Integer skStorageMax;
    /**
    * 当前存储量
    */
    private Integer skStorageCurrent;
    /**
    * 登记人id(user_id)
    */
    private Integer uId;
    /**
    * 登记日期
    */
    private Date skRegisterDate;
    /**
    * 单位
    */
    private String skCompany;
    /**
    * 单价
    */
    private Double skPrice;
    /**
    * 生产日期
    */
    private Date skDate;
    /**
    * 有效期
    */
    private Date skEffectiveDate;
    /**
    * 产品型号
    */
    private String skModel;
    /**
    * 库存量
    */
    private Integer skCount;
    /**
    * 0表示材料，1表示成品
    */
    private Integer skState;

}