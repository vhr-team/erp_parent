package cn.ddossec.vo;

import cn.ddossec.domain.LeaveBill;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class LeaveBillVo extends LeaveBill implements Serializable {

    // 批量删除使用
    private Integer[] ids;

    // 开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    // 结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    private Integer page;
    private Integer limit;

}
