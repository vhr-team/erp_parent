package cn.ddossec.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * (CkStock)实体类
 *
 * @author makejava
 * @since 2020-04-17 18:20:00
 */
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

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getSkId() {
        return skId;
    }

    public void setSkId(String skId) {
        this.skId = skId;
    }
    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public Integer getSkAlarmUpper() {
        return skAlarmUpper;
    }

    public void setSkAlarmUpper(Integer skAlarmUpper) {
        this.skAlarmUpper = skAlarmUpper;
    }
    
    public Integer getSkAlarmLower() {
        return skAlarmLower;
    }

    public void setSkAlarmLower(Integer skAlarmLower) {
        this.skAlarmLower = skAlarmLower;
    }
    
    public Integer getSkStorageMax() {
        return skStorageMax;
    }

    public void setSkStorageMax(Integer skStorageMax) {
        this.skStorageMax = skStorageMax;
    }
    
    public Integer getSkStorageCurrent() {
        return skStorageCurrent;
    }

    public void setSkStorageCurrent(Integer skStorageCurrent) {
        this.skStorageCurrent = skStorageCurrent;
    }
    
    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
    }
    
    public Date getSkRegisterDate() {
        return skRegisterDate;
    }

    public void setSkRegisterDate(Date skRegisterDate) {
        this.skRegisterDate = skRegisterDate;
    }
    
    public String getSkCompany() {
        return skCompany;
    }

    public void setSkCompany(String skCompany) {
        this.skCompany = skCompany;
    }
    
    public Double getSkPrice() {
        return skPrice;
    }

    public void setSkPrice(Double skPrice) {
        this.skPrice = skPrice;
    }
    
    public Date getSkDate() {
        return skDate;
    }

    public void setSkDate(Date skDate) {
        this.skDate = skDate;
    }
    
    public Date getSkEffectiveDate() {
        return skEffectiveDate;
    }

    public void setSkEffectiveDate(Date skEffectiveDate) {
        this.skEffectiveDate = skEffectiveDate;
    }
    
    public String getSkModel() {
        return skModel;
    }

    public void setSkModel(String skModel) {
        this.skModel = skModel;
    }
    
    public Integer getSkCount() {
        return skCount;
    }

    public void setSkCount(Integer skCount) {
        this.skCount = skCount;
    }
    
    public Integer getSkState() {
        return skState;
    }

    public void setSkState(Integer skState) {
        this.skState = skState;
    }

}