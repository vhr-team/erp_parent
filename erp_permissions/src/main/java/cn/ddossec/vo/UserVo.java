package cn.ddossec.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserVo extends BaseVo {

    private String name;
    private String remark;
    private String address;

    private Integer deptid;
    private Integer available;

}
