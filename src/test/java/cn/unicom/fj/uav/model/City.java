package cn.unicom.fj.uav.model;

public class City {
    private String cityId;

    private String cityName;

    private String zoneCode;

    private String cityCode;

    private Byte provinceId;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode == null ? null : zoneCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public Byte getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Byte provinceId) {
        this.provinceId = provinceId;
    }
}