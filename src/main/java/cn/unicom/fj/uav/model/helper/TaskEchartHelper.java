package cn.unicom.fj.uav.model.helper;


import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.TaskType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TaskEchartHelper extends Task {
    private TaskType taskType;
    private int taskyear;
    private int taskmonth;
    private int taskcount;
    @JsonFormat(pattern = "yyyy-MM-dd",locale="zh",timezone="GMT+8")
    private Date taskdate;

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public int getTaskyear() {
        return taskyear;
    }

    public void setTaskyear(int taskyear) {
        this.taskyear = taskyear;
    }

    public int getTaskmonth() {
        return taskmonth;
    }

    public void setTaskmonth(int taskmonth) {
        this.taskmonth = taskmonth;
    }

    public int getTaskcount() {
        return taskcount;
    }

    public void setTaskcount(int taskcount) {
        this.taskcount = taskcount;
    }

    public Date getTaskdate() {
        return taskdate;
    }

    public void setTaskdate(Date taskdate) {
        this.taskdate = taskdate;
    }

    public TaskEchartHelper() {
    }

    public TaskEchartHelper(TaskType taskType, int taskyear, int taskmonth, int taskcount) {
        this.taskType = taskType;
        this.taskyear = taskyear;
        this.taskmonth = taskmonth;
        this.taskcount = taskcount;
    }

    public TaskEchartHelper(TaskType taskType, int taskyear, int taskmonth, int taskcount, Date taskdate) {
        this.taskType = taskType;
        this.taskyear = taskyear;
        this.taskmonth = taskmonth;
        this.taskcount = taskcount;
        this.taskdate = taskdate;
    }
}
