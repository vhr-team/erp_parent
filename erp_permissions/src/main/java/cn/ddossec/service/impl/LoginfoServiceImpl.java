package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Loginfo;
import cn.ddossec.mapper.LoginfoMapper;
import cn.ddossec.service.LoginfoService;
import cn.ddossec.vo.LoginfoVo;
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
 * @title: LoginfoServiceImpl
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2110:24
 */
@Service
@Transactional
@Slf4j
public class LoginfoServiceImpl extends ServiceImpl<LoginfoMapper, Loginfo> implements LoginfoService {

    @Autowired
    private LoginfoMapper loginfoMapper;

    /**
     * 查询所有登录日志
     * @param loginfoVo
     * @return
     */
    @Override
    public DataGridView queryAllLoginfo(LoginfoVo loginfoVo) {
        IPage<Loginfo> page = new Page<>(loginfoVo.getPage(), loginfoVo.getLimit());

        // 设置查询条件
        QueryWrapper<Loginfo> qw = new QueryWrapper<>();
        qw.like(StringUtils.isNotBlank(loginfoVo.getLoginname()), "loginname", loginfoVo.getLoginname());
        qw.like(StringUtils.isNotBlank(loginfoVo.getLoginip()), "loginip", loginfoVo.getLoginip());

        // 开始时间-结束时间
        qw.ge(loginfoVo.getStartTime() != null, "logintime", loginfoVo.getStartTime());
        qw.le(loginfoVo.getEndTime() != null, "logintime", loginfoVo.getEndTime());

        // 排序
        qw.orderByDesc("logintime");

        // 查询
        this.loginfoMapper.selectPage(page, qw);

        return new DataGridView(page.getTotal(), page.getRecords());
    }
}
