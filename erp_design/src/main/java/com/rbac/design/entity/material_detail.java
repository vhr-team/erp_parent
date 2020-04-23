package com.rbac.design.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-22日 23:15
 */
public class material_detail implements Serializable {
    private String code = "0";
    private String msg = "";
    private List<material_details> data;

    public material_detail(String code, String msg, List<material_details> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public material_detail() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "material_detail{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public List<material_details> getData() {
        return data;
    }

    public void setData(List<material_details> data) {
        this.data = data;
    }


}
