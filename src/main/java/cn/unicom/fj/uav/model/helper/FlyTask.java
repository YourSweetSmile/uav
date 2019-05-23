package cn.unicom.fj.uav.model.helper;


import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.TaskType;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class FlyTask extends Task {
////修改日期格式
//  @JsonFormat(pattern = "yyyy-MM-dd",locale="zh",timezone="GMT+8")
@JsonProperty("date")
  private Date taskStartTime;


//任务类型
  private TaskType taskType;

  public TaskType getTaskType() {
    return taskType;
  }

  public void setTaskType(TaskType taskType) {
    this.taskType = taskType;
  }

  //路线
private RouteHelper route;

  @Override
  public Date getTaskStartTime() {
    return taskStartTime;
  }

  @Override
  public void setTaskStartTime(Date taskStartTime) {
    this.taskStartTime = taskStartTime;
  }

  public RouteHelper getRoute() {
    return route;
  }

  public void setRoute(RouteHelper route) {
    this.route = route;
  }
}
