package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.TaskMapper;
import cn.unicom.fj.uav.dao.helper.FlyTaskDao;
import cn.unicom.fj.uav.model.Route;
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

 //统计飞行次数
  public List<FlyTask> getFlyCount(int taskId){
    return flyTaskDao.getFlyCount(taskId);
  }

  //更改删除状态
  public int IsDeleteByPrimaryKey(Short id) {
      return flyTaskDao.IsDeleteByPrimaryKey(id);
  }
//  //新增
public int insertFly(FlyTask record){
    return flyTaskDao.insertFly(record);
}
  //更新
  public int updateFlyTask(FlyTask record){
      return flyTaskDao.updateFlyTask(record);
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
