package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.AdminUserMapper;
import cn.unicom.fj.uav.model.AdminUser;
import cn.unicom.fj.uav.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminUserService {

    @Autowired
    private AdminUserMapper adminUserMapper;

    public AdminUser login(AdminUser adminUser){
        return adminUserMapper.login(adminUser);
    }
}
