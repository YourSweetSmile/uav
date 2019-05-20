package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.TaskMapper;
import cn.unicom.fj.uav.dao.helper.TaskHelperMapper;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.helper.TaskHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskHelperMapper taskHelperMapper;
    public List<TaskHelper> getAllTaskHelper(TaskHelper taskHelper){
        return taskHelperMapper.getAllTaskHelper(taskHelper);
    }
}
