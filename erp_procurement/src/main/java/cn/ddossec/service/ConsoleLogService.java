package cn.ddossec.service;

import cn.ddossec.domain.ConsoleLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ConsoleLogService extends IService<ConsoleLog>{

    /**
     * 根据实体ID，查询操作日志信息
     * @param consoleLog
     * @return
     */
    List<ConsoleLog> getConsoleLogByOrderId(ConsoleLog consoleLog);
}
