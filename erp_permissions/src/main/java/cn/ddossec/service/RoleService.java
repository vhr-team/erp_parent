package cn.ddossec.service;

import cn.ddossec.domain.Role;
import cn.ddossec.vo.RoleVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author 30315
 * @title: RoleService
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1415:19
 */
public interface RoleService extends IService<Role> {

    DataGridView queryAllRole(RoleVo roleVo);

    Role saveRole(Role role);

    Role updateRole(Role role);

    void saveRoleMenu(Integer rid, Integer[] mids);

    List<Integer> queryMenuIdsByRid(Integer id);

    DataGridView loadAllAvailableRoleNoPage(RoleVo roleVo);

    List<String> queryRoleNamesByUserId(Integer id);
}
