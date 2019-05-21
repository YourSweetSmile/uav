package cn.unicom.fj.uav.model;

import java.math.BigDecimal;
import java.util.Date;

public class Device {
    private Short id;

    private String deviceType;

    private Short taskTypeId;

    private String deviceStatus;

    private String deviceNum;

    private String deviceName;

    private String deviceComm;

    private Integer powerMax;

    private Integer capacity;

    private Integer flyMileage;

    private BigDecimal windRes;

    private BigDecimal waterRes;

    private BigDecimal hitRes;

    private BigDecimal flexibility;

    private BigDecimal emcRes;

    private Short imgId;

    private BigDecimal wingLoss;

    private BigDecimal powerLoss;

    private BigDecimal cameraLoss;

    private BigDecimal packLoss;

    private BigDecimal engineLoss;

    private BigDecimal baseLoss;

    private Date createTime;

    private String deviceDesc;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public Short getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(Short taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus == null ? null : deviceStatus.trim();
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDeviceComm() {
        return deviceComm;
    }

    public void setDeviceComm(String deviceComm) {
        this.deviceComm = deviceComm == null ? null : deviceComm.trim();
    }

    public Integer getPowerMax() {
        return powerMax;
    }

    public void setPowerMax(Integer powerMax) {
        this.powerMax = powerMax;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getFlyMileage() {
        return flyMileage;
    }

    public void setFlyMileage(Integer flyMileage) {
        this.flyMileage = flyMileage;
    }

    public BigDecimal getWindRes() {
        return windRes;
    }

    public void setWindRes(BigDecimal windRes) {
        this.windRes = windRes;
    }

    public BigDecimal getWaterRes() {
        return waterRes;
    }

    public void setWaterRes(BigDecimal waterRes) {
        this.waterRes = waterRes;
    }

    public BigDecimal getHitRes() {
        return hitRes;
    }

    public void setHitRes(BigDecimal hitRes) {
        this.hitRes = hitRes;
    }

    public BigDecimal getFlexibility() {
        return flexibility;
    }

    public void setFlexibility(BigDecimal flexibility) {
        this.flexibility = flexibility;
    }

    public BigDecimal getEmcRes() {
        return emcRes;
    }

    public void setEmcRes(BigDecimal emcRes) {
        this.emcRes = emcRes;
    }

    public Short getImgId() {
        return imgId;
    }

    public void setImgId(Short imgId) {
        this.imgId = imgId;
    }

    public BigDecimal getWingLoss() {
        return wingLoss;
    }

    public void setWingLoss(BigDecimal wingLoss) {
        this.wingLoss = wingLoss;
    }

    public BigDecimal getPowerLoss() {
        return powerLoss;
    }

    public void setPowerLoss(BigDecimal powerLoss) {
        this.powerLoss = powerLoss;
    }

    public BigDecimal getCameraLoss() {
        return cameraLoss;
    }

    public void setCameraLoss(BigDecimal cameraLoss) {
        this.cameraLoss = cameraLoss;
    }

    public BigDecimal getPackLoss() {
        return packLoss;
    }

    public void setPackLoss(BigDecimal packLoss) {
        this.packLoss = packLoss;
    }

    public BigDecimal getEngineLoss() {
        return engineLoss;
    }

    public void setEngineLoss(BigDecimal engineLoss) {
        this.engineLoss = engineLoss;
    }

    public BigDecimal getBaseLoss() {
        return baseLoss;
    }

    public void setBaseLoss(BigDecimal baseLoss) {
        this.baseLoss = baseLoss;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDeviceDesc() {
        return deviceDesc;
    }

    public void setDeviceDesc(String deviceDesc) {
        this.deviceDesc = deviceDesc == null ? null : deviceDesc.trim();
    }
}