package cn.ddosec.production.controller;

import cn.ddosec.production.entity.check_sheet;
import cn.ddosec.production.entity.sheet;
import cn.ddosec.production.pojo.products_process_check;
import cn.ddosec.production.pojo.products_process_design;
import cn.ddosec.production.pojo.products_process_design_sheet;
import cn.ddosec.production.service.feign.designService;
import cn.ddosec.production.service.processService;
import cn.ddosec.production.service.processcheckService;
import cn.ddosec.production.service.productsService;
import cn.ddossec.domain.pojo.Response;
import cn.ddossec.domain.pojo.product_design_record;
import cn.ddossec.domain.pojo.product_material_archives;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-16日 10:34
 */
@RequestMapping("/product")
@RestController
public class productController {

    @Autowired
    designService feignservice;
    @Autowired
    productsService service;

    @Autowired
    processService processService;

    @Autowired
    processcheckService checkservice;

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
     * 查询未工序设计&&审核通过的档案
     *
     * @return
     */
    @RequestMapping("/selectprocessAll")
    public List<product_design_record> selectprocessAll(@RequestBody product_design_record record) {
        List<product_design_record> product_design_records = feignservice.selectprocessAll(record);
        System.out.println(product_design_records);
        return product_design_records;
    }

    @RequestMapping("/selectmaterialByproidAll")
    public List<product_material_archives> selectmaterialByproidAll(@RequestParam String productId) {
        return feignservice.selectByproId(productId);
    }

    @RequestMapping("/add")
    public Response add(@RequestBody sheet sheet) {
        product_design_record product_design_record = new product_design_record();
        product_design_record.setProductId(sheet.getProcess().getProductId());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String sumprices = "";
        String processId = Getnum();
        String processDate = df.format(new Date());
        products_process_design products_process_design = new products_process_design();
        products_process_design.setProcessId(processId);
        products_process_design.setProductName(sheet.getProcess().getProductName());
        products_process_design.setProductid(sheet.getProcess().getProductId());
        products_process_design.setDesdate(processDate);
        products_process_design.setDesregister(sheet.getProcess().getProcessRegister());
        products_process_design.setProcessCheck("待审核");
        feignservice.updatecheck(product_design_record);
        processService.addprocess(products_process_design);
        for (products_process_design_sheet products_process_design_sheet : sheet.getSheet()) {
            sumprices += Integer.parseInt(products_process_design_sheet.getTimeprice());
        }
        try {
            for (products_process_design_sheet sheets : sheet.getSheet()) {
                products_process_design_sheet sheetss = new products_process_design_sheet();
                sheetss.setProductId(sheet.getProcess().getProductId());
                sheetss.setProductName(sheet.getProcess().getProductName());
                sheetss.setProcessName(sheets.getProcessName());
                sheetss.setTimenumber(sheets.getTimenumber());
                sheetss.setTimeunit(sheets.getTimeunit());
                sheetss.setTimeprice(sheets.getTimeprice());
                sheetss.setTimesumprice(sumprices);
                sheetss.setProcessRegister(sheet.getProcess().getProcessRegister());
                sheetss.setProcessRequire(sheet.getProcess().getProcessRequire());
                sheetss.setProcessRemark(sheet.getProcess().getProcessRemark());
                sheetss.setProcessId(processId);
                sheetss.setProcessDate(processDate);
                sheetss.setProcessCheck("待审核");
                service.addsheet(sheetss);
            }
            return new Response(true, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "添加失败");
        }
    }

    @RequestMapping("/selectAll")
    public List<products_process_design> selectAll(@RequestBody products_process_design design) {
        List<products_process_design> products_process_designs = processService.selectAll(design);
        return products_process_designs;
    }

    @RequestMapping("/selectAlltwo")
    public List<products_process_design> selectAll() {
        List<products_process_design> products_process_designs = processService.selectAll(null);
        return products_process_designs;
    }

    @RequestMapping("/selectAllSheet")
    public List<products_process_design_sheet> selectAllSheet(@RequestBody products_process_design_sheet sheet) {
        return service.selectAllSheet(sheet);
    }

    @RequestMapping("/updatecheck")
    public Response updatechecksheet(@RequestBody check_sheet check_sheet) {
        System.out.println(check_sheet);
        products_process_design products_process_design = new products_process_design();
        products_process_design.setProcessCheck(check_sheet.getSheet().getProcessCheck());
        products_process_design.setProcessId(check_sheet.getSheet().getProcessId());
        try {
            processService.updatecheck(products_process_design);
            service.updatecheck(check_sheet.getSheet());
            checkservice.addcheck(check_sheet.getCheck());
            return new Response(true, "审核成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "审核失败");
        }
    }

    @RequestMapping("/selectcheckAll")
    public List<products_process_design> selectcheckAll(@RequestBody products_process_design design) {
        List<products_process_design> products_process_designs = processService.selectcheckAll(design);
        return products_process_designs;
    }

    @RequestMapping("/selectprocessById")
    public List<products_process_design_sheet> selectprocessById(String processId) {
        return service.selectprocessById(processId);
    }

    @RequestMapping("/addsheet")
    public Response addsheet(@RequestBody sheet sheet) {
        String sumprices = "";
        for (products_process_design_sheet products_process_design_sheet : sheet.getSheet()) {
            sumprices += Integer.parseInt(products_process_design_sheet.getTimeprice());
        }
        try {
            products_process_design_sheet sheet1 = new products_process_design_sheet();
            products_process_design products_process_design = new products_process_design();
            products_process_design.setProcessId(sheet.getProcess().getProcessId());
            products_process_design.setProcessCheck("待审核");
            for (products_process_design_sheet s : sheet.getSheet()) {
                service.deleteByprocessId(s.getProcessId());
                sheet1.setProductName(s.getProductName());
                sheet1.setProductId(s.getProductId());
                sheet1.setProcessId(sheet.getProcess().getProcessId());
                sheet1.setProcessCheck("待审核");
                for (products_process_design_sheet s2 : sheet.getSheet()) {
                    sheet1.setProcessName(s2.getProcessName());
                    sheet1.setProcessRemark(s2.getProcessRemark());
                    sheet1.setProcessDate(s2.getProcessDate());
                    sheet1.setProcessRequire(s2.getProcessRequire());
                    sheet1.setProcessRegister(s2.getProcessRegister());
                    sheet1.setTimeprice(s2.getTimeprice());
                    sheet1.setTimenumber(s2.getTimenumber());
                    sheet1.setTimesumprice(sumprices);
                    sheet1.setTimeunit(s2.getTimeunit());
                    processService.updatecheck(products_process_design);
                    service.addsheet(sheet1);
                }
            }
            return new Response(true, "成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "失败");
        }
    }
    /*查询审核日志*/
    @RequestMapping("/selectprocesscheck")
    @ApiOperation("查询审核日志")
    public List<products_process_check> selectcheck(@RequestBody products_process_check check) {
        return checkservice.selectcheck(check);
    }

}
