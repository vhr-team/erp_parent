package cn.ddosec.production.mapper;

import cn.ddosec.production.pojo.production_processtype;
import cn.ddosec.production.pojo.production_processtypeQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface production_processtypemapper {
    int countByExample(production_processtypeQuery example);

    int deleteByExample(production_processtypeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(production_processtype record);

    int insertSelective(production_processtype record);

    List<production_processtype> selectByExample(production_processtypeQuery example);

    production_processtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") production_processtype record, @Param("example") production_processtypeQuery example);

    int updateByExample(@Param("record") production_processtype record, @Param("example") production_processtypeQuery example);

    int updateByPrimaryKeySelective(production_processtype record);

    int updateByPrimaryKey(production_processtype record);
}
