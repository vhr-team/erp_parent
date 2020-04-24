package cn.ddossec.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ddossec.domain.Goods;
import cn.ddossec.mapper.GoodsMapper;
import cn.ddossec.service.GoodsService;
/**  
    * @title: GoodsServiceImpl
    * @projectName erp_parent
    * @description: TODO
    * @author 30315
    * @date 2020-04-2410:14
    */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService{

}
