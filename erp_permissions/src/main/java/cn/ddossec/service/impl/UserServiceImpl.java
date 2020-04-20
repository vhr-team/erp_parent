package cn.ddossec.service.impl;

import cn.ddossec.common.AppUtils;
import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Dept;
import cn.ddossec.domain.User;
import cn.ddossec.mapper.RoleMapper;
import cn.ddossec.mapper.UserMapper;
import cn.ddossec.service.DeptService;
import cn.ddossec.service.UserService;
import cn.ddossec.vo.UserVo;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService, ApplicationContextAware {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

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
    @Cacheable(cacheNames = "cn.ddossec.service.impl.UserServiceImpl", key = "#id")
    public User getById(Serializable id) {
        return super.getById(id);
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

            // 根据领导ID查询领导名称
            if (null != record.getMgr()) {
                // 如果直接使用this那么缓存切面不生效
                UserService userService = context.getBean(UserService.class);
                User queryUser = userService.getById(record.getMgr());
                record.setLeadername(queryUser.getName());
            }
        }
        return new DataGridView(page.getTotal(), records);
    }

    @Override
    public Integer queryUserMaxOrderNum() {
        return this.userMapper.queryUserMaxOrderNum();
    }

    @Override
    @CachePut(cacheNames = "cn.ddossec.service.impl.UserServiceImpl", key = "#result.id")
    public User saveUser(User user) {
        this.userMapper.insert(user);
        return user;
    }

    @Override
    @CachePut(cacheNames = "cn.ddossec.service.impl.UserServiceImpl", key = "#result.id")
    public User updateUser(User user) {
        User selectUser = this.userMapper.selectById(user.getId());
        BeanUtil.copyProperties(user, selectUser, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));

        this.userMapper.updateById(selectUser);
        return user;
    }

    @Override
    public User LogicToDelete(Integer id) {
        // 根据用户ID删除角色和用户中间表的数据
        roleMapper.deleteRoleUserByUid(id);

        // 根据ID 查询需要删除的用户
        User user = this.userMapper.selectById(id);
        // 设置为不可用
        user.setAvailable(Constant.AVAILABLE_FALSE);
        this.userMapper.updateById(user);
        return user;
    }

    @Override
    public void saveUserRole(Integer uid, Integer[] rids) {
        // 根据用户ID，删除角色和用户中间表的关系数据
        this.roleMapper.deleteRoleUserByUid(uid);

        if (null != rids && rids.length > 0) {
            for (Integer rid : rids) {
                this.userMapper.saveUserRole(uid, rid);
            }
        }
    }

    //    根据部门ID查询员工集合
    @Override
    public List<User> queryUserByDeptId(Integer deptid) {
        if (null == deptid) {
            return null;
        } else {
            QueryWrapper<User> qw = new QueryWrapper<>();
            qw.eq("type", Constant.USER_TYPE_NORMAL);
            qw.eq(deptid != null, "deptid", deptid);
            return this.getBaseMapper().selectList(qw);
        }
    }

    /**
     * 查询领导信息
     * @param mgr
     * @return
     */
    @Override
    public User queryUserById(Integer mgr) {
        return this.userMapper.selectById(mgr);
    }
}
