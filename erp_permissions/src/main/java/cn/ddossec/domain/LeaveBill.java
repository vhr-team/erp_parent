package cn.ddossec.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
    * @title: Leavebill
    * @projectName erp_parent
    * @description: TODO
    * @author 30315
    * @date 2020-04-1720:29
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_leavebill")
public class LeaveBill implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "title")
    private String title;

    @TableField(value = "content")
    private String content;

    @TableField(value = "days")
    private Double days;

    @TableField(value = "leavetime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date leavetime;

    /**
     * 1,新建  2，已提交   3，审批中  4，审批完成
     */
    @TableField(value = "state")
    private String state;

    @TableField(value = "userid")
    private Integer userid;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_TITLE = "title";

    public static final String COL_CONTENT = "content";

    public static final String COL_DAYS = "days";

    public static final String COL_LEAVETIME = "leavetime";

    public static final String COL_STATE = "state";

    public static final String COL_USERID = "userid";
}
