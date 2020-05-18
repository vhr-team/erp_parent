package cn.ddosec.design.service.Impl;

import cn.ddosec.design.entity.PageResult;
import cn.ddosec.design.mapper.product_design_materialmapper;
import cn.ddosec.design.pojo.product_design_material;
import cn.ddosec.design.pojo.product_design_materialQuery;
import cn.ddosec.design.service.design_materialService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-01日 14:43
 */
@Service
@Transactional
public class design_materialServiceImpl implements design_materialService {
    @Autowired
    product_design_materialmapper mapper;

    /**
     * 获取现在时间
     *
     * @return返回字符串格式yyyyMMddHHmmss
     */
    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
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

    /**
     * 分页查询物料
     *
     * @param page
     * @param pageSize
     * @param material
     * @return
     */
    @Override
    public PageResult findpage(Integer page, Integer pageSize, product_design_material material) {
        PageHelper.startPage(page, pageSize);
        product_design_materialQuery Query = new product_design_materialQuery();
        if (material != null) {
            product_design_materialQuery.Criteria criteria = Query.createCriteria();
            if (material.getProductName() != null) {
                criteria.andProductNameLike("%" + material.getProductName() + "%");
            }
            if (material.getDate() != null) {
                criteria.andDateLike("%" + material.getDate() + "%");
            }
        }
        Page<product_design_material> product_design_materials = (Page<product_design_material>) mapper.selectByExample(Query);
        return new PageResult(product_design_materials.getTotal(), product_design_materials.getResult());
    }

    /**
     * 添加物料
     *
     * @param material
     */
    @Override
    public void addmaterial(product_design_material material) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        material.setDate(df.format(new Date()));
        material.setProductId(Getnum());
        mapper.insertSelective(material);
    }

    /**
     * 修改物料
     *
     * @param material
     */
    @Override
    public void updatematerial(product_design_material material) {
        mapper.updateByPrimaryKeySelective(material);
    }

    @Override
    public List<product_design_material> selectAll() {
        return mapper.selectByExample(null);
    }

    @Override
    public List<product_design_material> selectAll(product_design_material material) {
        product_design_materialQuery Query = new product_design_materialQuery();
        if (material != null) {
            product_design_materialQuery.Criteria criteria = Query.createCriteria();
           if(material.getProductId()!=null){
               criteria.andProductIdEqualTo(material.getProductId());
           }
        }
        List<product_design_material> product_design_materials = mapper.selectByExample(Query);
        return product_design_materials;
    }

    @Override
    public product_design_material selectById(String Id) {
        product_design_material product_design_material = mapper.selectByproId(Id);
        return product_design_material;
    }
}
