package cn.ddosec.production.service.Impl;

import cn.ddosec.production.mapper.products_process_design_sheetmapper;
import cn.ddosec.production.pojo.products_process_design;
import cn.ddosec.production.pojo.products_process_design_sheet;
import cn.ddosec.production.service.productsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author joker_dj
 * @create 2020-05-17日 17:42
 */
@Service
@Transactional
public class productsServiceImpl implements productsService {
    @Autowired
    products_process_design_sheetmapper mapper;
    @Override
    public void addsheet(products_process_design_sheet sheet) {
        mapper.insertSelective(sheet);
    }


}
