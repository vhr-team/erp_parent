package cn.ddossec.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 30315
 * @title: BaseVo
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2311:44
 */
@Data
public class BaseVo implements Serializable {

    private Integer page;
    private Integer pageSize;

}
