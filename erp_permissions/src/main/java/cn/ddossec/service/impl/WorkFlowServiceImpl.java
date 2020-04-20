package cn.ddossec.service.impl;

import cn.ddossec.common.ActiveUser;
import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.common.toolUtils;
import cn.ddossec.domain.LeaveBill;
import cn.ddossec.domain.User;
import cn.ddossec.mapper.LeavebillMapper;
import cn.ddossec.service.WorkFlowService;
import cn.ddossec.vo.WorkFlowVo;
import cn.ddossec.vo.act.ActDeploymentEntity;
import cn.ddossec.vo.act.ActProcessDefinitionEntity;
import cn.ddossec.vo.act.ActTaskEntity;
import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.*;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.task.Task;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.zip.ZipInputStream;

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

    @Autowired
    private LeavebillMapper leavebillMapper;

    /**
     * 查询流程部署信息
     *
     * @return
     */
    @Override
    public DataGridView queryProcessDeploy(WorkFlowVo workFlowVo) {

        if (workFlowVo.getDeploymentName() == null) {
            workFlowVo.setDeploymentName("");
        }
        String name = workFlowVo.getDeploymentName();
        // 查询总条数
        long count = repositoryService.createDeploymentQuery().deploymentNameLike("%" + name + "%").count();
        // 查询
        int firstResult = (workFlowVo.getPage() - 1) * workFlowVo.getLimit();
        int maxResults = workFlowVo.getLimit();
        List<Deployment> list = repositoryService.createDeploymentQuery().deploymentNameLike("%" + name + "%")
                .listPage(firstResult, maxResults);
        List<ActDeploymentEntity> data = new ArrayList<ActDeploymentEntity>();
        for (Deployment deployment : list) {
            ActDeploymentEntity entity = new ActDeploymentEntity();
            // copy
            BeanUtils.copyProperties(deployment, entity);
            data.add(entity);
        }
        return new DataGridView(count, data);
    }

    @Override
    public DataGridView queryloadAllProcessDefinition(WorkFlowVo workFlowVo) {
        if (workFlowVo.getDeploymentName() == null) {
            workFlowVo.setDeploymentName("");
        }
        String name = workFlowVo.getDeploymentName();
        // 先根据部署的的名称模糊查询出所有的部署的ID
        List<Deployment> dlist = repositoryService.createDeploymentQuery().deploymentNameLike("%" + name + "%").list();
        Set<String> deploymentIds = new HashSet<>();
        for (Deployment deployment : dlist) {
            deploymentIds.add(deployment.getId());
        }
        long count = 0;
        List<ActProcessDefinitionEntity> data = new ArrayList<>();
        if (deploymentIds.size() > 0) {
            count = this.repositoryService.createProcessDefinitionQuery().deploymentIds(deploymentIds).count();
            // 查询流程部署信息
            int firstResult = (workFlowVo.getPage() - 1) * workFlowVo.getLimit();
            int maxResults = workFlowVo.getLimit();
            List<ProcessDefinition> list = this.repositoryService.createProcessDefinitionQuery()
                    .deploymentIds(deploymentIds).listPage(firstResult, maxResults);
            for (ProcessDefinition pd : list) {
                ActProcessDefinitionEntity entity = new ActProcessDefinitionEntity();
                BeanUtils.copyProperties(pd, entity);
                data.add(entity);
            }
        }
        return new DataGridView(count, data);
    }

    /**
     * 添加流程部署
     *
     * @param inputStream
     * @param deploymentName
     */
    @Override
    public void addWorkFlow(InputStream inputStream, String deploymentName) {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        this.repositoryService.createDeployment().name(deploymentName).addZipInputStream(zipInputStream).deploy();

        // 释放资源
        try {
            zipInputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据流程部署ID，删除流程部署信息
     *
     * @param deploymentId
     */
    @Override
    public void deleteWorkFlow(String deploymentId) {
        this.repositoryService.deleteDeployment(deploymentId, true);
    }

    /**
     * 根据流程部署ID查询流程图
     */
    @Override
    public InputStream queryProcessDeploymentImage(String deploymentId) {
        // 1,根据部署ID查询流程定义对象
        ProcessDefinition processDefinition = this.repositoryService.createProcessDefinitionQuery()
                .deploymentId(deploymentId).singleResult();

        // 2从流程定义对象里面得到图片的名称
        String resourceName = processDefinition.getDiagramResourceName();
        // 3使用部署ID和图片名称去查询图片流
        InputStream stream = this.repositoryService.getResourceAsStream(deploymentId, resourceName);
        return stream;
    }

    /**
     * 启动流程
     *
     * @param leaveBillId
     */
    @Override
    public void startProcess(Integer leaveBillId) {
        // 找到流程的key
        String processDefinitionKey = LeaveBill.class.getSimpleName();
        String businessKey = processDefinitionKey + ":" + leaveBillId;

        Map<String, Object> variables = new HashMap<>();
        // 设置流程变量去设置下个任务的办理人
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        User user = activeUser.getUser();
        variables.put("username", user.getName());

        this.runtimeService.startProcessInstanceByKey(processDefinitionKey, businessKey, variables);

        // 更新请假单的状态
        LeaveBill leaveBill = leavebillMapper.selectById(leaveBillId);
        leaveBill.setState(Constant.STATE_LEAVEBILL_ONE);// 设置状态为审批中

        this.leavebillMapper.updateById(leaveBill);
    }

    /**
     * 查询当前登陆人的代办任务
     * @param workFlowVo
     * @return
     */
    @Override
    public DataGridView queryCurrentUserTask(WorkFlowVo workFlowVo) {
        //1,得到办理人信息
        String assignee = toolUtils.getCurrentUser().getName();

        //2,查询总数
        long count = this.taskService.createTaskQuery().taskAssignee(assignee).count();
        //3,查询集合
        int firstResult = (workFlowVo.getPage() - 1) * workFlowVo.getLimit();
        int maxResults = workFlowVo.getLimit();
        List<Task> list = this.taskService.createTaskQuery().taskAssignee(assignee).listPage(firstResult, maxResults);
        List<ActTaskEntity> taskEntities = new ArrayList<>();
        for (Task task : list) {
            ActTaskEntity entity = new ActTaskEntity();
            BeanUtils.copyProperties(task, entity);
            taskEntities.add(entity);
        }
        return new DataGridView(count, taskEntities);
    }


}
