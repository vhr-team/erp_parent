package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Notice;
import cn.ddossec.mapper.NoticeMapper;
import cn.ddossec.service.NoticeService;
import cn.ddossec.vo.NoticeVo;
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
 * @title: NoticeServiceImpl
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2111:42
 */
@Service
@Transactional
@Slf4j
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public DataGridView queryAllNotice(NoticeVo noticeVo) {
        IPage<Notice> page = new Page<>(noticeVo.getPage(), noticeVo.getLimit());
        QueryWrapper<Notice> qw = new QueryWrapper<>();
        qw.like(StringUtils.isNotBlank(noticeVo.getTitle()), "title", noticeVo.getTitle());
        qw.like(StringUtils.isNotBlank(noticeVo.getOpername()), "opername", noticeVo.getOpername());
        qw.ge(noticeVo.getStartTime() != null, "createtime", noticeVo.getStartTime());
        qw.le(noticeVo.getEndTime() != null, "createtime", noticeVo.getEndTime());
        qw.orderByDesc("createtime");
        this.noticeMapper.selectPage(page, qw);
        return new DataGridView(page.getTotal(), page.getRecords());
    }
}
