package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.TaskTypeMapper;
import cn.unicom.fj.uav.model.TaskType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskTypeService {

    @Autowired
    private TaskTypeMapper taskTypeMapper;

    //查询所有任务类型
    public List<TaskType> getTaskType(){
        return taskTypeMapper.selectAll();
    }
}
