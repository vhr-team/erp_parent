package cn.ddosec.design.service.Impl;

import cn.ddosec.design.entity.PageResult;
import cn.ddosec.design.mapper.product_design_recordmapper;
import cn.ddosec.design.pojo.product_design_record;
import cn.ddosec.design.pojo.product_design_recordQuery;
import cn.ddosec.design.service.design_recordService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author joker_dj
 * @create 2020-04-30日 10:24
 */
@Service
@Transactional
public class design_recordServiceImpl implements design_recordService {
    @Autowired
    product_design_recordmapper mapper;

    @Override
    public PageResult findPage(Integer page, Integer pageSize, product_design_record record) {
        PageHelper.startPage(page, pageSize);
        product_design_recordQuery query = new product_design_recordQuery();
        if (record != null) {
            product_design_recordQuery.Criteria criteria = query.createCriteria();
            if (record.getProductName() != null) {
                criteria.andProductNameLike("%" + record.getProductName() + "%");
            }
            if (record.getRegisterTime() != null) {
                criteria.andRegisterTimeLike("%" + record.getRegisterTime() + "%");
            }
        }

        Page<product_design_record> product_design_records = (Page<product_design_record>) mapper.selectByExample(query);
        PageResult pageResult = new PageResult(product_design_records.getTotal(), product_design_records.getResult());
        return pageResult;
    }

    @Override
    public void updaterecord(product_design_record record) {
        mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void addrecord(product_design_record record) {
        mapper.insertSelective(record);
    }
}
