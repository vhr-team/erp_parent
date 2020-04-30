package cn.ddossec.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ddossec.mapper.ConsoleLogMapper;
import cn.ddossec.domain.ConsoleLog;
import cn.ddossec.service.ConsoleLogService;
@Service
public class ConsoleLogServiceImpl extends ServiceImpl<ConsoleLogMapper, ConsoleLog> implements ConsoleLogService{

}
