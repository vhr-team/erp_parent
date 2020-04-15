package cn.ddossec.service.impl;

import cn.ddossec.common.AppUtils;
import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Dept;
import cn.ddossec.domain.Role;
import cn.ddossec.domain.User;
import cn.ddossec.mapper.UserMapper;
import cn.ddossec.service.DeptService;
import cn.ddossec.service.UserService;
import cn.ddossec.vo.UserVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByLoginName(String loginname) {
        UserMapper userMapper = this.getBaseMapper();
        QueryWrapper<User> qw = new QueryWrapper<>();
        if (StringUtils.isBlank(loginname)) {
            // 打日志
            log.error("登陆名不能为空");
            return null;
        }
        qw.eq("loginname", loginname);
        User user = userMapper.selectOne(qw);
        return user;
    }

    @Override
    public DataGridView loadAllUser(UserVo userVo) {
        // 分页
        IPage<User> page = new Page<>(userVo.getPage(), userVo.getLimit());

        // 设置条件
        QueryWrapper<User> qw = new QueryWrapper<>();
        // 普通用户
        qw.eq("type", Constant.USER_TYPE_NORMAL);
        // 部门
        qw.eq(null != userVo.getDeptid(), "deptid", userVo.getDeptid());
        // 用户名
        qw.like(StringUtils.isNotBlank(userVo.getName()), "name", userVo.getName());
        // 地址
        qw.like(StringUtils.isNotBlank(userVo.getAddress()), "address", userVo.getAddress());
        // 备注
        qw.like(StringUtils.isNotBlank(userVo.getRemark()), "remark", userVo.getRemark());
        // 查询可用
        qw.eq("available", Constant.AVAILABLE_TRUE);

        this.userMapper.selectPage(page, qw);
        List<User> records = page.getRecords();
        DeptService deptService = AppUtils.getContext().getBean(DeptService.class);

        for (User record : records) {
            if (null != record.getDeptid()) {
                Dept dept = deptService.getById(record.getDeptid());
                record.setDeptname(dept.getTitle());
            }
        }
        return new DataGridView(page.getTotal(), records);
    }

    @Override
    public Integer queryUserMaxOrderNum() {
        return this.userMapper.queryUserMaxOrderNum();
    }

    @Override
    public User saveUser(User user) {
        this.userMapper.insert(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        this.userMapper.updateById(user);
        return user;
    }
}
