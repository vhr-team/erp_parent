package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.vo.WorkFlowVo;

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
}
