package cn.unicom.fj.uav.model;

import java.util.Date;

public class Task {
    private Short id;

    private String taskName;

    private Byte taskTypeId;

    private Short deviceId;

    private Date taskBuildTime;

    private Date taskStartTime;

    private Date taskEndTime;

    private Short rodeId;

    private String taskStatus;

    private String isDelete;

    private String taskHeader;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Byte getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(Byte taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public Short getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Short deviceId) {
        this.deviceId = deviceId;
    }

    public Date getTaskBuildTime() {
        return taskBuildTime;
    }

    public void setTaskBuildTime(Date taskBuildTime) {
        this.taskBuildTime = taskBuildTime;
    }

    public Date getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public Date getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    public Short getRodeId() {
        return rodeId;
    }

    public void setRodeId(Short rodeId) {
        this.rodeId = rodeId;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getTaskHeader() {
        return taskHeader;
    }

    public void setTaskHeader(String taskHeader) {
        this.taskHeader = taskHeader == null ? null : taskHeader.trim();
    }
}