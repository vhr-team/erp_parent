package cn.ddossec.mapper;

import cn.ddossec.domain.Leavebill;
import cn.ddossec.vo.LeavebillVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author 30315
 * @title: LeavebillMapper
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1720:29
 */
public interface LeavebillMapper extends BaseMapper<Leavebill> {

    // 查询请假单的信息
    List<Leavebill> queryAllLeavebill(LeavebillVo leavebillVo);

}
