package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.vo.WorkFlowVo;

import java.io.InputStream;

/**
 * @author 30315
 * @title: WorkFlowService
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1814:40
 */
public interface WorkFlowService {

    public DataGridView queryProcessDeploy(WorkFlowVo workFlowVo);

    /**
     * 查询所有流程定义
     * @param workFlowVo
     * @return
     */
    DataGridView queryloadAllProcessDefinition(WorkFlowVo workFlowVo);

    /**
     * 添加流程部署
     * @param inputStream
     * @param deploymentName
     */
    void addWorkFlow(InputStream inputStream, String deploymentName);

    /**
     * 根据流程部署ID，删除流程部署信息
     * @param deploymentId
     */
    void deleteWorkFlow(String deploymentId);
}
