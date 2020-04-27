package cn.ddosec.sale.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-27日 13:40
 */
@Data
public class PageResult implements Serializable {
    private Integer code;//返回code
    private String msg;//返回信息
    private Long count;//总记录数
    private List data;//当前页结果

    public PageResult() {
    }

    public PageResult(Integer code, String msg, Long count, List data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }
}
