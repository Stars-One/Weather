package com.wan.weather.bean;

/**
 * @author StarsOne
 * @date Create in  2019/5/15 0015 14:50
 * @description
 */
public class Weather {
    private String cityName,wea,tem,maxTem,minTem,airLevel,winSpeed,humidity;
    private int weaImgId;

    public Weather() {
    }

    public Weather(String cityName, String wea, String tem, String maxTem, String minTem, String airLevel, String winSpeed, String humidity, int weaImgId) {
        this.cityName = cityName;
        this.wea = wea;
        this.tem = tem;
        this.maxTem = maxTem;
        this.minTem = minTem;
        this.airLevel = airLevel;
        this.winSpeed = winSpeed;
        this.humidity = humidity;
        this.weaImgId = weaImgId;
    }

    /**
     * 最小和最大温度
     * 10℃/25℃
     * @return
     */
    public String getMaxTemAndMinTem() {
        return this.minTem + "/" + this.maxTem;
    }
    public int getWeaImgId() {
        return weaImgId;
    }

    public void setWeaImgId(int weaImgId) {
        this.weaImgId = weaImgId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWea() {
        return wea;
    }

    public void setWea(String wea) {
        this.wea = wea;
    }



    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getMaxTem() {
        return maxTem;
    }

    public void setMaxTem(String maxTem) {
        this.maxTem = maxTem;
    }

    public String getMinTem() {
        return minTem;
    }

    public void setMinTem(String minTem) {
        this.minTem = minTem;
    }

    public String getAirLevel() {
        return airLevel;
    }

    public void setAirLevel(String airLevel) {
        this.airLevel = airLevel;
    }

    public String getWinSpeed() {
        return winSpeed;
    }

    public void setWinSpeed(String winSpeed) {
        this.winSpeed = winSpeed;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
