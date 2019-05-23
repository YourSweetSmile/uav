package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.AdminUser;
import cn.unicom.fj.uav.model.User;
import cn.unicom.fj.uav.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="login")
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @RequestMapping(value="system")
    public AdminUser selectByPrimaryKey(@RequestParam(value = "id") Short id){
        return adminUserService.selectByPrimaryKey(id);
    }
}
