package cn.unicom.fj.uav.model;

import java.math.BigDecimal;

public class Location {
    private Short id;

    private String locationName;

    private Short countyId;

    private BigDecimal longitude;

    private BigDecimal latitude;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName == null ? null : locationName.trim();
    }

    public Short getCountyId() {
        return countyId;
    }

    public void setCountyId(Short countyId) {
        this.countyId = countyId;
    }

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
}