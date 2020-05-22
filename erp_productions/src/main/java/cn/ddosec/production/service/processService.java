package cn.ddosec.production.service;

import cn.ddosec.production.pojo.products_process_design;
import cn.ddosec.production.pojo.products_process_design_sheet;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-17日 17:42
 */
public interface processService {
    void addprocess(products_process_design design);

    List<products_process_design> selectAll(products_process_design design);
    List<products_process_design> selectcheckAll(products_process_design design);
    void updatecheck(products_process_design design);

}
