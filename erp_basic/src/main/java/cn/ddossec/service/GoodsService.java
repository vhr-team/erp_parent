package cn.ddossec.service;

import cn.ddossec.domain.Goods;
import cn.ddossec.vo.GoodsVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 30315
 * @title: GoodsService
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2410:14
 */
public interface GoodsService extends IService<Goods> {

    /**
     * 查询所有商品，可以带查询条件
     * @param goodsVo
     * @return
     */
    DataGridView queryAllGoods(GoodsVo goodsVo);
}
