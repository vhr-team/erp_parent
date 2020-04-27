package cn.ddossec.controller;


import cn.ddossec.domain.Basics_supper;
import cn.ddossec.service.Basics_supperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *供货商控制器
 */
@RestController
@RequestMapping("/supper")
public class Basics_supperController {

    @Autowired
    Basics_supperService basics_supperService;



    @RequestMapping("/deleteIds")
    public  Map<String,Object> deleteIds(String[] params){
        System.out.println("123");
        for(int i=0;i<params.length;i++){
            basics_supperService.deleteIds(params[i]);
        }
        Map<String,Object> rut = new HashMap<>();
        rut.put("suc","OJBK");
        return rut ;
    }

    /**
     * 查询全部供应商
     * @return
     */
    @RequestMapping("/getAllSupper")
    public List<Basics_supper> getAllSupper(){

        return basics_supperService.findAll();
    }
    @RequestMapping("/sellName")
    public Map<String,Object> sellName( @RequestParam(value="name" ,defaultValue = "")String  name,@RequestParam(value="page" ,defaultValue = "1") Integer page,@RequestParam(value="rows" ,defaultValue = "10") Integer rows){

        List<Basics_supper> basics_suppers = basics_supperService.sellName(name,page,rows);
        Map<String,Object> rut = new HashMap<>();
        rut.put("data",basics_suppers);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",basics_supperService.sellCount());
        return rut ;
    }
    /*
     * 查询所有供货商信息
     * @param model
     * @return
     */
    @RequestMapping("/getAllBasics_supper")
    public Map<String,Object> getAllBasics_supper(@RequestParam(value="page" ,defaultValue = "1") Integer page,@RequestParam(value="rows" ,defaultValue = "10") Integer rows){
        Map<String,Object> rut = new HashMap<>();
        List<Basics_supper> list = basics_supperService.findAllBasics_supper(page,rows);
        rut.put("data",list);
        rut.put("code",0);
        rut.put("msg","");
        rut.put("count",basics_supperService.sellCount());
        return rut ;
    }

    /*
     * 根据id删除供货商
     * @param id
     * @return
     */
    @RequestMapping("/delsupperById")
    public String delsupperById(int id){
        System.out.println("123");
        basics_supperService.delBasics_supperMapperById(id);
        return "200";
    }

    /*
     * 添加供货商
     * @param basics_supper
     * @return
     */
    @RequestMapping("/insertSupper")
    public String insertSupper(Basics_supper basics_supper){
        System.out.println(basics_supper);
        System.out.println(basics_supper);

        basics_supperService.insertBasics_supper(basics_supper);
        return "添加成功";
    }


    /*
     * 修改之前查询数据
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("editItemsSupper/{id}")
    public String editItemsSupper(@PathVariable("id") Integer id,Model model){
        /*调用service根据id查询*/
        Basics_supper basics_supper = basics_supperService.selectById(id);
        model.addAttribute("basics_supper",basics_supper);
        return "update";
    }


    /*
     * 修改
     * @param basics_supper
     * @return
     */
    @RequestMapping("/updateSupperById")
    public String updateSupperById(Basics_supper basics_supper){
        System.out.println(basics_supper);
        boolean b = basics_supperService.updateBasics_supper(basics_supper);
        if (b){
          return "修改成功";
        }
        return "NO";
    }

}
