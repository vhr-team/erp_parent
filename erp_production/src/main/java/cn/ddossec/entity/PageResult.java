package cn.ddossec.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResult implements Serializable {

    private Long total;
    private List data;


    public PageResult(Long total, List data) {
        this.total = total;
        this.data = data;
    }
}
