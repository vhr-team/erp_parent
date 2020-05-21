package cn.ddosec.design.entity;

import cn.ddosec.design.pojo.product_check;
import cn.ddosec.design.pojo.product_design_record;
import lombok.Data;

/**
 * @author joker_dj
 * @create 2020-05-19日 22:39
 */
@Data
public class productcheck {
    private product_design_record record;
    private product_check check;
}
