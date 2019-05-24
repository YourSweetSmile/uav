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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date taskBuildTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date taskStartTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date taskEndTime;
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

    @Override
    public Date getTaskBuildTime() {
        return taskBuildTime;
    }

    @Override
    public void setTaskBuildTime(Date taskBuildTime) {
        this.taskBuildTime = taskBuildTime;
    }

    @Override
    public Date getTaskStartTime() {
        return taskStartTime;
    }

    @Override
    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    @Override
    public Date getTaskEndTime() {
        return taskEndTime;
    }

    @Override
    public void setTaskEndTime(Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    @Override
    public String toString() {
        return "TaskDevHelper{" +
                "taskType=" + taskType +
                ", device='" + device + '\'' +
                ", rodes=" + rodes +
                ", order='" + order + '\'' +
                ", taskBuildTime=" + taskBuildTime +
                ", taskStartTime=" + taskStartTime +
                ", taskEndTime=" + taskEndTime +
                '}';
    }
}
