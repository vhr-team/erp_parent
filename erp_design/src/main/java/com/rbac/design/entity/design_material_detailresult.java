package com.rbac.design.entity;

import com.rbac.design.pojo.design_material_detail;

import java.io.Serializable;

/**
 * @author joker_dj
 * @create 2020-04-22日 13:11
 */
public class design_material_detailresult implements Serializable {
    public design_material_detail data;

    public design_material_detailresult() {
    }

    public design_material_detailresult(design_material_detail data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "design_material_detailresult{" +
                "data=" + data +
                '}';
    }

    public design_material_detail getData() {
        return data;
    }

    public void setData(design_material_detail data) {
        this.data = data;
    }
}
