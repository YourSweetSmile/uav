package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.TaskMapper;
import cn.unicom.fj.uav.dao.helper.FlyTaskDao;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.helper.FlyTask;
import cn.unicom.fj.uav.model.helper.RouteHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FlyService {
  @Autowired
 private FlyTaskDao flyTaskDao;
  //查询飞行区域统计表字段
  public List<FlyTask> getAllTask(){
    return flyTaskDao.getAllTask();
  }

  //删除
  public void delect(Short id){
    flyTaskDao.selectByPrimaryKey(id);
  }
//  //新增
//  public int insertFly(Task record){
//    return flyTaskDao.insertSelective(record);
//  }
  //新增
  public int insertFly(Byte taskTypeId,Short deviceId,String taskStartTime,Short rodeId){
    return flyTaskDao.insertFly(taskTypeId,deviceId,taskStartTime,rodeId);
  }
  //更新
  public int updateFlyTask(Short id,Byte taskTypeId,Short deviceId,String taskStartTime,Short rodeId){
    return flyTaskDao.updateFlyTask(id,taskTypeId,deviceId,taskStartTime,rodeId);
  }

//  //检索
//  public List<FlyTask> getNewsByCon(String taskType,String deviceId,String route, String order){
//    return flyTaskDao.getNewsByCondition(taskType,deviceId,route,order);
//  }
//检索
public List<FlyTask> getNewsByCon(FlyTask flyTask){
    return flyTaskDao.getNewsByCondition(flyTask);
}


}
