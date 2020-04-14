package cn.ddossec.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 30315
 * @title: MenuVo
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-140:19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MenuVo extends BaseVo {

    // 查询可用的菜单
    private Integer available;

}
