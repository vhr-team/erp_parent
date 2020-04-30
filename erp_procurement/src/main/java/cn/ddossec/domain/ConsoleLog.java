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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "bus_consoleLog")
public class ConsoleLog implements Serializable {
    /**
     * 日志编号
     */
    @TableId(value = "log_id", type = IdType.AUTO)
    private Integer logId;

    /**
     * 实体ID
     */
    @TableField(value = "entity_id")
    private Integer entityId;

    /**
     * 表名
     */
    @TableField(value = "table_name")
    private String tableName;

    /**
     * 操作类型
     */
    @TableField(value = "opt_type")
    private String optType;

    /**
     * 时间
     */
    @TableField(value = "opt_time")
    private Date optTime;

    /**
     * 操作人员
     */
    @TableField(value = "emp_id")
    private Integer empId;

    /**
     * 备注
     */
    @TableField(value = "note")
    private String note;

    private static final long serialVersionUID = 1L;

    public static final String COL_LOG_ID = "log_id";

    public static final String COL_ENTITY_ID = "entity_id";

    public static final String COL_TABLE_NAME = "table_name";

    public static final String COL_OPT_TYPE = "opt_type";

    public static final String COL_OPT_TIME = "opt_time";

    public static final String COL_EMP_ID = "emp_id";

    public static final String COL_NOTE = "note";
}