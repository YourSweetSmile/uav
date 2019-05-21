package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.UserMapper;
import cn.unicom.fj.uav.dao.helper.UserHelperMapper;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.User;
import cn.unicom.fj.uav.model.helper.UserHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    /**
     * 获取全部数据
     */
    @Autowired
    private UserHelperMapper userHelperMapper;

    public List<UserHelper> getAllData(UserHelper userHelper) {
        return userHelperMapper.getAllData(userHelper);
    }

    /**
     * 增加数据
     */
    public int insert(User record) {
        return userHelperMapper.insert(record);
    }

    /**
     * 删除数据
     */
    public int deleteByPrimaryKey(Short shortid) {
        return userHelperMapper.deleteByPrimaryKey(shortid);
    }

    /**
     * 改数据
     */
    public int updateByPrimaryKey(User record) {
        return userHelperMapper.updateByPrimaryKey(record);
    }
    /**
     * 根据id查询数据
     */
    public User selectByPrimaryKey(Short id){
        return userHelperMapper.selectByPrimaryKey(id);
    }
    /**
     * 模糊搜索（根据姓名，性别，管理员职务搜索）
     */
    public List<User> getNewsByCon(
            String userName,String userPri,String userSex
    ){
        return userHelperMapper.getNewsByCondition(userName,userPri,userSex);
    }
}
