package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.AdminUserMapper;
import cn.unicom.fj.uav.exception.SysRuntimeExeption;
import cn.unicom.fj.uav.model.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminUserService {

    @Autowired
    private AdminUserMapper adminUserMapper;

    public AdminUser login(AdminUser adminUser){
        AdminUser a=new AdminUser();
        a=adminUserMapper.login(adminUser);
        if(null==a){
            throw new SysRuntimeExeption("登录失败");
        }
        return a;
    }

}
