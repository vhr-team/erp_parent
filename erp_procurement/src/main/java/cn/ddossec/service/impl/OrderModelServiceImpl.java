package cn.ddossec.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ddossec.mapper.OrderModelMapper;
import cn.ddossec.domain.OrderModel;
import cn.ddossec.service.OrderModelService;
@Service
public class OrderModelServiceImpl extends ServiceImpl<OrderModelMapper, OrderModel> implements OrderModelService{

}
