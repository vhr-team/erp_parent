package cn.ddosec.design.service;

import cn.ddosec.design.pojo.product_material_archives;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-02日 18:58
 */
public interface material_archivesService {
    void addarchives(product_material_archives archives);

    /**
     * 根据产品id查询物料组成
     *
     * @param proId
     * @return
     */
    List<product_material_archives> selectByproId(String proId);

    /**
     * 查询数量
     *
     * @param proId
     * @return
     */
    int selecyCountByproId(String proId);

    List<product_material_archives> selectByproIdOne(String ID);

    /**
     * 删除物料组成
     *
     * @param proID
     */
    void deletearchives(String proID);

    /**
     * 查询数量
     *
     * @param ID
     * @return
     */
    int selectcount(String ID);


    List<product_material_archives> selectBymaterielArchivesId(String materielArchivesId);
}
