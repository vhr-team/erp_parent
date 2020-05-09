package cn.ddosec.design.controller;

import cn.ddosec.design.entity.Response;
import cn.ddosec.design.entity.material_archives;
import cn.ddosec.design.pojo.product_design_material;
import cn.ddosec.design.pojo.product_design_record;
import cn.ddosec.design.pojo.product_material_archives;
import cn.ddosec.design.service.design_materialService;
import cn.ddosec.design.service.design_recordService;
import cn.ddosec.design.service.feign.erp_productionFegin;
import cn.ddosec.design.service.material_archivesService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author joker_dj
 * @create 2020-05-02日 17:21
 */
@RestController
@RequestMapping("/material_archives")
public class material_archivesController {
    @Autowired
    design_materialService materialservice;
    @Autowired
    material_archivesService service;
    @Autowired
    design_recordService recordService;


    @Autowired
    private erp_productionFegin erp_productionFegin1;

    @RequestMapping("/getAllProduction")
    public String getAllProduction(){


        return   erp_productionFegin1.getAllProduction();
    }

    /**
     * 获取现在时间
     *
     * @return返回字符串格式yyyyMMddHHmmss
     */
    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * 由年月日时分秒+3位随机数
     * 生成流水号
     *
     * @return
     */
    public static String Getnum() {
        String t = getStringDate();
        int x = (int) (Math.random() * 900) + 100;
        String serial = t + x;
        return serial;
    }

    /**
     * 物料组成
     *
     * @param archives
     */
    @ApiOperation("物料组成")
    @RequestMapping("/addarchives")
    public Response addarchives(@RequestBody material_archives archives) {
        String ID = null;
        try {
            /*判断是否存在*/
            int i = service.selectcount(archives.getRecord().getProductId());
            if (i > 0) {
                List<product_material_archives> product_material_archives = service.selectByproIdOne(archives.getRecord().getProductId());
                for (cn.ddosec.design.pojo.product_material_archives product_material_archive : product_material_archives) {
                    ID = product_material_archive.getAssembleid();//获取有的id
                }
                service.deletearchives(archives.getRecord().getProductId());//删除表中的数据
            } else {
                ID = Getnum();//如果数据库中不存在就生成随机的id
            }
            product_material_archives material_archives = null;
            for (product_material_archives archive : archives.getArchives()) {
                product_design_material product_design_material = materialservice.selectById(archive.getMaterialid());
                material_archives = new product_material_archives();
                if (archive.getAssembleid() == null) {
                    material_archives.setAssembleid(ID);//组装设计ID
                } else {
                    material_archives.setAssembleid(archive.getAssembleid());
                }
                /*设置值*/
                material_archives.setMaterialname(product_design_material.getProductName());//物料名称
                material_archives.setProductid(archives.getRecord().getProductId());//产品档案ID
                material_archives.setMaterialid(archive.getMaterialid());//物料ID
                material_archives.setMaterialnum(archive.getMaterialnum());//数量
                material_archives.setMaterialremark(archive.getMaterialremark());//描述
                material_archives.setMaterialunit(archive.getMaterialunit());//单位
                service.addarchives(material_archives);
            }
            product_design_record product_design_record = new product_design_record();
            product_design_record.setProductId(archives.getRecord().getProductId());
            product_design_record.setMaterielArchivesId(ID);
            recordService.updateByproID(product_design_record);

            return new Response(true, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "添加失败");
        }
    }

    @RequestMapping("/selectByproId")
    @ApiOperation("根据档案ID查询")
    public List<product_material_archives> selectByproId(String productId) {
        return service.selectByproId(productId);
    }

    @RequestMapping("/selectByproId2")
    @ApiOperation("根据档案ID查询")
    public Map<String,Object> selectByproId2(String  productId){
        Map<String,Object> rut = new HashMap<>();
        /*获取所有信息*/
        List<product_material_archives> list = service.selectByproId(productId);
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",100);
        return rut ;
    }
}
