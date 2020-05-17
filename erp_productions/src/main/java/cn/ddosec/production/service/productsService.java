package cn.ddosec.production.service;

import cn.ddosec.production.pojo.products_process_design;
import cn.ddosec.production.pojo.products_process_design_sheet;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-17日 17:42
 */
public interface productsService  {
    void addsheet(products_process_design_sheet sheet);

    List<products_process_design_sheet> selectAllSheet(products_process_design_sheet sheet);

    void updatecheck(products_process_design_sheet sheet);
}
