package cn.ddosec.production.entity;

import cn.ddosec.production.pojo.products_process_check;
import cn.ddosec.production.pojo.products_process_design_sheet;
import lombok.Data;

/**
 * @author joker_dj
 * @create 2020-05-20日 8:53
 */
@Data
public class check_sheet {
    private products_process_check check;
    private products_process_design_sheet sheet;
}
