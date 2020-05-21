package cn.ddosec.production.service;

import cn.ddosec.production.pojo.products_process_check;
import cn.ddosec.production.pojo.products_process_design;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-17日 17:42
 */
public interface processcheckService {
    void addcheck(products_process_check check);
    List<products_process_check> selectcheck(products_process_check check);
}
