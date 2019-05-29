package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.User;
import cn.unicom.fj.uav.model.helper.UserHelper;
import cn.unicom.fj.uav.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControl {
    @Autowired
    private UserService userService;

    /**
     * 查询所有的数据
     *
     * @return
     */
    @RequestMapping("/list")
    public List<UserHelper> getAllData() {
        return userService.getAllData();
    }

    /**
     * 增加一条数据
     */
    @RequestMapping("/add")
    public int insert(@RequestBody User record) {
        return userService.insert(record);
    }

    /**
     * 删除一条数据
     */
    @RequestMapping("/del")
    public int deleteByPrimaryKey(@RequestParam(name = "id") short id) {
        return userService.deleteByPrimaryKey(id);
    }

    /**
     * 更改数据
     */
    @RequestMapping("/update")
    public int updateByPrimaryKey(@RequestBody User record) {
        return userService.updateByPrimaryKey(record);
    }

    /**
     * 根据id查询数据
     */
    @RequestMapping("/serchId")
    public User selectByPrimaryKey(@RequestParam(name = "id") short id) {
        return userService.selectByPrimaryKey(id);
    }

    /**
     * 根据输入值模糊搜索--分页
     */
    @GetMapping("/select")
    public PageInfo<User> select(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "limit", defaultValue = "10") Integer limit,
            @RequestParam(name = "userName", defaultValue = "") String userName,
            @RequestParam(name = "userPri", defaultValue = "") String userPrivileges,
            @RequestParam(name = "userSex", defaultValue = "") String userSex,
            @RequestParam(name = "isDelete", defaultValue = "") Integer isDelete
    ) {
        PageHelper.startPage(page, limit);
        List<User> list = userService.getNewsByCon(userName, userPrivileges, userSex, isDelete);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 改变isDelete的状态值
     */
    @RequestMapping("/delStatu")
    public Integer updateIsDeleteByPrimaryKey(@RequestBody User userId) {
        return userService.updateIsDeleteByPrimaryKey(userId);
    }

    /**
     * 改变数据格式
     */
    @RequestMapping("/newData")
    public List<UserHelper> constructorNewData() {
        return userService.constructorNewData();
    }

    /**
     * 每个月份对应的人数总数
     */
    @RequestMapping("/getArray")
    public List<UserHelper> getArray() {
        List<UserHelper> aa=userService.constructorArray();
        System.out.println(aa.get(0));
        return aa;
    }

    /**
     * 获取对应省份人数
     */
    @RequestMapping("/province")
    public List<UserHelper> getProv() {
        return userService.provinceTotal();
    }

    /**
     首页的计算设备中停用和正在使用的机型
     */
    @RequestMapping("/shouDev")
    public List<UserHelper> getShouDev() {
        return userService.shouDevTotal();
    }
    /**
     首页的计算设备中停用和正在使用的机型
     */
    @RequestMapping("/shouTrouble")
    public List<UserHelper> getShouTrouble() {
        return userService.shouThrouble();
    }
}
