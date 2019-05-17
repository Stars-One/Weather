package com.wan.weather.bean;

import org.litepal.crud.LitePalSupport;

/**
 * @author StarsOne
 * @date Create in  2019/5/17 0017 10:27
 * @description
 */
public class JsonData extends LitePalSupport{
    String jsonData;

    public JsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }
}
