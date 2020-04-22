package com.rbac.design.controller;

import java.util.Date;

/**
 * 测试
 *
 * @author joker_dj
 * @create 2020-04-18日 15:23
 */

public class test {
    public static void main(String[] args) {
        Date date = new Date();
        Object da = (Object) date.getTime();
        String s = da.toString();
        System.out.println(s);
    }
}
