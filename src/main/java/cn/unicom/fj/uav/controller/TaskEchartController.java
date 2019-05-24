package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.helper.TaskEchartHelper;
import cn.unicom.fj.uav.service.TaskEchartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "task")
public class TaskEchartController {
    @Autowired
    private TaskEchartService taskEchartService;
    @RequestMapping(value = "echart")
    public List<TaskEchartHelper> getTaskCount(){
        return taskEchartService.getTaskCount();
    }
}
