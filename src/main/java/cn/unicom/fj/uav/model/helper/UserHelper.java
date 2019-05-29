package cn.unicom.fj.uav.model.helper;

import cn.unicom.fj.uav.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class UserHelper extends User {
    private User user;
    private Integer allcount;
    private Integer girlcount;
    private Integer boycount;
    private Integer addcount;
    private Integer delcount;
    private Integer calNum;
    private String showTime;
    private String provin;
    private Integer allNum;
    //首页设备
    private String device;
    private Integer stopCount;
    private Integer usedCount;
    //首页设备
    private String troubleData;
    private Integer cadelCount;
    private Integer uncandelCount;

    public UserHelper() {
    }

    public UserHelper(User user, Integer allcount, Integer girlcount, Integer boycount, Integer addcount, Integer delcount, Integer calNum, String showTime, String provin, Integer allNum, String device, Integer stopCount, Integer usedCount, String troubleData, Integer cadelCount, Integer uncandelCount) {
        this.user = user;
        this.allcount = allcount;
        this.girlcount = girlcount;
        this.boycount = boycount;
        this.addcount = addcount;
        this.delcount = delcount;
        this.calNum = calNum;
        this.showTime = showTime;
        this.provin = provin;
        this.allNum = allNum;
        this.device = device;
        this.stopCount = stopCount;
        this.usedCount = usedCount;
        this.troubleData = troubleData;
        this.cadelCount = cadelCount;
        this.uncandelCount = uncandelCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAllcount() {
        return allcount;
    }

    public void setAllcount(Integer allcount) {
        this.allcount = allcount;
    }

    public Integer getGirlcount() {
        return girlcount;
    }

    public void setGirlcount(Integer girlcount) {
        this.girlcount = girlcount;
    }

    public Integer getBoycount() {
        return boycount;
    }

    public void setBoycount(Integer boycount) {
        this.boycount = boycount;
    }

    public Integer getAddcount() {
        return addcount;
    }

    public void setAddcount(Integer addcount) {
        this.addcount = addcount;
    }

    public Integer getDelcount() {
        return delcount;
    }

    public void setDelcount(Integer delcount) {
        this.delcount = delcount;
    }

    public Integer getCalNum() {
        return calNum;
    }

    public void setCalNum(Integer calNum) {
        this.calNum = calNum;
    }

    public String getShow_time() {
        return showTime;
    }

    public void setShow_time(String showTime) {
        this.showTime = showTime;
    }

    public String getProvin() {
        return provin;
    }

    public void setProvin(String provin) {
        this.provin = provin;
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Integer getStopCount() {
        return stopCount;
    }

    public void setStopCount(Integer stopCount) {
        this.stopCount = stopCount;
    }

    public Integer getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    public String getTroubleData() {
        return troubleData;
    }

    public void setTroubleData(String troubleData) {
        this.troubleData = troubleData;
    }

    public Integer getCadelCount() {
        return cadelCount;
    }

    public void setCadelCount(Integer cadelCount) {
        this.cadelCount = cadelCount;
    }

    public Integer getUncandelCount() {
        return uncandelCount;
    }

    public void setUncandelCount(Integer uncandelCount) {
        this.uncandelCount = uncandelCount;
    }

    @Override
    public String toString() {
        return "UserHelper{" +
                "user=" + user +
                ", allcount=" + allcount +
                ", girlcount=" + girlcount +
                ", boycount=" + boycount +
                ", addcount=" + addcount +
                ", delcount=" + delcount +
                ", calNum=" + calNum +
                ", showTime='" + showTime + '\'' +
                ", provin='" + provin + '\'' +
                ", allNum=" + allNum +
                ", device='" + device + '\'' +
                ", stopCount=" + stopCount +
                ", usedCount=" + usedCount +
                ", troubleData='" + troubleData + '\'' +
                ", cadelCount=" + cadelCount +
                ", uncandelCount=" + uncandelCount +
                '}';
    }
}
