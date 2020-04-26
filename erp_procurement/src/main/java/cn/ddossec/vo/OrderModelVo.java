package cn.ddossec.vo;

import lombok.*;

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
    private String createrName;
}