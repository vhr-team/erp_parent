package com.rbac.design.entity;

import java.io.Serializable;

/**
 * @author joker_dj
 * @create 2020-04-18日 15:24
 */
public class test implements Serializable {
    private String pm;

    @Override
    public String toString() {
        return "test{" +
                "pm='" + pm + '\'' +
                '}';
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public test() {
    }

    public test(String pm) {
        this.pm = pm;
    }
}
