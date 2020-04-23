package cn.ddossec.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ddossec.mapper.ProductTypeMapper;
import cn.ddossec.domain.ProductType;
import cn.ddossec.service.ProductTypeService;
/**  
    * @title: ProductTypeServiceImpl
    * @projectName erp_parent
    * @description: TODO
    * @author 30315
    * @date 2020-04-2310:49
    */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements ProductTypeService{

}
