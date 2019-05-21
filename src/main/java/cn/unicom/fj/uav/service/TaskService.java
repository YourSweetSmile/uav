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
    /**
     * 查询全部
     */
    @Autowired
    private TaskHelperMapper taskHelperMapper;
    public List<TaskHelper> getAllTaskHelper(TaskHelper taskHelper){
        return taskHelperMapper.getAllTaskHelper(taskHelper);
    }
    /**
     * 按ID删除
     */
    @Autowired
    private  TaskMapper taskMapper;
    public int deleteByPrimaryKey(Short id){
        return taskMapper.deleteByPrimaryKey(id);
    }

    /**
     * 添加
     */
    public int insert(Task record){
        return taskMapper.insert(record);
    }

    /**
     * 修改
     */
    public int updateByPrimaryKey(Task record){
        return taskMapper.updateByPrimaryKey(record);
    }

    /**
     * 根据id查询
     */
    public Task selectByPrimaryKey(Short id){
        return taskMapper.selectByPrimaryKey(id);
    }
}
