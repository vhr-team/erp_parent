package cn.ddossec.service.impl;

import cn.ddossec.domain.ConsoleLog;
import cn.ddossec.domain.User;
import cn.ddossec.mapper.ConsoleLogMapper;
import cn.ddossec.service.ConsoleLogService;
import cn.ddossec.service.feign.UserFeign;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ConsoleLogServiceImpl extends ServiceImpl<ConsoleLogMapper, ConsoleLog> implements ConsoleLogService {

    @Autowired
    private UserFeign userFeign;

    /**
     * 根据实体ID，查询操作日志信息
     *
     * @param consoleLog
     * @return
     */
    @Override
    public List<ConsoleLog> getConsoleLogByOrderId(ConsoleLog consoleLog) {
        QueryWrapper<ConsoleLog> qw = new QueryWrapper<>();
        qw.eq(null != consoleLog.getEntityId(), "entity_id", consoleLog.getEntityId());
        qw.like(StringUtils.isNotBlank(consoleLog.getTableName()), "table_name", consoleLog.getTableName());
        qw.like(StringUtils.isNotBlank(consoleLog.getOptType()), "opt_type", consoleLog.getOptType());

        List<User> userList = this.userFeign.loadAllUser();
        ArrayList<ConsoleLog> newArr = new ArrayList<>();

        List<ConsoleLog> logList = this.baseMapper.selectList(qw);
        for (ConsoleLog consoleLog1 : logList) {
            for (User user : userList) {
                // 翻译操作人
                if (null != consoleLog1.getEmpId() && consoleLog1.getEmpId().equals(user.getId())) {
                    consoleLog1.setUserName(user.getName());
                }
            }
            newArr.add(consoleLog1);
        }
        return newArr;
    }
}
