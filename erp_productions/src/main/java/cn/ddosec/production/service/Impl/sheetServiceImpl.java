package cn.ddosec.production.service.Impl;

import cn.ddosec.production.mapper.products_process_designmapper;
import cn.ddosec.production.pojo.products_process_design;
import cn.ddosec.production.service.sheetService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-22日 9:04
 */
public class sheetServiceImpl implements sheetService {
    @Autowired
    products_process_designmapper designmapper;


    @Override
    public List<products_process_design> selectprocess_designAll() {
        return designmapper.selectByExample(null);
    }


}
