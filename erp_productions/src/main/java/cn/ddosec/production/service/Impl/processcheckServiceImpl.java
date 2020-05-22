package cn.ddosec.production.service.Impl;

import cn.ddosec.production.mapper.products_process_checkmapper;
import cn.ddosec.production.pojo.products_process_check;
import cn.ddosec.production.pojo.products_process_checkQuery;
import cn.ddosec.production.service.processcheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-20日 9:59
 */
@Service
@Transactional
public class processcheckServiceImpl implements processcheckService {
    @Autowired
    products_process_checkmapper mapper;

    @Override
    public void addcheck(products_process_check check) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        check.setProcessCheckDate(df.format(new Date()));
        mapper.insertSelective(check);
    }

    @Override
    public List<products_process_check> selectcheck(products_process_check check) {
        products_process_checkQuery query = new products_process_checkQuery();
        products_process_checkQuery.Criteria criteria = query.createCriteria();
        criteria.andProcessIdEqualTo(check.getProcessId());
        return mapper.selectByExample(query);
    }
}
