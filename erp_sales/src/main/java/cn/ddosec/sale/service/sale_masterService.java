package cn.ddosec.sale.service;

import cn.ddosec.sale.entity.PageResult;

/**
 * 销售主表
 *
 * @author joker_dj
 * @create 2020-04-27日 13:34
 */
public interface sale_masterService {

    PageResult findPage(Integer page, Integer pageSize);

}
