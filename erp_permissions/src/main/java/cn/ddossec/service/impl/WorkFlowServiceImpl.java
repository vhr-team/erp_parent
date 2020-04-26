package cn.ddossec.service.impl;

import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.common.toolUtils;
import cn.ddossec.domain.LeaveBill;
import cn.ddossec.mapper.LeavebillMapper;
import cn.ddossec.service.WorkFlowService;
import cn.ddossec.vo.WorkFlowVo;
import cn.ddossec.vo.act.ActCommentEntity;
import cn.ddossec.vo.act.ActDeploymentEntity;
import cn.ddossec.vo.act.ActProcessDefinitionEntity;
import cn.ddossec.vo.act.ActTaskEntity;
import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.*;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.impl.identity.Authentication;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;
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
        variables.put("username", toolUtils.getCurrentUser().getName());

        this.runtimeService.startProcessInstanceByKey(processDefinitionKey, businessKey, variables);

        // 更新请假单的状态
        LeaveBill leaveBill = leavebillMapper.selectById(leaveBillId);
        leaveBill.setState(Constant.STATE_LEAVEBILL_ONE);// 设置状态为审批中

        this.leavebillMapper.updateById(leaveBill);
    }

    /**
     * 查询当前登陆人的代办任务
     *
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

    /**
     * 根据任务ID查询请假单的信息
     *
     * @param taskId
     * @return
     */
    @Override
    public LeaveBill queryLeaveBillByTaskId(String taskId) {
        // 1,根据任务ID查询任务实例
        Task task = this.taskService.createTaskQuery().taskId(taskId).singleResult();
        // 2,从任务里面取出流程实例ID
        String processInstanceId = task.getProcessInstanceId();
        // 3,根据流程实例ID查询流程实例
        ProcessInstance processInstance = this.runtimeService.createProcessInstanceQuery()
                .processInstanceId(processInstanceId).singleResult();
        // 4,取出business_key
        String businessKey = processInstance.getBusinessKey();// LeaveBill:9
        String leaveBillId = businessKey.split(":")[1];
        return this.leavebillMapper.selectById(Integer.valueOf(leaveBillId));

    }

    /**
     * 根据任务ID查询连线信息
     *
     * @param taskId
     * @return
     */
    @Override
    public List<String> queryOutComeByTaskId(String taskId) {
        List<String> names = new ArrayList<>();
        // 1,根据任务ID查询任务实例
        Task task = this.taskService.createTaskQuery().taskId(taskId).singleResult();
        // 2,取出流程定义ID
        String processDefinitionId = task.getProcessDefinitionId();
        // 3,取出流程实例ID
        String processInstanceId = task.getProcessInstanceId();
        // 4,根据流程实例ID查询流程实例
        ProcessInstance processInstance = this.runtimeService.createProcessInstanceQuery()
                .processInstanceId(processInstanceId).singleResult();
        // 5,根据流程定义ID查询流程定义的XML信息
        ProcessDefinitionEntity processDefinition = (ProcessDefinitionEntity) this.repositoryService
                .getProcessDefinition(processDefinitionId);
        // 6,从流程实例对象里面取出当前活动节点ID
        String activityId = processInstance.getActivityId();// usertask1
        // 7,使用活动ID取出xml和当前活动ID相关节点数据
        ActivityImpl activityImpl = processDefinition.findActivity(activityId);
        // 8,从activityImpl取出连线信息
        List<PvmTransition> transitions = activityImpl.getOutgoingTransitions();
        if (null != transitions && transitions.size() > 0) {
            // PvmTransition就是连接对象
            for (PvmTransition pvmTransition : transitions) {
                String name = pvmTransition.getProperty("name").toString();
                names.add(name);
            }
        }
        return names;
    }

    /**
     * 根据任务ID查询批注信息
     *
     * @param taskId
     * @return
     */
    @Override
    public DataGridView queryCommentByTaskId(String taskId) {
        // 1,根据任务ID查询任务实例
        Task task = this.taskService.createTaskQuery().taskId(taskId).singleResult();
        // 2,从任务里面取出流程实例ID
        String processInstanceId = task.getProcessInstanceId();
        List<Comment> comments = taskService.getProcessInstanceComments(processInstanceId);
        List<ActCommentEntity> data = new ArrayList<>();
        if (null != comments && comments.size() > 0) {
            for (Comment comment : comments) {
                ActCommentEntity entity = new ActCommentEntity();
                BeanUtils.copyProperties(comment, entity);
                data.add(entity);
            }
        }
        return new DataGridView(Long.valueOf(data.size()), data);
    }

    /**
     * 完成任务
     *
     * @param workFlowVo
     */
    @Override
    public void completeTask(WorkFlowVo workFlowVo) {
        String taskId = workFlowVo.getTaskId();// 任务ID
        String outcome = workFlowVo.getOutcome();// 连接名称
        Integer leaveBillId = workFlowVo.getId();// 请假单ID
        String comment = workFlowVo.getComment();// 批注信息

        // 1,根据任务ID查询任务实例
        Task task = this.taskService.createTaskQuery().taskId(taskId).singleResult();
        // 2,从任务里面取出流程实例ID
        String processInstanceId = task.getProcessInstanceId();
        // 设置批注人名
        String userName = toolUtils.getCurrentUser().getName();
        /*
         * 因为批注人是org.activiti.engine.impl.cmd.AddCommentCmd 80代码使用 String userId =
         * Authentication.getAuthenticatedUserId(); CommentEntity comment = new
         * CommentEntity(); comment.setUserId(userId);
         * Authentication这类里面使用了一个ThreadLocal的线程局部变量
         */
        Authentication.setAuthenticatedUserId(userName);
        // 添加批注信息
        this.taskService.addComment(taskId, processInstanceId, "[" + outcome + "]" + comment);
        // 完成任务
        Map<String, Object> variables = new HashMap<>();
        variables.put("outcome", outcome);
        this.taskService.complete(taskId, variables);
        // 判断任务是否结束
        ProcessInstance processInstance = this.runtimeService.createProcessInstanceQuery()
                .processInstanceId(processInstanceId).singleResult();
        if (null == processInstance) {
            LeaveBill leaveBill = new LeaveBill();
            leaveBill.setId(leaveBillId);
            // 说明流程结束
            if (outcome.equals("放弃")) {
                leaveBill.setState(Constant.STATE_LEAVEBILL_THREE);// 已放弃
            } else {
                leaveBill.setState(Constant.STATE_LEAVEBILL_TWO);// 审批完成
            }
            this.leavebillMapper.updateById(leaveBill);
        }
    }

    /**
     * 根据任务ID，查询流程定义对象
     *
     * @param taskId
     * @return
     */
    @Override
    public ProcessDefinition queryProcessDefinitionByTaskId(String taskId) {
        // 1.根据任务ID，查询任务实例
        Task task = this.taskService.createTaskQuery().taskId(taskId).singleResult();

        // 2.取出流程实例ID
        String processInstanceId = task.getProcessInstanceId();

        // 3.根据流程实例ID，查询流程实例对象
        ProcessInstance processInstance = this.runtimeService.createProcessInstanceQuery().processInstanceId(processInstanceId).singleResult();

        // 4.取出流程部署ID
        String processDefinitionId = processInstance.getProcessDefinitionId();

        // 5.查询流程定义对象
        ProcessDefinition processDefinition = this.repositoryService.createProcessDefinitionQuery().processDefinitionId(processDefinitionId).singleResult();
        return processDefinition;
    }

    /**
     * 根据任务ID查询节点坐标
     *
     * @param taskId
     * @return
     */
    @Override
    public Map<String, Object> queryTaskCoordinateByTaskId(String taskId) {
        Map<String, Object> coordinate = new HashMap<>();
        // 1,根据任务ID查询任务实例
        Task task = this.taskService.createTaskQuery().taskId(taskId).singleResult();
        // 2,取出流程定义ID
        String processDefinitionId = task.getProcessDefinitionId();
        // 3,取出流程实例ID
        String processInstanceId = task.getProcessInstanceId();
        // 4,根据流程实例ID查询流程实例
        ProcessInstance processInstance = this.runtimeService.createProcessInstanceQuery()
                .processInstanceId(processInstanceId).singleResult();
        // 5,根据流程定义ID查询流程定义的XML信息
        ProcessDefinitionEntity processDefinition = (ProcessDefinitionEntity) this.repositoryService
                .getProcessDefinition(processDefinitionId);
        // 6,从流程实例对象里面取出当前活动节点ID
        String activityId = processInstance.getActivityId();// usertask1
        // 7,使用活动ID取出xml和当前活动ID相关节点数据
        ActivityImpl activityImpl = processDefinition.findActivity(activityId);
        // 8,从activityImpl取出坐标信息
        coordinate.put("x", activityImpl.getX());
        coordinate.put("y", activityImpl.getY());
        coordinate.put("width", activityImpl.getWidth());
        coordinate.put("height", activityImpl.getHeight());
        return coordinate;
    }

    /**
     * 根据请假单的ID查询批注信息
     * @param id
     * @return
     */
    @Override
    public DataGridView querydCommentByLeaveBillId(Integer id) {
        // 组装businesskey
        String businessKey = LeaveBill.class.getSimpleName() + ":" + id;
        // 根据业务ID查询历史流程实例
        HistoricProcessInstance historicProcessInstance = historyService.createHistoricProcessInstanceQuery()
                .processInstanceBusinessKey(businessKey).singleResult();
        // 使用taskService+流程实例ID查询批注
        List<Comment> comments = this.taskService.getProcessInstanceComments(historicProcessInstance.getId());
        List<ActCommentEntity> data = new ArrayList<>();
        if (null != comments && comments.size() > 0) {
            for (Comment comment : comments) {
                ActCommentEntity entity = new ActCommentEntity();
                BeanUtils.copyProperties(comment, entity);
                data.add(entity);
            }
        }
        return new DataGridView(Long.valueOf(data.size()), data);
    }

}
