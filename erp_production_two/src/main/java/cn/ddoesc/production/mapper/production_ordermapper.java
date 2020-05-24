package cn.ddoesc.production.mapper;

import cn.ddoesc.production.pojo.production_order;
import cn.ddoesc.production.pojo.production_orderQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface production_ordermapper {
    int countByExample(production_orderQuery example);

    int deleteByExample(production_orderQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(production_order record);

    int insertSelective(production_order record);

    List<production_order> selectByExample(production_orderQuery example);

    production_order selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") production_order record, @Param("example") production_orderQuery example);

    int updateByExample(@Param("record") production_order record, @Param("example") production_orderQuery example);

    int updateByPrimaryKeySelective(production_order record);

    int updateByPrimaryKey(production_order record);
}
