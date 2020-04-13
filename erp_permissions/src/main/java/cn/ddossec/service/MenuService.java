package cn.ddossec.service;

import cn.ddossec.domain.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface MenuService extends IService<Menu>{


    /**
     * 全查询菜单
     * @return
     */
    List<Menu> queryAllMenuForList();

    /**
     * 根据用户ID查询菜单
     * @param id
     * @return
     */
    List<Menu> queryMenuForListByUserId(Integer id);
}
