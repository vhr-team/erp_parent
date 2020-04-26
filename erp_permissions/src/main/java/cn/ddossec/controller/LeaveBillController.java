package cn.ddossec.controller;

import cn.ddossec.common.ActiveUser;
import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.LeaveBill;
import cn.ddossec.domain.User;
import cn.ddossec.service.LeavebillService;
import cn.ddossec.vo.LeaveBillVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("leaveBill")
public class LeaveBillController {

    @Autowired
    private LeavebillService leaveBillService;

    /**
     * 加载请假单列表
     */
    @RequestMapping("loadAllLeaveBills")
    @ResponseBody
    public DataGridView loadAllLeaveBills(LeaveBillVo leaveBillVo) {
        // 得到当前登陆的用户
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        User user = activeUser.getUser();
        // 如果是超级管理员查询全部
        if (user.getType().equals(Constant.USER_TYPE_SUPER)) {
            return this.leaveBillService.queryAllLeaveBills(leaveBillVo);
        } else {
            leaveBillVo.setUserid(user.getId());
            return this.leaveBillService.queryAllLeaveBills(leaveBillVo);
        }
    }

    /**
     * 添加
     */
    @RequestMapping("addLeaveBill")
    @ResponseBody
    public ResultObj addLeaveBill(LeaveBill leavebill) {
        try {
            leavebill.setState("0");
            // 得到当前登陆的用户
            Subject subject = SecurityUtils.getSubject();
            ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
            User user = activeUser.getUser();

            leavebill.setUserid(user.getId());
            this.leaveBillService.addLeaveBill(leavebill);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            return ResultObj.ADD_ERROR;
        }
    }

    @RequestMapping("toUpdateLeaveBill")
    public LeaveBill toUpdateLeaveBill(LeaveBillVo leaveBillVo) {
        LeaveBill leaveBill = this.leaveBillService.queryLeaveBillById(leaveBillVo.getId());
        return leaveBill;
    }

    /**
     * 修改
     */
    @RequestMapping("updateLeaveBill")
    @ResponseBody
    public ResultObj updateLeaveBill(LeaveBillVo leaveBillVo) {
        try {
            //做修改
            this.leaveBillService.updateLeaveBill(leaveBillVo);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.UPDATE_ERROR;
        }
    }

    /**
     * 删除
     */
    @RequestMapping("deleteLeaveBill")
    @ResponseBody
    public ResultObj deleteLeaveBill(LeaveBillVo leaveBillVo) {
        try {
            //做删除
            this.leaveBillService.deleteLeaveBill(leaveBillVo.getId());
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 批量删除
     */
    @RequestMapping("batchDeleteLeaveBill")
    @ResponseBody
    public ResultObj batchDeleteLeaveBill(LeaveBillVo leaveBillVo) {
        try {
            //做删除
            Integer[] ids = leaveBillVo.getIds();
            if (null != ids && ids.length > 0) {
                for (Integer integer : ids) {
                    this.leaveBillService.deleteLeaveBill(integer);
                }
            }
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.DELETE_ERROR;
        }
    }
}
