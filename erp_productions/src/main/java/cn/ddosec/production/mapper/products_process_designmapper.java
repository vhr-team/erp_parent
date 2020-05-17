package cn.ddosec.production.mapper;

import cn.ddosec.production.pojo.products_process_design;
import cn.ddosec.production.pojo.products_process_designQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface products_process_designmapper {
    int countByExample(products_process_designQuery example);

    int deleteByExample(products_process_designQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(products_process_design record);

    int insertSelective(products_process_design record);

    List<products_process_design> selectByExample(products_process_designQuery example);

    products_process_design selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") products_process_design record, @Param("example") products_process_designQuery example);

    int updateByExample(@Param("record") products_process_design record, @Param("example") products_process_designQuery example);

    int updateByPrimaryKeySelective(products_process_design record);

    int updateByPrimaryKey(products_process_design record);
}
