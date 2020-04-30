package cn.ddosec.sale.service.Impl;

import cn.ddosec.sale.entity.PageResult;
import cn.ddosec.sale.mapper.sale_tablemapper;
import cn.ddosec.sale.pojo.sale_table;
import cn.ddosec.sale.pojo.sale_tableQuery;
import cn.ddosec.sale.service.sale_masterService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author joker_dj
 * @create 2020-04-27日 13:35
 */
@Service
@Transactional
public class sale_masterServiceImpl implements sale_masterService {
    @Autowired
    private sale_tablemapper mapper;

    @Override
    public PageResult findPage(Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        sale_tableQuery Query = new sale_tableQuery();
        Query.setOrderByClause("sale_initial_date desc");//排序

        Page<sale_table> sale_tables = (Page<sale_table>) mapper.selectByExample(Query);

        return new PageResult(0, "查询成功", sale_tables.getTotal(), sale_tables.getResult());
    }
}
