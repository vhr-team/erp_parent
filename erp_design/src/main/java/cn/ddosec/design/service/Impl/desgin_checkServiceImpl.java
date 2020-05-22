package cn.ddosec.design.service.Impl;

import cn.ddosec.design.mapper.product_checkmapper;
import cn.ddosec.design.pojo.product_check;
import cn.ddosec.design.pojo.product_checkQuery;
import cn.ddosec.design.service.desgin_checkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-19日 23:15
 */
@Service
@Transactional
public class desgin_checkServiceImpl implements desgin_checkService {
    @Autowired
    product_checkmapper mapper;
    @Override
    public void addcheck(product_check check) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        check.setCheckDate(df.format(new Date()));
        mapper.insertSelective(check);
    }

    @Override
    public List<product_check> selectAll(String productId) {
        product_checkQuery query = new product_checkQuery();
        query.setOrderByClause("id desc");
        product_checkQuery.Criteria criteria = query.createCriteria();
        criteria.andProductIdEqualTo(productId);
        List<cn.ddosec.design.pojo.product_check> product_checks = mapper.selectByExample(query);
        return product_checks;
    }
}
