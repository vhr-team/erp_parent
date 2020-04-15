package cn.ddossec.mapper;

import cn.ddossec.domain.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * @author 30315
 * @title: RoleMapper
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1415:19
 */
public interface RoleMapper extends BaseMapper<Role> {

    void deleteRoleMenuByRid(Serializable id);

    void deleteRoleMenuByMid(Serializable id);

    void deleteRoleUserByRid(Serializable id);

    void deleteRoleUserByUid(Serializable id);

    void insertRoleMenu(@Param("rid") Integer rid, @Param("mid") Integer mid);

    List<Integer> queryMenuIdsByRid(Integer id);

    List<Integer> queryRoleIdsByUserId(Integer userId);

    List<Integer> queryMenuIdsByRids(@Param("roleIds") List<Integer> roleIds);

}
