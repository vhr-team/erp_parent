package cn.ddosec.production.service.Impl;

import cn.ddosec.production.mapper.production_process_design_sheetmapper;
import cn.ddosec.production.pojo.production_process_design_sheet;
import cn.ddosec.production.service.production_process_design_sheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author joker_dj
 * @create 2020-05-13日 8:53
 */
@Service
@Transactional
public class production_process_design_sheetsServiceImpl implements production_process_design_sheetService {
    @Autowired
    production_process_design_sheetmapper mapper;
    @Override
    public void selectAfterInsert(production_process_design_sheet sheet) {
        mapper.insertSelective(sheet);
    }
}
