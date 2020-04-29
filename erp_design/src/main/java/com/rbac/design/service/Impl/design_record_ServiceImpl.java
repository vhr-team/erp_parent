package com.rbac.design.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rbac.design.entity.PageResult;
import com.rbac.design.entity.miutichecker;
import com.rbac.design.mapper.design_recordmapper;
import com.rbac.design.pojo.design_record;
import com.rbac.design.pojo.design_recordQuery;
import com.rbac.design.service.design_record_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-17日 10:34
 */
@Service
@Transactional
public class design_record_ServiceImpl implements design_record_Service {

    @Autowired
    design_recordmapper mapper;
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    /**
     * 查询全部档案
     * 加入缓存
     *
     * @return List<design_record>
     */
    @Override
    public List<design_record> queryAll() {
        //设置hash的key和value的序列化器
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new Jackson2JsonRedisSerializer<design_record>(design_record.class));
        List<design_record> design_recordAll = (List<design_record>) (Object) redisTemplate.opsForHash().values("design_recordAll");

        if (design_recordAll.size() < 1) {//判断redis是否有值 没有就设置值
            for (design_record record : mapper.selectByExample(null)) {
                redisTemplate.opsForHash().put("design_recordAll", record.getProductId(), record);//注意  key必须为String类型 否注报错 小心踩坑
            }
            return mapper.selectByExample(null);

        } else {
            return design_recordAll;
        }
    }

    /**
     * 分页查询
     *
     * @param page     页码
     * @param pageSize 显示的行数1
     * @param record   传入的档案
     * @return
     */
    @Override
    public PageResult findPage(Integer page, Integer pageSize, design_record record) {
        //利用分页助手实现分页, 第一个参数:当前页, 第二个参数: 每页展示数据条数
        PageHelper.startPage(page, pageSize);
        design_recordQuery Query = new design_recordQuery();
        design_recordQuery.Criteria criteria = Query.createCriteria();
        if (record != null) {
            if (record.getProductName() != null) {//商品名称
                criteria.andProductNameLike("%" + record.getProductName() + "%");
            }
            if (record.getRegisterTime() != null) {//建档时间

                criteria.andRegisterTimeLike("%" + record.getRegisterTime() + "%");
            }
        }
        Page<design_record> design_records = (Page<design_record>) mapper.selectByExample(Query);
        PageResult result = new PageResult(design_records.getTotal(), design_records.getResult());
        return result;
    }

    /**
     * 添加产品档案
     *
     * @param record
     */
    @Override
    public void addrecord(design_record record) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        record.setRegisterTime(df.format(new Date()));// 初始化日期
        record.setChangeTag("未变更");
        record.setCheckTag("等待审核");
        record.setPriceChangeTag("未变更");//初始化价格
        record.setDeleteTag("已下架"); //添加档案后默认上架
        record.setFileChangeAmount(0);//初始化变更次数
        redisTemplate.delete("design_recordAll");
        mapper.insertSelective(record);
    }

    /**
     * 根据主键修改档案
     *
     * @param record
     */
    @Override
    public void updaterecordById(design_record record) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        record.setChangeTime(df.format(new Date()));//变更时间
        record.setChangeTag("已变更");//
        record.setFileChangeAmount(record.getFileChangeAmount() + 1);//修改档案就登记添加一次修改次数
        mapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public design_record selectById(design_record record) {
        return mapper.selectByPrimaryKey(record.getId());
    }

    @Override
    public void deletebatch(Integer[] idx) {

        design_recordQuery Query = new design_recordQuery();//创建brandQuery对象
        design_recordQuery.Criteria criteria = Query.createCriteria();//createCriteria： 创建追加条件
        criteria.andIdIn(Arrays.asList(idx));//根据id集合删除品牌
        mapper.deleteByExample(Query);
    }

    @Override
    public PageResult reloadcheck(Integer page, Integer pageSize, design_record record) {
        PageHelper.startPage(page, pageSize);
        design_recordQuery design_recordQuery = new design_recordQuery();
        com.rbac.design.pojo.design_recordQuery.Criteria criteria = design_recordQuery.createCriteria();
        criteria.andCheckTagEqualTo("等待审核");
        Page<design_record> design_records = (Page<design_record>) mapper.selectByExample(design_recordQuery);
        return new PageResult(design_records.getTotal(), design_records.getResult());
    }

    @Override
    public void check(design_record record) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        record.setCheckTime(df.format(new Date()));
        mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void miuticheck(miutichecker checker) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String checkTime = df.format(new Date());
        for (Integer intid : checker.getId()) {
            mapper.miuticheck(checker.getChecker(), checker.getCheckTag(), intid, checkTime);
        }
    }


}
