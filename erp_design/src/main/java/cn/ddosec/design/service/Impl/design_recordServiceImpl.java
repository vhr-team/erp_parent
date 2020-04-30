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

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author joker_dj
 * @create 2020-04-30日 10:24
 */
@Service
@Transactional
public class design_recordServiceImpl implements design_recordService {

    /**
     * 获取现在时间
     *
     * @return返回字符串格式yyyyMMddHHmmss
     */
    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
        System.out.println("TIME:::" + dateString);
        return dateString;
    }

    /**
     * 由年月日时分秒+3位随机数
     * 生成流水号
     *
     * @return
     */
    public static String Getnum() {
        String t = getStringDate();
        int x = (int) (Math.random() * 900) + 100;
        String serial = t + x;
        return serial;
    }

    @Autowired
    product_design_recordmapper mapper;

    /**
     * 分页查询
     * 查询
     *
     * @param page
     * @param pageSize
     * @param record
     * @return
     */
    @Override
    public PageResult findPage(Integer page, Integer pageSize, product_design_record record) {
        PageHelper.startPage(page, pageSize);
        product_design_recordQuery query = new product_design_recordQuery();
        product_design_recordQuery.Criteria criteria = query.createCriteria();
        criteria.andDeleteTagEqualTo("未回收");
        if (record != null) {
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
    public product_design_record selectById(Integer Id) {
        return mapper.selectByPrimaryKey(Id);
    }

    /**
     * 修改档案
     *
     * @param record
     */
    @Override
    public void updaterecord(product_design_record record) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        record.setChangeTag("已变更");
        record.setCheckTag("等待审核");
        record.setChangeTime(df.format(new Date()));
        mapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 添加档案
     * @param record
     */
    @Override
    public void addrecord(product_design_record record) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        record.setRegisterTime(df.format(new Date()));//登记时间
        record.setProductId(Getnum());//产品ID
        record.setDeleteTag("未回收");//默认未回收
        record.setChangeTag("未更改");//默认未更改
        record.setCheckTag("等待审核");//默认等待审核
        mapper.insertSelective(record);
    }

    /**
     * 档案回收
     *
     * @param record
     */
    @Override
    public void deleterecord(product_design_record record) {
        record.setDeleteTag("已回收");
        mapper.updateByPrimaryKeySelective(record);
    }


    /**
     * 查询已回收的档案
     *
     * @param page
     * @param pageSize
     * @param record
     * @return
     */
    @Override
    public PageResult findPagerecycle(Integer page, Integer pageSize, product_design_record record) {
        PageHelper.startPage(page, pageSize);
        product_design_recordQuery query = new product_design_recordQuery();
        product_design_recordQuery.Criteria criteria = query.createCriteria();
        criteria.andDeleteTagEqualTo("已回收");
        if (record != null) {
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

    /**
     * 档案恢复
     *
     * @param record
     */
    @Override
    public void recordrecover(product_design_record record) {
        record.setDeleteTag("未回收");
        mapper.updateByPrimaryKeySelective(record);
    }
}
