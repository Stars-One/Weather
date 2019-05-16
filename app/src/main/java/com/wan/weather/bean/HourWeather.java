package com.wan.weather.bean;

/**
 * @author StarsOne
 * @date Create in  2019/5/15 0015 15:21
 * @description
 */
public class HourWeather {
    private String time,wea,tem;
    private int weaImgId;

    public HourWeather() {
    }

    public HourWeather(String time, String wea, String tem, int weaImgId) {
        this.time = time;
        this.wea = wea;
        this.tem = tem;
        this.weaImgId = weaImgId;
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

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public int getWeaImgId() {
        return weaImgId;
    }

    public void setWeaImgId(int weaImgId) {
        this.weaImgId = weaImgId;
    }
}
