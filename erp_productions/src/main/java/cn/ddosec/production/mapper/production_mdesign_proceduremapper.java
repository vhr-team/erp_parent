package cn.ddosec.production.mapper;

import cn.ddosec.production.pojo.production_mdesign_procedure;
import cn.ddosec.production.pojo.production_mdesign_procedureQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface production_mdesign_proceduremapper {
    int countByExample(production_mdesign_procedureQuery example);

    int deleteByExample(production_mdesign_procedureQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(production_mdesign_procedure record);

    int insertSelective(production_mdesign_procedure record);

    List<production_mdesign_procedure> selectByExample(production_mdesign_procedureQuery example);

    production_mdesign_procedure selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") production_mdesign_procedure record, @Param("example") production_mdesign_procedureQuery example);

    int updateByExample(@Param("record") production_mdesign_procedure record, @Param("example") production_mdesign_procedureQuery example);

    int updateByPrimaryKeySelective(production_mdesign_procedure record);

    int updateByPrimaryKey(production_mdesign_procedure record);
}
