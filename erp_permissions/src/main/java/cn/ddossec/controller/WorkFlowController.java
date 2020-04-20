package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.LeaveBill;
import cn.ddossec.service.WorkFlowService;
import cn.ddossec.vo.WorkFlowVo;
import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.List;

/**
 * @author 30315
 * @title: WorkFlowController
 * @projectName erp_parent
 * @description: 工作流控制器
 * @date 2020-04-1814:38
 */
@Controller
@RequestMapping("workFlow")
@Slf4j
public class WorkFlowController {

    @Autowired
    private WorkFlowService workFlowService;

    /**
     * 加载部署信息数据
     *
     * @param workFlowVo
     * @return
     */
    @GetMapping("loadAllDeployment")
    @ResponseBody
    public DataGridView loadAllDeployment(WorkFlowVo workFlowVo) {
        return this.workFlowService.queryProcessDeploy(workFlowVo);
    }

    /**
     * 加载流程定义信息数据
     *
     * @param workFlowVo
     * @return
     */
    @RequestMapping("loadAllProcessDefinition")
    @ResponseBody
    public DataGridView loadAllProcessDefinition(WorkFlowVo workFlowVo) {
        return this.workFlowService.queryloadAllProcessDefinition(workFlowVo);
    }

    /**
     * 添加流程部署
     *
     * @return
     */
    @RequestMapping("addWorkFlow")
    @ResponseBody
    public ResultObj addWorkFlow(MultipartFile mf, WorkFlowVo workFlowVo) {
        try {
            this.workFlowService.addWorkFlow(mf.getInputStream(), workFlowVo.getDeploymentName());
            return ResultObj.DEPLOYMENT_SUCCESS;
        } catch (Exception e) {
            return ResultObj.DEPLOYMENT_ERROR;
        }
    }

    /**
     * 删除流程部署
     *
     * @param workFlowVo
     * @return
     */
    @RequestMapping("deleteWorkFlow")
    @ResponseBody
    public ResultObj deleteWorkFlow(WorkFlowVo workFlowVo) {
        try {
            this.workFlowService.deleteWorkFlow(workFlowVo.getDeploymentId());
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 批量删除流程部署
     *
     * @param workFlowVo
     * @return
     */
    @RequestMapping("batchDeleteWorkFlow")
    @ResponseBody
    public ResultObj batchDeleteWorkFlow(WorkFlowVo workFlowVo) {
        try {
            String[] deploymentIds = workFlowVo.getIds();
            for (String deploymentId : deploymentIds) {
                this.workFlowService.deleteWorkFlow(deploymentId);
            }
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 查看流程图
     */
    @RequestMapping("viewProcessImage")
    public void viewProcessImage(WorkFlowVo workFlowVo, HttpServletResponse response) {
        InputStream stream = this.workFlowService.queryProcessDeploymentImage(workFlowVo.getDeploymentId());
        try {
            //可以不用直接，把二进制流存到response对象里，然后前端可以直接取出来使用
            BufferedImage image = ImageIO.read(stream);
            ServletOutputStream outputStream = response.getOutputStream();

            ImageIO.write(image, "JPEG", outputStream);
            stream.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 启动流程
     */
    @RequestMapping("startProcess")
    @ResponseBody
    public ResultObj startProcess(WorkFlowVo workFlowVo) {
        try {
            Integer leaveBillId = workFlowVo.getId();
            this.workFlowService.startProcess(leaveBillId);
            return ResultObj.START_SUCCESS;
        } catch (Exception e) {
            return ResultObj.START_ERROR;
        }
    }

    /**
     * 查询当前登陆人的代办任务
     */
    @RequestMapping("loadCurrentUserTask")
    @ResponseBody
    public DataGridView loadCurrentUserTask(WorkFlowVo workFlowVo) {
        return this.workFlowService.queryCurrentUserTask(workFlowVo);
    }

    /**
     * 根据任务ID查询请假单的信息
     *
     * @param workFlowVo
     * @return
     */
    @GetMapping("queryLeaveBillByTaskId")
    @ResponseBody
    public LeaveBill queryLeaveBillByTaskId(WorkFlowVo workFlowVo) {
        return this.workFlowService.queryLeaveBillByTaskId(workFlowVo.getTaskId());
    }

    /**
     * 根据任务ID查询连线信息
     *
     * @return
     */
    @GetMapping("queryOutComeByTaskId")
    @ResponseBody
    public List<String> queryOutComeByTaskId(WorkFlowVo workFlowVo) {
        return this.workFlowService.queryOutComeByTaskId(workFlowVo.getTaskId());
    }

    /**
     * 根据任务ID查询批注信息
     *
     * @param workFlowVo
     * @return
     */
    @GetMapping("loadAllCommentByTaskId")
    @ResponseBody
    public DataGridView loadAllCommentByTaskId(WorkFlowVo workFlowVo) {
        return this.workFlowService.queryCommentByTaskId(workFlowVo.getTaskId());
    }


    /**
     * 完成任务
     *
     * @param workFlowVo
     * @return
     */
    @RequestMapping("doTask")
    @ResponseBody
    public ResultObj doTask(WorkFlowVo workFlowVo) {
        try {
            this.workFlowService.completeTask(workFlowVo);
            return ResultObj.TASK_START_SUCCESS;
        } catch (Exception e) {
            return ResultObj.TASK_START_ERROR;
        }
    }

    /**
     * 根据任务ID查看流程进度图
     * @param workFlowVo
     */
    @GetMapping("ViewProcessByTaskId")
    @ResponseBody
    public String ViewProcessByTaskId(WorkFlowVo workFlowVo,HttpServletResponse response) {

        ProcessDefinition processDefinition = this.workFlowService.queryProcessDefinitionByTaskId(workFlowVo.getTaskId());

        //取出流程部署ID
        String deploymentId = processDefinition.getDeploymentId();
        workFlowVo.setDeploymentId(deploymentId);

        return deploymentId;
    }

}
