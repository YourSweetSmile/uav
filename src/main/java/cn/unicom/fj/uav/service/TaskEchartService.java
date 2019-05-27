package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.helper.TaskEchartMapper;
import cn.unicom.fj.uav.model.helper.TaskEchartHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskEchartService {
    @Autowired
    private TaskEchartMapper taskEchartMapper;
    public List<TaskEchartHelper> getTaskCount(){
        return taskEchartMapper.getTaskCount();
    }
    public List<TaskEchartHelper> getCountByDate(Short type){
        return taskEchartMapper.getCountByDate(type);
    }
}
