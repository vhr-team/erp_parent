package cn.ddosec.design.service;

import cn.ddosec.design.entity.PageResult;
import cn.ddosec.design.pojo.product_design_record;

/**
 * @author joker_dj
 * @create 2020-04-30日 10:23
 */
public interface design_recordService {

    PageResult findPage(Integer page, Integer pageSize, product_design_record record);

    void updaterecord(product_design_record record);

    void addrecord(product_design_record record);
}
