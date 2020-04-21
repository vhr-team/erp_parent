package cn.ddossec.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkFlowVo extends BaseVo {

    //批量删除使用
    private String[] ids;

    // 流程部署名称
    private String deploymentName;

    //流程部署ID
    private String deploymentId;

    //请假单ID
    private Integer id;

    //任务ID
    private String taskId;

    // 连接名称
    private String outcome;

    // 批注信息
    private String comment;

}
