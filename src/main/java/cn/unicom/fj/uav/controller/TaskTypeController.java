package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.TaskType;
import cn.unicom.fj.uav.service.TaskTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="tasktype")
public class TaskTypeController {

    @Autowired
    private TaskTypeService taskTypeService;

    //查询所有任务类型
    @RequestMapping(value="getall")
    public List<TaskType> getTaskType(){
        return taskTypeService.getTaskType();
    }
}
