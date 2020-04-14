package cn.ddossec.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseVo implements Serializable {

    private Integer page;
    private Integer limit;

}
