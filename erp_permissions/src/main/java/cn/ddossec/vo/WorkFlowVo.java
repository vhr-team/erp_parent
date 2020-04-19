package cn.ddossec.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkFlowVo extends BaseVo {

    // 流程部署名称
    private String deploymentName;

    //流程部署ID
    private String deploymentId;

}
