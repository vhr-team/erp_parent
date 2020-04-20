package com.rbac.design.entity;

import com.rbac.design.pojo.design_classify;
import lombok.Data;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-20日 10:54
 */
@Data
public class treeResult {
    private String code;
    private String msg;
    private Integer count;
    private List<design_classify> data;

    public treeResult(String code, String msg, Integer count, List<design_classify> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }
}
