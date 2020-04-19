package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.service.WorkFlowService;
import cn.ddossec.vo.WorkFlowVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 30315
 * @title: WorkFlowController
 * @projectName erp_parent
 * @description: 工作流控制器
 * @date 2020-04-1814:38
 */
@Controller
@RequestMapping("workFlow")
public class WorkFlowController {

    @Autowired
    private WorkFlowService workFlowService;

    /**
     * 加载部署信息数据
     * @param workFlowVo
     * @return
     */
    @GetMapping("loadAllDeployment")
    @ResponseBody
    public DataGridView loadAllDeployment(WorkFlowVo workFlowVo){
        return this.workFlowService.queryProcessDeploy(workFlowVo);
    }

    /**
     * 加载流程定义信息数据
     * @param workFlowVo
     * @return
     */
    @RequestMapping("loadAllProcessDefinition")
    @ResponseBody
    public DataGridView loadAllProcessDefinition(WorkFlowVo workFlowVo){
        return this.workFlowService.queryloadAllProcessDefinition(workFlowVo);
    }

    /**
     * 添加流程部署
     * @return
     */
    @RequestMapping("addWorkFlow")
    @ResponseBody
    public ResultObj addWorkFlow(MultipartFile mf,WorkFlowVo workFlowVo){
        try{
            this.workFlowService.addWorkFlow(mf.getInputStream(),workFlowVo.getDeploymentName());
            return ResultObj.DEPLOYMENT_SUCCESS;
        }catch (Exception e){
            return ResultObj.DEPLOYMENT_ERROR;
        }
    }

    /**
     * 删除流程部署
     * @param workFlowVo
     * @return
     */
    @RequestMapping("deleteWorkFlow")
    @ResponseBody
    public ResultObj deleteWorkFlow(WorkFlowVo workFlowVo){
        try{
            this.workFlowService.deleteWorkFlow(workFlowVo.getDeploymentId());
            return ResultObj.DELETE_SUCCESS;
        }catch (Exception e){
            return ResultObj.DELETE_ERROR;
        }
    }

}
