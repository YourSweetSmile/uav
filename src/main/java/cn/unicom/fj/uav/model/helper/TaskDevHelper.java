package cn.unicom.fj.uav.model.helper;

import cn.unicom.fj.uav.model.Device;
import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.TaskType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TaskDevHelper extends Task{
private TaskType taskType;
private String device;
private Route rodes;
private String order;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,locale = "zh", timezone = "GMT+8")
    private Date taskBuildTime1;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh", timezone = "GMT+8")
    private Date taskStartTime1;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh", timezone = "GMT+8")
    private Date taskEndTime1;
    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Route getRodes() {
        return rodes;
    }

    public void setRodes(Route rodes) {
        this.rodes = rodes;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Date getTaskBuildTime1() {
        return taskBuildTime1;
    }

    public void setTaskBuildTime1(Date taskBuildTime1) {
        this.taskBuildTime1 = taskBuildTime1;
    }

    public Date getTaskStartTime1() {
        return taskStartTime1;
    }

    public void setTaskStartTime1(Date taskStartTime1) {
        this.taskStartTime1 = taskStartTime1;
    }

    public Date getTaskEndTime1() {
        return taskEndTime1;
    }

    public void setTaskEndTime1(Date taskEndTime1) {
        this.taskEndTime1 = taskEndTime1;
    }

    @Override
    public String toString() {
        return "TaskDevHelper{" +
                "taskType=" + taskType +
                ", device='" + device + '\'' +
                ", rodes=" + rodes +
                ", order='" + order + '\'' +
                ", taskBuildTime1=" + taskBuildTime1 +
                ", taskStartTime1=" + taskStartTime1 +
                ", taskEndTime1=" + taskEndTime1 +
                '}';
    }
}
