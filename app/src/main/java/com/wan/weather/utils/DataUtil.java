package com.wan.weather.utils;

import android.util.Log;

import com.wan.weather.R;
import com.wan.weather.bean.FutureWeather;
import com.wan.weather.bean.HourWeather;
import com.wan.weather.bean.OtherMessage;
import com.wan.weather.bean.Weather;
import com.wan.weather.bean.WeatherData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author StarsOne
 * @date Create in  2019/5/15 0015 14:54
 * @description
 */
public class DataUtil {
    private WeatherData weatherData;
    private static Map<String, Integer> imgId = new HashMap<>();

    public DataUtil(WeatherData weatherData) {
        this.weatherData = weatherData;
        imgId.put("bingbao", R.drawable.bingbao);
        imgId.put("lei", R.drawable.lei);
        imgId.put("qing", R.drawable.qing);
        imgId.put("shachen", R.drawable.shachen);
        imgId.put("wu", R.drawable.wu);
        imgId.put("xue", R.drawable.xue);
        imgId.put("yin", R.drawable.yin);
        imgId.put("yu", R.drawable.yu);
        imgId.put("yun", R.drawable.yun);
    }

    /**天气数据提取
     * WeatherData -> Weather
     * @return
     */
    public Weather getWeather() {
        WeatherData.DataBean dataBean = weatherData.getData().get(0);
        String cityName = weatherData.getCity();
        String wea = dataBean.getWea();
        int weaImgId = getImgIdFromWeatherString(dataBean.getWea_img());
        String tem = dataBean.getTem();
        String maxtem = dataBean.getTem1();
        String mintem = dataBean.getTem2();
        String airLevel = dataBean.getAir()+" "+ dataBean.getAir_level();
        Log.d("---查看--", "getWeather: "+airLevel);
        String winSpeed;
        if (dataBean.getWin().size() != 2) {
            winSpeed = dataBean.getWin().get(0)+" 风速"+ dataBean.getWin_speed();
        } else {
            winSpeed = dataBean.getWin().get(0)+"->"+ dataBean.getWin().get(1)+" 风速"+ dataBean.getWin_speed();
        }
        String humidity = dataBean.getHumidity()+"%";
        return  new Weather(cityName,wea,tem,maxtem,mintem,airLevel,winSpeed,humidity,weaImgId);

    }

    /**
     * 返回OtherMessage
     * @return
     */
    public OtherMessage getOtherMessage() {
        List<WeatherData.DataBean.IndexBean> otherDatas = weatherData.getData().get(0).getIndex();
        String uvTip = otherDatas.get(0).getDesc();
        String uvLevel = otherDatas.get(0).getLevel();
        String clothesLevel = otherDatas.get(3).getLevel();
        String clothesTip = otherDatas.get(3).getDesc();
        String carLevel = otherDatas.get(4).getLevel();
        String carTip = otherDatas.get(4).getDesc();
        String airLevel = otherDatas.get(5).getLevel();
        String airTip = otherDatas.get(5).getDesc();
        return new OtherMessage(uvLevel, uvTip, clothesLevel, clothesTip, carLevel, carTip, airLevel, airTip);
    }

    /**处理String，返回对应的资源id
     * @param wea_img
     * @return
     */
    private int getImgIdFromWeatherString(String wea_img) {
        return imgId.get(wea_img);
    }

    /**天气数据转换每个小时天气数据HourWeatherList
     * @return
     */
    public List<HourWeather> getHourWeatherList() {
        List<WeatherData.DataBean.HoursBean> hours = weatherData.getData().get(0).getHours();
        List<HourWeather> hourWeathers = new ArrayList<>();
        for (WeatherData.DataBean.HoursBean hour : hours) {
            String time = hour.getDay();
            String wea = hour.getWea();
            String tem = hour.getTem();
            int weaImgId = getImgIdFromHourString(wea);
            hourWeathers.add(new HourWeather(time,wea,tem,weaImgId));
        }
        return  hourWeathers;

    }

    /**
     * 得到七天的天气情况
     * @return
     */
    public List<FutureWeather> getFutureWeatherList() {
        List<FutureWeather> futureWeathers = new ArrayList<>();
        List<WeatherData.DataBean> data = weatherData.getData();
        for (WeatherData.DataBean dataBean : data) {
            String time = dataBean.getDay();
            String wea = dataBean.getWea();
            int weaImgId = getImgIdFromWeatherString(dataBean.getWea_img());
            String maxTem = dataBean.getTem1();
            String minTem = dataBean.getTem2();
            futureWeathers.add(new FutureWeather(time, wea, maxTem, minTem, weaImgId));
        }
        return futureWeathers;
    }
    /**处理String，返回对应的资源id
     * @param wea_img
     * @return
     */
    private int getImgIdFromHourString(String wea_img) {
        //TODO 返回对应的天气图标资源id
        if (wea_img.contains("阴")){
            return R.drawable.yin;
        } else if (wea_img.contains("雷")) {
            return R.drawable.lei;
        } else if (wea_img.contains("雨")) {
            return R.drawable.yu;
        } else if (wea_img.contains("晴")) {
            return R.drawable.qing;
        } else if (wea_img.contains("雹")) {
            return R.drawable.bingbao;
        } else if (wea_img.contains("云")) {
            return R.drawable.yun;
        }else if (wea_img.contains("雾")) {
            return R.drawable.wu;
        }else if (wea_img.contains("沙")) {
            return R.drawable.shachen;
        }else if (wea_img.contains("雪")) {
            return R.drawable.xue;

        }
        return 0;
    }
}
