package cn.unicom.fj.uav.controller;

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
    @RequestMapping(value="list")
    public List<TaskHelper> getAllTaskHelper(@RequestBody TaskHelper taskHelper){
        return taskService.getAllTaskHelper(taskHelper);
    }
}
