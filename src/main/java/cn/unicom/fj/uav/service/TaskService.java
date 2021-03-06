package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.TaskMapper;
import cn.unicom.fj.uav.dao.TaskTypeMapper;
import cn.unicom.fj.uav.dao.helper.TaskHelperMapper;
import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.TaskType;
import cn.unicom.fj.uav.model.helper.TaskHelper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    /**
     * 根据条件查询数据
     */
    @Autowired
    private TaskHelperMapper taskHelperMapper;

    public List<TaskHelper> getAllTaskHelper( TaskHelper taskHelper) {
        return taskHelperMapper.getAllTaskHelper(taskHelper);
    }
    public int updateTaskByPrimaryKey(Task record){
        return taskHelperMapper.updateTaskByPrimaryKey(record);
    }

    /**
     * 按ID删除
     */
    @Autowired
    private TaskMapper taskMapper;

    public int deleteByPrimaryKey(Short id) {
        return taskMapper.deleteByPrimaryKey(id);
    }

    /**
     * 添加
     */
    public int insert(Task record) {
        return taskMapper.insert(record);
    }

    /**
     * 修改
     */
    public int updateByPrimaryKey(Task record) {
        return taskMapper.updateByPrimaryKey(record);
    }

    /**
     * 根据id查询
     */
    public Task selectByPrimaryKey(Short id) {
        return taskMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新IsDelete
     */
    public int updateIsDeleteByPrimaryKey(Short id){
        return taskHelperMapper.updateIsDeleteByPrimaryKey(id);
    }


}

