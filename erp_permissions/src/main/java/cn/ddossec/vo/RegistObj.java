package cn.ddossec.vo;

import cn.ddossec.domain.User;
import lombok.Data;
import lombok.ToString;

/**
 * @title: RegistObj
 * @projectName erp_parent
 * @描述: TODO
 * @作者: 小灰灰
 * @创建时间 2020-05-2422:22
 */
@Data
@ToString
public class RegistObj {

    private String name;
    private String pwd;

    private String code;

    private String phone;

}
