package cn.ddossec.vo;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 订单查询条件的封装类
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderModelVo extends BaseVo {

    // 订单创建人
    private Integer creater;
    private String createrName;

    private Integer minTotalNum;
    private Integer maxTotalNum;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    private Integer minTotalPrice;
    private Integer maxTotalPrice;

    /**
     * 订单类型
     */
    private Integer orderType;

    // 订单状态
    private Integer orderState;

    /**
     * 供应商ID
     */
    private Integer supplierId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date auditEndTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date auditStartTime;

    // 审核人
    private Integer checker;
    private String checkerName;

    /**
     * 订单负责人(ID）
     */
    private Integer completer;
    private String completerName;

    /**
     * 发货方式
     */
    private Integer ndeeds;
}