package cn.ddosec.production.mapper;

import cn.ddosec.production.pojo.products_process_check;
import cn.ddosec.production.pojo.products_process_checkQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface products_process_checkmapper {
    int countByExample(products_process_checkQuery example);

    int deleteByExample(products_process_checkQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(products_process_check record);

    int insertSelective(products_process_check record);

    List<products_process_check> selectByExample(products_process_checkQuery example);

    products_process_check selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") products_process_check record, @Param("example") products_process_checkQuery example);

    int updateByExample(@Param("record") products_process_check record, @Param("example") products_process_checkQuery example);

    int updateByPrimaryKeySelective(products_process_check record);

    int updateByPrimaryKey(products_process_check record);
}
