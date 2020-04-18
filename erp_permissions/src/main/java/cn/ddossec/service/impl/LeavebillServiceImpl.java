package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Leavebill;
import cn.ddossec.domain.User;
import cn.ddossec.mapper.LeavebillMapper;
import cn.ddossec.service.LeavebillService;
import cn.ddossec.vo.LeavebillVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 30315
 * @title: LeavebillServiceImpl
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1720:29
 */
@Service
@Transactional
@Slf4j
public class LeavebillServiceImpl extends ServiceImpl<LeavebillMapper, Leavebill> implements LeavebillService {

    @Autowired
    private LeavebillMapper leaveBillMapper;


    @Override
    public DataGridView queryAllLeaveBills(LeavebillVo leaveBillVo) {
        IPage<User> page = new Page<>(leaveBillVo.getPage(), leaveBillVo.getLimit());

        List<Leavebill> data = this.leaveBillMapper.queryAllLeavebill(leaveBillVo);
        DataGridView view = new DataGridView(page.getTotal(), data);
        return view;
    }

    /**
     * 添加请假单
     */
    @Override
    public void addLeaveBill(LeavebillVo leaveBillVo) {
        this.leaveBillMapper.insert(leaveBillVo);
    }

    @Override
    public Leavebill queryLeaveBillById(Integer id) {

        return this.leaveBillMapper.selectById(id);
    }

    @Override
    public void updateLeaveBill(LeavebillVo leaveBillVo) {
        this.leaveBillMapper.updateById(leaveBillVo);
    }

    @Override
    public void deleteLeaveBill(Integer id) {
        this.leaveBillMapper.deleteById(id);
    }


}
