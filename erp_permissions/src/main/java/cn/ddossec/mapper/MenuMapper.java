package cn.ddossec.mapper;

import cn.ddossec.domain.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface MenuMapper extends BaseMapper<Menu> {

    Integer queryMenuMaxOrderNum();

    Integer queryMenuChildrenCountById(Integer id);
}
