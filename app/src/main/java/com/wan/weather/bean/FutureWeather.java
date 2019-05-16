package com.wan.weather.bean;

/**
 * @author StarsOne
 * @date Create in  2019/5/15 0015 15:34
 * @description
 */
public class FutureWeather {
    private String time,wea,maxTem,minTem;
    private int weaImgId;

    public FutureWeather() {
    }

    public FutureWeather(String time, String wea, String maxTem, String minTem, int weaImgId) {
        this.time = time;
        this.wea = wea;
        this.maxTem = maxTem;
        this.minTem = minTem;
        this.weaImgId = weaImgId;
    }

    public String getMaxAndMinTem() {
        return this.minTem + "/" + this.maxTem;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWea() {
        return wea;
    }

    public void setWea(String wea) {
        this.wea = wea;
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

    public int getWeaImgId() {
        return weaImgId;
    }

    public void setWeaImgId(int weaImgId) {
        this.weaImgId = weaImgId;
    }
}
