package cn.ddosec.production.entity;

import cn.ddosec.production.pojo.products_process_design_sheet;
import lombok.Data;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-17日 17:06
 */
@Data
public class sheet {
    private products_process_design_sheet process;
    private List<products_process_design_sheet> sheet;

}
