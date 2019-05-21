package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.dao.TaskMapper;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.helper.TaskHelper;
import cn.unicom.fj.uav.service.TaskService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * @param
     * @return
     */
//    @RequestMapping(value="list")
//    public List<TaskHelper> getAllTaskHelper(@RequestBody TaskHelper taskHelper){
//        return taskService.getAllTaskHelper(taskHelper);
//        //List<TaskHelper> list=taskService.getAllTaskHelper(taskHelper);
//        //return list;
//    }
    @GetMapping(value="list")
    public PageInfo<TaskHelper> getAllTaskHelper(
                             @RequestParam(value = "page",defaultValue = "1") Integer page,
                             @RequestParam(value = "limit",defaultValue = "20") Integer limit,
                             @RequestParam(name="task_status",defaultValue="") String task_status,
                             @RequestParam(name="task_start_time",defaultValue="") String task_start_time,
                             @RequestParam(name="task_type_id",defaultValue="") String task_type_id,
                             @RequestParam(name="rode_id",defaultValue="") Integer rode_id){
        PageHelper.startPage(page,limit);
        List<TaskHelper> list=taskService.getAllTaskHelper(task_status,task_start_time,task_type_id,rode_id);
        PageInfo<TaskHelper> pageInfo=new PageInfo<>(list);
        return pageInfo;

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
