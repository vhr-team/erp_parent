package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Leavebill;
import cn.ddossec.vo.LeavebillVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 30315
 * @title: LeavebillService
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1720:29
 */
public interface LeavebillService extends IService<Leavebill> {

    /**
     * 查询所有请假单返回DataGridView
     */
    public DataGridView queryAllLeaveBills(LeavebillVo leaveBillVo);

    /**
     * 添加请假单
     * @param leaveBillVo
     */
    public void addLeaveBill(LeavebillVo leaveBillVo);

    /**
     * 根据ID查询请假单
     *
     * @param id
     * @return
     */
    public Leavebill queryLeaveBillById(Integer id);

    /**
     * 修改请假单信息
     *
     * @param leaveBillVo
     */
    public void updateLeaveBill(LeavebillVo leaveBillVo);

    /**
     * 删除
     */
    public void deleteLeaveBill(Integer id);

}
