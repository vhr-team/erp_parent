package cn.ddossec.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author 30315
 * @title: Dept
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-147:25
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_dept")
public class Dept implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 父级部门ID
     */
    @TableField(value = "pid")
    private Integer pid;

    /**
     * 部门名称
     */
    @TableField(value = "title")
    private String title;

    /**
     * 是否展开0不展开1展开
     */
    @TableField(value = "spread")
    private Integer spread;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 状态【0不可用1可用】
     */
    @TableField(value = "available")
    private Integer available;

    /**
     * 排序码【为了调事显示顺序】
     */
    @TableField(value = "ordernum")
    private Integer ordernum;

    /**
     * 创建时间
     */
    @TableField(value = "createtime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    @TableField(exist = false)
    private Boolean open;

    public Boolean getOpen() {
        return this.spread == 1 ? true : false;
    }

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_PID = "pid";

    public static final String COL_TITLE = "title";

    public static final String COL_SPREAD = "spread";

    public static final String COL_REMARK = "remark";

    public static final String COL_ADDRESS = "address";

    public static final String COL_AVAILABLE = "available";

    public static final String COL_ORDERNUM = "ordernum";

    public static final String COL_CREATETIME = "createtime";
}
