package cn.ddossec.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class RoleVo extends BaseVo {

    private String title;

}
