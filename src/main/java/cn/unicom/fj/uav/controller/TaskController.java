package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.dao.TaskMapper;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.helper.TaskHelper;
import cn.unicom.fj.uav.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    /**
     * 查询全部数据
     * @param taskHelper
     * @return
     */
    @RequestMapping(value="list")
    public List<TaskHelper> getAllTaskHelper(@RequestBody TaskHelper taskHelper){
        return taskService.getAllTaskHelper(taskHelper);
        //List<TaskHelper> list=taskService.getAllTaskHelper(taskHelper);
        //return list;
    }

    /**
     * 按ID删除
     */
    @RequestMapping(value="del")
    public int deleteByPrimaryKey(Short id){
        return taskService.deleteByPrimaryKey(id);
    }

    /**
     * 添加
     */
    @RequestMapping(value="ins")
    public int insert(@RequestBody Task record){
        return taskService.insert(record);
    }

    /**
     * 修改
     */
    @RequestMapping(value="upd")
    public int updateByPrimaryKey(@RequestBody Task record){
        return taskService.updateByPrimaryKey(record);
    }

    /**
     * 根据id查询
     */
    @RequestMapping(value="id")
    public Task selectByPrimaryKey(Short id){
        return taskService.selectByPrimaryKey(id);
    }
}
