package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.User;
import cn.unicom.fj.uav.model.helper.UserHelper;
import cn.unicom.fj.uav.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControl {
    @Autowired
    private UserService userService;

    /**
     * 查询所有的数据
     *
     * @param userHelper
     * @return
     */
    @RequestMapping("/list")
    public List<UserHelper> getAllData(@RequestBody UserHelper userHelper) {
        return userService.getAllData(userHelper);
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
            @RequestParam(value = "limit", defaultValue = "5") Integer limit,
            @RequestParam(name = "userName", defaultValue = "") String userName,
            @RequestParam(name = "userPri", defaultValue = "") String userPrivileges,
            @RequestParam(name = "userSex", defaultValue = "") String userSex
    )
    {
        PageHelper.startPage(page, limit);
        List<User> list = userService.getNewsByCon(userName, userPrivileges,userSex);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
