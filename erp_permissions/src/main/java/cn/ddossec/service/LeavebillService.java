package cn.ddossec.service;

import cn.ddossec.domain.LeaveBill;
import cn.ddossec.vo.LeaveBillVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 30315
 * @title: LeavebillService
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1720:29
 */
public interface LeavebillService extends IService<LeaveBill> {

    /**
     * 查询所有请假单返回DataGridView
     */
    public DataGridView queryAllLeaveBills(LeaveBillVo leaveBillVo);

    /**
     * 添加请假单
     */
    public void addLeaveBill(LeaveBill leavebill);

    /**
     * 根据ID查询请假单
     *
     * @param id
     * @return
     */
    public LeaveBill queryLeaveBillById(Integer id);

    /**
     * 修改请假单信息
     *
     * @param leaveBillVo
     */
    public void updateLeaveBill(LeaveBillVo leaveBillVo);

    /**
     * 删除
     */
    public void deleteLeaveBill(Integer id);

}
