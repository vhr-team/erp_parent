package cn.ddossec.service.impl;

import cn.ddossec.common.Constant;
import cn.ddossec.vo.RoleVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ddossec.domain.Role;
import cn.ddossec.mapper.RoleMapper;
import cn.ddossec.service.RoleService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 唐颖豪
 * @title: RoleServiceImpl
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1415:19
 */
@Service
@Transactional
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public DataGridView queryAllRole(RoleVo roleVo) {
        IPage<Role> page = new Page<>(roleVo.getPage(), roleVo.getLimit());
        QueryWrapper<Role> qw = new QueryWrapper<>();
        qw.eq(roleVo.getAvailable() != null, "available", roleVo.getAvailable());
        qw.like(StringUtils.isNotBlank(roleVo.getName()), "name", roleVo.getName());
        qw.like(StringUtils.isNotBlank(roleVo.getRemark()), "remark", roleVo.getRemark());
        this.roleMapper.selectPage(page, qw);
        return new DataGridView(page.getTotal(), page.getRecords());
    }

    @Override
    public Role saveRole(Role role) {
        this.roleMapper.insert(role);
        return role;
    }

    @Override
    public Role updateRole(Role role) {
        this.roleMapper.updateById(role);
        return role;
    }

    /**
     * 保存角色和菜单之间的关系
     *
     * @param rid
     * @param mids
     */
    @Override
    public void saveRoleMenu(Integer rid, Integer[] mids) {
        //根据rid删除sys_role_menu里面的数据
        this.roleMapper.deleteRoleMenuByRid(rid);
        if (null != mids && mids.length > 0) {
            for (Integer mid : mids) {
                this.roleMapper.insertRoleMenu(rid, mid);
            }
        }
    }

    @Override
    public List<Integer> queryMenuIdsByRid(Integer id) {
        return this.roleMapper.queryMenuIdsByRid(id);
    }

    @Override
    public DataGridView loadAllAvailableRoleNoPage(RoleVo roleVo) {
        // 查询可用角色
        QueryWrapper<Role> qw = new QueryWrapper<>();
        qw.eq(roleVo.getAvailable() != null, "available", roleVo.getAvailable());
        List<Role> roles = this.roleMapper.selectList(qw);

        // 根据用户ID查询已拥有的角色ID
        List<Integer> roleIds = this.roleMapper.queryRoleIdsByUserId(roleVo.getUserId());

        // 定义一个集合，用来存储用户的角色
        List<Map<String, Object>> lists = new ArrayList<>();

        for (Role role : roles) {
            Boolean LAY_CHECKED = false;
            for (Integer roleId : roleIds) {
                // 如果，根据用户ID查询已拥有的角色ID，等于可用角色里面的就代表有
                if (role.getId().equals(roleId)) {
                    LAY_CHECKED = true;
                    break;
                }
            }
            HashMap<String, Object> map = new HashMap<>();
            map.put("id", role.getId());
            map.put("name", role.getName());
            map.put("remark", role.getRemark());
            map.put("LAY_CHECKED", LAY_CHECKED);
            lists.add(map);
        }
        return new DataGridView(Long.valueOf(lists.size()), lists);
    }

    @Override
    public List<String> queryRoleNamesByUserId(Integer id) {

        //根据用户ID查询角色ID的集合
        List<Integer> roleIds = this.roleMapper.queryRoleIdsByUserId(id);
        if (null != roleIds && roleIds.size() > 0) {
            QueryWrapper<Role> qw = new QueryWrapper<>();
            qw.eq("available", Constant.AVAILABLE_TRUE);
            qw.in("id", roleIds);
            List<Role> rolesObject = this.roleMapper.selectList(qw);
            List<String> roles = new ArrayList<>();
            for (Role role : rolesObject) {
                roles.add(role.getName());
            }
            return roles;
        } else {
            return null;
        }
    }

    @Override
    public boolean removeById(Serializable id) {
        //根据角色ID删除角色和菜单之间的关系
        roleMapper.deleteRoleMenuByRid(id);
        //根据角色ID删除角色和用户之间的关系
        roleMapper.deleteRoleUserByRid(id);

        return super.removeById(id);
    }

}
