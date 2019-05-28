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

    public List<UserHelper> getAllData() {
        return userHelperMapper.getAllData();
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
    public User selectByPrimaryKey(Short id) {
        return userHelperMapper.selectByPrimaryKey(id);
    }

    /**
     * 模糊搜索（根据姓名，性别，管理员职务搜索）
     */
    public List<User> getNewsByCon(
            String userName, String userPri, String userSex, Integer isDelete
    ) {
        return userHelperMapper.getNewsByCondition(userName, userPri, userSex, isDelete);
    }

    /**
     * 根据id值改变删除的状态
     */
    public int updateIsDeleteByPrimaryKey(User id) {
        return userHelperMapper.updateIsDeleteByPrimaryKey(id);
    }

    /**
     * 重新构造数据
     */
    public List<UserHelper> constructorNewData() {
     return userHelperMapper.calsum();
    }
    /**
     * 每个月份对应的人数总数
     */
    public List<UserHelper> constructorArray(){
        return userHelperMapper.getArray();
    }
    /**
     * 获取对应省份人数
     */
    public List<UserHelper> provinceTotal(){
        return userHelperMapper.provinSum();
    }
    /**
     * 首页的计算设备中停用和正在使用的机型
     */
    public List<UserHelper> shouDevTotal(){
        return userHelperMapper.shouDev();
    }
    /**
     * 首页的计算设备中停用和正在使用的机型
     */
    public List<UserHelper> shouThrouble(){
        return userHelperMapper.shouTrouble();
    }
}
