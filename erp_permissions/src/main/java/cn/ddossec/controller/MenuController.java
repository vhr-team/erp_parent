package cn.ddossec.controller;

import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.Menu;
import cn.ddossec.service.MenuService;
import cn.ddossec.vo.MenuVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 唐颖豪
 * @title: MenuController
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-147:29
 */
@RestController
@RequestMapping("/menu")
@Slf4j
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * 查询菜单和权限
     *
     * @param menuVo
     * @return
     */
    @GetMapping("/loadAllMenu")
    public Object loadAllMenu(MenuVo menuVo) {
        return this.menuService.queryAllMenu(menuVo);
    }

    /**
     * 查询菜单
     * @param menuVo
     * @return
     */
    @RequestMapping("/loadMenu")
    public Object loadMenu(MenuVo menuVo) {
        List<Menu> menus = this.menuService.queryAllMenuForList();
        return new DataGridView(Long.valueOf(menus.size()), menus);
    }

    /**
     * 查询菜单和权限最大的排序码
     */
    @GetMapping("/queryMenuMaxOrderNum")
    public Object queryMenuMaxOrderNum() {
        Integer maxValue = this.menuService.queryMenuMaxOrderNum();
        return new DataGridView(maxValue + 1);
    }


    /**
     * 添加菜单和权限
     *
     * @param menu
     * @return
     */
    @PostMapping("/addMenu")
    @RequiresPermissions(value = {"menu:add"})
    public ResultObj addMenu(Menu menu) {
        try {
            // 如果是顶端菜单
            if(menu.getType().equals("topmenu")){
                menu.setPid(0);
            }
            // 默认不展开
            menu.setSpread(Constant.SPREAD_FALSE);
            // 默认可用
            menu.setAvailable(Constant.AVAILABLE_TRUE);

            this.menuService.saveMenu(menu);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 修改菜单和权限
     * 修改—是否展开是否可用
     *
     * @param menu
     * @return
     */
    @PostMapping("/updateMenu")
    @RequiresPermissions(value = {"menu:update"})
    public ResultObj updateMenu(Menu menu) {
        try {
            this.menuService.updateMenu(menu);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.UPDATE_ERROR;
        }
    }

    /**
     * 菜单和权限修改
     *
     * @param id
     * @return
     */
    @GetMapping("/getMenuById")
    public Object getMenuById(Integer id) {
        return new DataGridView(this.menuService.getById(id));
    }

    /**
     * 根据ID查询，当前菜单和权限的子菜单和权限的个数
     *
     * @param id
     * @return
     */
    @GetMapping("/getMenuChildrenCountById")
    public Object getMenuChildrenCountById(Integer id) {
        Integer count = this.menuService.queryMenuChildrenCountById(id);
        return new DataGridView(count);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/deleteMenu")
    @RequiresPermissions(value = {"menu:delete"})
    public ResultObj deleteDpet(Integer id) {
        try {
            this.menuService.removeById(id);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.DELETE_ERROR;
        }
    }

}
