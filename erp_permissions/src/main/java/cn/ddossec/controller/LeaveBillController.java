package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.Leavebill;
import cn.ddossec.service.LeavebillService;
import cn.ddossec.vo.LeavebillVo;
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
    public DataGridView loadAllLeaveBills(LeavebillVo leaveBillVo) {
        return this.leaveBillService.queryAllLeaveBills(leaveBillVo);
    }

    /**
     * 添加
     */
    @RequestMapping("addLeaveBill")
    @ResponseBody
    public ResultObj addLeaveBill(LeavebillVo leaveBillVo) {
        try {
            this.leaveBillService.addLeaveBill(leaveBillVo);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            return ResultObj.ADD_ERROR;
        }
    }

    @RequestMapping("toUpdateLeaveBill")
    public Leavebill toUpdateLeaveBill(LeavebillVo leaveBillVo) {
        Leavebill leaveBill = this.leaveBillService.queryLeaveBillById(leaveBillVo.getId());
        return leaveBill;
    }

    /**
     * 修改
     */
    @RequestMapping("updateLeaveBill")
    @ResponseBody
    public ResultObj updateLeaveBill(LeavebillVo leaveBillVo) {
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
    public ResultObj deleteLeaveBill(LeavebillVo leaveBillVo) {
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
    public ResultObj batchDeleteLeaveBill(LeavebillVo leaveBillVo) {
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
