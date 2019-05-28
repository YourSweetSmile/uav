package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.helper.TaskDevHelperMapper;
import cn.unicom.fj.uav.model.Device;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.helper.TaskDevHelper;
import cn.unicom.fj.uav.model.helper.TaskHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskDevService {
    @Autowired
    private TaskDevHelperMapper taskDevHelperMapper;



//    public int insert( Task data){
//        System.out.println(data instanceof Task);
//
//        return taskDevHelperMapper.insert(data);
//    }

    public List search(TaskDevHelper data){
        return taskDevHelperMapper.search(data);
    }

    public List<Device> devicesAll(){
        return taskDevHelperMapper.selectDeviceAll();
    }

    public void taskDelete(Integer id){
        taskDevHelperMapper.taskDelete(id);
    }
    public int createTask(TaskDevHelper data){
        return  taskDevHelperMapper.create(data);

    }
    public void changeStatus(Task record){
        taskDevHelperMapper.taskStatus(record);
    }
}