package cn.unicom.fj.uav.model.helper;


import cn.unicom.fj.uav.model.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class FlyTask extends Task {
////修改日期格式
  @JsonFormat(pattern = "yyyy-MM-dd",locale="zh",timezone="GMT+8")
//@JsonProperty("date")
  private Date taskStartTime;
  @Override
  public Date getTaskStartTime() {
    return taskStartTime;
  }

  @Override
  public void setTaskStartTime(Date taskStartTime) {
    this.taskStartTime = taskStartTime;
  }

  private Byte taskTypeId;

  @Override
  public Byte getTaskTypeId() {
    return taskTypeId;
  }

  @Override
  public void setTaskTypeId(Byte taskTypeId) {
    this.taskTypeId = taskTypeId;
  }

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



  public RouteHelper getRoute() {
    return route;
  }

  public void setRoute(RouteHelper route) {
    this.route = route;
  }
//省
  private Province province;

  public Province getProvince() {
    return province;
  }

  public void setProvince(Province province) {
    this.province = province;
  }
  private Byte provinceId;

  private String provinceName;

  public Byte getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(Byte provinceId) {
    this.provinceId = provinceId;
  }

  public String getProvinceName() {
    return provinceName;
  }

  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }

  //市
  private City city;

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }
  private String cityId;

  private String cityName;


  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  //区
  private County county;

  public County getCounty() {
    return county;
  }

  public void setCounty(County county) {
    this.county = county;
  }
  private String districtId;

  private String districtName;

  public String getDistrictId() {
    return districtId;
  }

  public void setDistrictId(String districtId) {
    this.districtId = districtId;
  }

  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  //location
  private Location location;

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  private String locationName;



  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  private BigDecimal longitude;
  private  BigDecimal latitude;
  private int cout;

  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public int getCout() {
    return cout;
  }

  public void setCout(int cout) {
    this.cout = cout;
  }

  //排序
  private String order;

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }
}
