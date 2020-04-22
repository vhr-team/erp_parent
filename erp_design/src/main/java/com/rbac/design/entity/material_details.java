package com.rbac.design.entity;

import java.io.Serializable;

/**
 * @author joker_dj
 * @create 2020-04-18日 15:24
 */
public class material_details implements Serializable {
    private String name;
    private Double value;

    public material_details() {
    }

    public material_details(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "material_details{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}

