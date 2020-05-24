package cn.ddosec.design.service.Impl;

import cn.ddosec.design.mapper.product_material_archivesmapper;
import cn.ddosec.design.pojo.product_material_archives;
import cn.ddosec.design.pojo.product_material_archivesQuery;
import cn.ddosec.design.service.material_archivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-02日 18:58
 */
@Service
@Transactional
public class material_archivesServiceImpl implements material_archivesService {
    @Autowired
    product_material_archivesmapper mapper;

    @Override
    public void addarchives(product_material_archives archives) {
        mapper.insertSelective(archives);
    }

    @Override
    public List<product_material_archives> selectByproId(String proId) {
        product_material_archivesQuery Query = new product_material_archivesQuery();
        product_material_archivesQuery.Criteria criteria = Query.createCriteria();
        criteria.andProductidEqualTo(proId);
        return mapper.selectByExample(Query);
    }

    @Override
    public int selecyCountByproId(String proId) {
        product_material_archivesQuery Query = new product_material_archivesQuery();
        product_material_archivesQuery.Criteria criteria = Query.createCriteria();
        criteria.andProductidEqualTo(proId);
        return mapper.countByExample(Query);
    }

    @Override
    public List<product_material_archives> selectByproIdOne(String ID) {
        List<product_material_archives> product_material_archives = mapper.selectByID(ID);
        return product_material_archives;
    }

    @Override
    public void deletearchives(String proID) {
        product_material_archivesQuery product_material_archivesQuery = new product_material_archivesQuery();
        cn.ddosec.design.pojo.product_material_archivesQuery.Criteria criteria = product_material_archivesQuery.createCriteria();
        criteria.andProductidEqualTo(proID);
        mapper.deleteByExample(product_material_archivesQuery);
    }

    @Override
    public int selectcount(String ID) {
        return mapper.selectcount(ID);
    }

    @Override
    public List<product_material_archives> selectBymaterielArchivesId(String materielArchivesId) {
        product_material_archivesQuery product_material_archivesQuery = new product_material_archivesQuery();
        product_material_archivesQuery.setOrderByClause("id desc");
        product_material_archivesQuery.Criteria criteria = product_material_archivesQuery.createCriteria();
        criteria.andAssembleidEqualTo(materielArchivesId);
        List<product_material_archives> product_material_archives = mapper.selectByExample(product_material_archivesQuery);
        return product_material_archives;
    }


}
