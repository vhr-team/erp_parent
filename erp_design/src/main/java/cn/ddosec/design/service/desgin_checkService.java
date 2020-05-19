package cn.ddosec.design.service;

import cn.ddosec.design.pojo.product_check;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-19日 23:15
 */
public interface desgin_checkService {
    void addcheck(product_check check);

    List<product_check> selectAll(String productId);
}
