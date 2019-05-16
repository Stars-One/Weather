package com.wan.weather.utils;

import com.google.gson.Gson;
import com.wan.weather.bean.WeatherData;

import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by xen on 2018/12/5 0005.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(final String address, final okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        CacheControl control =new CacheControl.Builder().build();
        Request request = new Request.Builder()
                .cacheControl(control)
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);

    }

    /**
     * 调用GSON解析json数据
     * @param jsonData json数据
     * @return 返回天气数据实体类
     */
    public static WeatherData parseJSONWithGSON(String jsonData) {
        //使用轻量级的Gson解析得到的json
        Gson gson = new Gson();
        return gson.fromJson(jsonData, WeatherData.class);
    }
}