package cn.ddossec.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseVo implements Serializable {

    // 当前页
    private Integer page;

    // 显示条数
    private Integer pageSize;
    private Integer limit;

}