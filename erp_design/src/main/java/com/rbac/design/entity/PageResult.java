package com.rbac.design.entity;

import lombok.Data;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-17日 10:52
 */
@Data
public class PageResult {
    private Long total;//总记录数
    private List rows;//当前页结果
    public PageResult(Long total, List rows) {
        this.total = total;
        this.rows = rows;
    }
}
