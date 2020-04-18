package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.service.WorkFlowService;
import cn.ddossec.vo.WorkFlowVo;
import cn.ddossec.vo.act.ActDeploymentEntity;
import cn.ddossec.vo.act.ActProcessDefinitionEntity;
import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.*;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 30315
 * @title: WorkFlowServiceImpl
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1814:41
 */
@Service
@Transactional
@Slf4j
public class WorkFlowServiceImpl implements WorkFlowService {

    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HistoryService historyService;
    @Autowired
    private IdentityService identityService;
    @Autowired
    private FormService formService;
    @Autowired
    private ManagementService managementService;

    /**
     * 查询流程部署信息
     * @return
     */
    @Override
    public DataGridView queryProcessDeploy(WorkFlowVo workFlowVo){

        if(workFlowVo.getDeploymentName()==null){
            workFlowVo.setDeploymentName("");
        }
        String name = workFlowVo.getDeploymentName();
        // 1.查询总条数
        long count = repositoryService.createDeploymentQuery().deploymentNameLike("%" + name + "%").count();
        // 2.查询
        int firstResult = workFlowVo.getLimit();
        int maxResults = (workFlowVo.getPage()-1)*workFlowVo.getLimit();
        List<Deployment> list = repositoryService.createDeploymentQuery().deploymentNameLike("%" + name + "%").listPage(firstResult, maxResults);
        List<ActDeploymentEntity> data = new ArrayList<>();

        for (Deployment deployment : list) {
            // copy
            ActDeploymentEntity entity = new ActDeploymentEntity();
            BeanUtils.copyProperties(deployment, entity);
            data.add(entity);
        }

        return new DataGridView(count,data);
    }

    @Override
    public DataGridView queryloadAllProcessDefinition(WorkFlowVo workFlowVo) {
        if(workFlowVo.getDeploymentName()==null){
            workFlowVo.setDeploymentName("");
        }
        String name = workFlowVo.getDeploymentName();
        // 先根据部署的名称模糊查询出所有的部署的ID
        List<Deployment> list = repositoryService.createDeploymentQuery().deploymentNameLike("%" + name + "%").list();
        Set<String> deploymentIds = new HashSet<>();
        for (Deployment deployment : list) {
            deploymentIds.add(deployment.getId());
        }
        long count = 0;
        List<ActProcessDefinitionEntity> data = new ArrayList<>();
        if(deploymentIds.size() > 0){
            count = this.repositoryService.createProcessDefinitionQuery().deploymentIds(deploymentIds).count();
            int firstResult = workFlowVo.getLimit();
            int maxResults = (workFlowVo.getPage()-1)*workFlowVo.getLimit();
            List<ProcessDefinition> listPage = this.repositoryService.createProcessDefinitionQuery().deploymentIds(deploymentIds).listPage(firstResult, maxResults);

            for (ProcessDefinition processDefinition : listPage) {
                ActProcessDefinitionEntity entity = new ActProcessDefinitionEntity();
                BeanUtils.copyProperties(processDefinition, entity);
                data.add(entity);
            }
        }

        return new DataGridView(count,data);
    }

}
