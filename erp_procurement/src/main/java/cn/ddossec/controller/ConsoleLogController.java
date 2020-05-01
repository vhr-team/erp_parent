package cn.ddossec.controller;

import cn.ddossec.domain.ConsoleLog;
import cn.ddossec.service.ConsoleLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("consolelog")
public class ConsoleLogController {

    @Autowired
    private ConsoleLogService consoleLogService;

    /**
     * 根据实体ID，查询操作日志信息
     * @param consoleLog
     * @return
     */
    @GetMapping("getConsoleLogByOrderId")
    public List<ConsoleLog> getConsoleLogByOrderId(ConsoleLog consoleLog){
        return this.consoleLogService.getConsoleLogByOrderId(consoleLog);
    }

}
