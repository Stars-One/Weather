package com.wan.weather.bean;

/**
 * @author StarsOne
 * @date Create in  2019/5/15 0015 15:49
 * @description
 */
public class OtherMessage {
    private String uvLevel;//紫外线指数
    private String uvTip;
    private String clothesLevel;//穿衣指数
    private String clothesTip;
    private String carLevel;//洗车指数
    private String carTip;
    private String airLevel;
    private String airTip;

    public OtherMessage() {
    }

    public OtherMessage(String uvLevel, String uvTip, String clothesLevel, String clothesTip, String carLevel, String carTip, String airLevel, String airTip) {
        this.uvLevel = uvLevel;
        this.uvTip = uvTip;
        this.clothesLevel = clothesLevel;
        this.clothesTip = clothesTip;
        this.carLevel = carLevel;
        this.carTip = carTip;
        this.airLevel = airLevel;
        this.airTip = airTip;
    }

    public String getUvLevel() {
        return uvLevel;
    }

    public void setUvLevel(String uvLevel) {
        this.uvLevel = uvLevel;
    }

    public String getUvTip() {
        return uvTip;
    }

    public void setUvTip(String uvTip) {
        this.uvTip = uvTip;
    }

    public String getClothesLevel() {
        return clothesLevel;
    }

    public void setClothesLevel(String clothesLevel) {
        this.clothesLevel = clothesLevel;
    }

    public String getClothesTip() {
        return clothesTip;
    }

    public void setClothesTip(String clothesTip) {
        this.clothesTip = clothesTip;
    }

    public String getCarLevel() {
        return carLevel;
    }

    public void setCarLevel(String carLevel) {
        this.carLevel = carLevel;
    }

    public String getCarTip() {
        return carTip;
    }

    public void setCarTip(String carTip) {
        this.carTip = carTip;
    }

    public String getAirLevel() {
        return airLevel;
    }

    public void setAirLevel(String airLevel) {
        this.airLevel = airLevel;
    }

    public String getAirTip() {
        return airTip;
    }

    public void setAirTip(String airTip) {
        this.airTip = airTip;
    }
}
