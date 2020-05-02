package cn.ddosec.design.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-30日 10:25
 */

@Data
public class PageResult implements Serializable {
    private Long total;
    private List data;

    public PageResult(Long total, List data) {
        this.total = total;
        this.data = data;
    }
}
