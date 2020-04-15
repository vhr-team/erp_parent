package cn.ddossec.controller;

import cn.ddossec.common.ActiveUser;
import cn.ddossec.common.DataGridView;
import cn.ddossec.common.upload.UploadProperties;
import cn.ddossec.common.upload.UploadService;
import cn.ddossec.domain.User;
import cn.ddossec.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 30315
 * @title: FileController
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-1520:21
 */
@RestController
@RequestMapping("file")
public class FileController {

    @Autowired
    private UploadService uploadService;

    @Autowired
    private UploadProperties uploadProperties;

    @Autowired
    private UserService userService;

    /**
     * 上传文件
     */
    @RequestMapping("uploadFile")
    public Object uploadFile(MultipartFile mf) {

        String path = this.uploadService.uploadImage(mf);

        String baseUrl = uploadProperties.getBaseUrl();
        Map<String, String> map = new HashMap<>();
        map.put("src", baseUrl + path);
        //更新数据库
        ActiveUser activeUser = (ActiveUser) SecurityUtils.getSubject().getPrincipal();
        User user = activeUser.getUser();
        user.setImgpath(path);
        userService.updateUser(user);

        return new DataGridView(map);
    }

}
