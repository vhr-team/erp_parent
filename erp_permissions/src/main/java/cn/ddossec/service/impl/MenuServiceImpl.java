package cn.ddossec.service.impl;

import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Menu;
import cn.ddossec.mapper.MenuMapper;
import cn.ddossec.mapper.RoleMapper;
import cn.ddossec.service.MenuService;
import cn.ddossec.vo.MenuVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

    @Override
    public Menu getById(Serializable id) {
        return super.getById(id);
    }

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Menu> queryAllMenuForList() {
        QueryWrapper<Menu> qw = new QueryWrapper<>();
        qw.eq("available", Constant.AVAILABLE_TRUE);
        qw.and(new Consumer<QueryWrapper<Menu>>() {
            @Override
            public void accept(QueryWrapper<Menu> menuQueryWrapper) {
                menuQueryWrapper.eq("type", Constant.MENU_TYPE_TOP)
                        .or().eq("type", Constant.MENU_TYPE_LEFT);
            }
        });
        qw.orderByAsc("ordernum");
        return this.menuMapper.selectList(qw);
    }

    /**
     * @param id 用户ID
     * @return
     */
    @Override
    public List<Menu> queryMenuForListByUserId(Integer id) {

        // 根据用户ID，查询用户角色的ID
        List<Integer> roleIds = this.roleMapper.queryRoleIdsByUserId(id);

        // 根据用户角色ID，去查询菜单
        if (null != roleIds && roleIds.size() > 0) {

            List<Integer> menuIds = this.roleMapper.queryMenuIdsByRids(roleIds);

            if (null != menuIds && menuIds.size() > 0) {
                QueryWrapper<Menu> qw = new QueryWrapper<>();
                qw.eq("available", Constant.AVAILABLE_TRUE);
                qw.and(new Consumer<QueryWrapper<Menu>>() {
                    @Override
                    public void accept(QueryWrapper<Menu> menuQueryWrapper) {
                        menuQueryWrapper.eq("type", Constant.MENU_TYPE_TOP)
                                .or().eq("type", Constant.MENU_TYPE_LEFT);
                    }
                });
                qw.in("id", menuIds);
                qw.orderByAsc("ordernum");
                List<Menu> menus = this.menuMapper.selectList(qw);
                return menus;
            } else {
                return new ArrayList<>();
            }
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public DataGridView queryAllMenu(MenuVo menuVo) {
        QueryWrapper<Menu> qw = new QueryWrapper<>();
        qw.eq(menuVo.getAvailable() != null, "available", menuVo.getAvailable());
        qw.orderByAsc("ordernum");

        List<Menu> menus = this.menuMapper.selectList(qw);
        return new DataGridView(Long.valueOf(menus.size()), menus);
    }

    @Override
    public Integer queryMenuMaxOrderNum() {
        return this.menuMapper.queryMenuMaxOrderNum();
    }

    @Override
    public Menu saveMenu(Menu menu) {
        this.menuMapper.insert(menu);
        return menu;
    }

    @Override
    public Menu updateMenu(Menu menu) {
        this.menuMapper.updateById(menu);
        return menu;
    }

    @Override
    public Integer queryMenuChildrenCountById(Integer id) {
        return this.menuMapper.queryMenuChildrenCountById(id);
    }

    @Override
    public List<String> queryPermissionCodesByUserId(Integer id) {
        //根据userid查询角色id的集合
        List<Integer> roleIds = this.roleMapper.queryRoleIdsByUserId(id);

        //根据角色ID的集合，查询菜单的ID的集合
        if (null != roleIds && roleIds.size() > 0) {
            List<Integer> menuIds = this.roleMapper.queryMenuIdsByRids(roleIds);
            if (null != menuIds && menuIds.size() > 0) {
                QueryWrapper<Menu> qw = new QueryWrapper<>();
                qw.eq("available", Constant.AVAILABLE_TRUE);
                qw.eq("type", Constant.MENU_TYPE_PERMISSION);
                qw.in("id", menuIds);
                qw.orderByAsc("ordernum");
                List<Menu> menus = this.menuMapper.selectList(qw);
                List<String> permissions = new ArrayList<>();
                for (Menu menu : menus) {
                    permissions.add(menu.getTypecode());
                }
                return permissions;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
