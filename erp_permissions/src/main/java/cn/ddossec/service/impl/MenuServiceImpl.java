package cn.ddossec.service.impl;

import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Menu;
import cn.ddossec.mapper.MenuMapper;
import cn.ddossec.service.MenuService;
import cn.ddossec.vo.MenuVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

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

    @Override
    public List<Menu> queryMenuForListByUserId(Integer id) {
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
        return null;
    }

    @Override
    public Menu saveMenu(Menu menu) {
        return null;
    }

    @Override
    public Menu updateMenu(Menu menu) {
        return null;
    }

    @Override
    public Integer queryMenuChildrenCountById(Integer id) {
        return null;
    }
}
