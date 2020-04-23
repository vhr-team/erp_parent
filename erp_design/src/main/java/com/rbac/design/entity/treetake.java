package com.rbac.design.entity;

import com.rbac.design.pojo.design_classify;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author joker_dj
 * @create 2020-04-21日 10:20
 */

public class treetake implements Serializable {
    private String id;
    private String kindId;
    private design_classify[] classify;

    public treetake(String id, String kindId, design_classify[] classify) {
        this.id = id;
        this.kindId = kindId;
        this.classify = classify;
    }

    public treetake(String id, design_classify[] classify) {
        this.id = id;
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "treetake{" +
                "id='" + id + '\'' +
                ", kindId='" + kindId + '\'' +
                ", classify=" + Arrays.toString(classify) +
                '}';
    }

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public design_classify[] getClassify() {
        return classify;
    }

    public void setClassify(design_classify[] classify) {
        this.classify = classify;
    }
}
