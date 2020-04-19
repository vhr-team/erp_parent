package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Leavebill;
import cn.ddossec.mapper.LeavebillMapper;
import cn.ddossec.service.LeavebillService;
import cn.ddossec.vo.LeavebillVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        IPage<Leavebill> page = new Page<>(leaveBillVo.getPage(), leaveBillVo.getLimit());

        QueryWrapper<Leavebill> qw = new QueryWrapper<>();
        qw.like(StringUtils.isNotBlank(leaveBillVo.getTitle()), "title", leaveBillVo.getTitle());
        qw.like(StringUtils.isNotBlank(leaveBillVo.getContent()), "content", leaveBillVo.getContent());

        qw.ge(leaveBillVo.getStartTime() != null, "leavetime", leaveBillVo.getStartTime());
        qw.le(leaveBillVo.getEndTime() != null, "leavetime", leaveBillVo.getEndTime());

        qw.eq(null != leaveBillVo.getUserid(), "userid", leaveBillVo.getUserid());

        qw.orderByDesc("leavetime");

        this.leaveBillMapper.selectPage(page, qw);
        return new DataGridView(page.getTotal(), page.getRecords());
    }

    /**
     * 添加请假单
     */
    @Override
    public void addLeaveBill(Leavebill leavebill) {
        this.leaveBillMapper.insert(leavebill);
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
