package com.rbac.design.entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author joker_dj
 * @create 2020-04-23日 23:53
 */
public class miutichecker implements Serializable {
    private String checker;
    private String checkTag;
    private Integer[] id;

    public miutichecker() {
    }

    public miutichecker(String checker, String checkTag, Integer[] id) {
        this.checker = checker;
        this.checkTag = checkTag;
        this.id = id;
    }

    @Override
    public String toString() {
        return "miutichecker{" +
                "checker='" + checker + '\'' +
                ", checkTag='" + checkTag + '\'' +
                ", id=" + Arrays.toString(id) +
                '}';
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getCheckTag() {
        return checkTag;
    }

    public void setCheckTag(String checkTag) {
        this.checkTag = checkTag;
    }

    public Integer[] getId() {
        return id;
    }

    public void setId(Integer[] id) {
        this.id = id;
    }
}
