package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.AdminUser;
import cn.unicom.fj.uav.model.User;
import cn.unicom.fj.uav.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="login")
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @RequestMapping(value="user")
    public Map login(@RequestParam(value = "userNo") String user_no,
                     @RequestParam(value = "userPwd") String user_pwd){
        AdminUser adminUser=new AdminUser();
        adminUser.setUserNo(user_no);
        adminUser.setUserPwd(user_pwd);
        adminUserService.login(adminUser);
        Map<String,Object> res=new HashMap<>();
        res.put("token","admin-token");
        return res;
    }

}
