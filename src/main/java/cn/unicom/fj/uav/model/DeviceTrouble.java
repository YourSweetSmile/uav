package cn.unicom.fj.uav.model;

import java.util.Date;

public class DeviceTrouble {
    private Short id;

    private Date troubleDate;

    private Short deviceId;

    private Short taskId;

    private String troubleType;

    private String troubleReason;

    private String isDelete;

    private String isCandel;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Date getTroubleDate() {
        return troubleDate;
    }

    public void setTroubleDate(Date troubleDate) {
        this.troubleDate = troubleDate;
    }

    public Short getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Short deviceId) {
        this.deviceId = deviceId;
    }

    public Short getTaskId() {
        return taskId;
    }

    public void setTaskId(Short taskId) {
        this.taskId = taskId;
    }

    public String getTroubleType() {
        return troubleType;
    }

    public void setTroubleType(String troubleType) {
        this.troubleType = troubleType == null ? null : troubleType.trim();
    }

    public String getTroubleReason() {
        return troubleReason;
    }

    public void setTroubleReason(String troubleReason) {
        this.troubleReason = troubleReason == null ? null : troubleReason.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getIsCandel() {
        return isCandel;
    }

    public void setIsCandel(String isCandel) {
        this.isCandel = isCandel == null ? null : isCandel.trim();
    }
}