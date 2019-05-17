package com.wan.weather.fragment;


import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.cy.cyrvadapter.adapter.RVAdapter;
import com.cy.cyrvadapter.recyclerview.HorizontalRecyclerView;
import com.cy.cyrvadapter.recyclerview.VerticalRecyclerView;
import com.wan.weather.R;
import com.wan.weather.bean.FutureWeather;
import com.wan.weather.bean.HourWeather;
import com.wan.weather.bean.JsonData;
import com.wan.weather.bean.OtherMessage;
import com.wan.weather.bean.Weather;
import com.wan.weather.bean.WeatherData;
import com.wan.weather.utils.DataUtil;
import com.wan.weather.utils.HttpUtil;

import org.litepal.LitePal;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class WeatherFragment extends Fragment {


    private View view;
    private TextView mTvTemperature;
    private ImageView mImgWeatherIcon;
    private TextView mTvLocation;
    private TextView mTvWeather;
    private TextView mTvMaxtemMintem;
    private TextView mTvWind;
    private TextView mTvHumidity;
    private TextView mTvAir;

    private Activity context;
    private List<HourWeather> hourWeatherList;
    private List<FutureWeather> futureWeatherList;
    private Weather weather;

    private String cityId;

    private HorizontalRecyclerView mHourRv;
    private VerticalRecyclerView mFutureRv;
    private TextView mTvClothesLevel;
    private TextView mTvClothesTip;
    private TextView mTvAirLevel;
    private TextView mTvAirTip;
    private TextView mTvUvLevel;
    private TextView mTvUcTip;
    private TextView mTvCarLevel;
    private TextView mTvCarTip;
    private OtherMessage otherMessage;


    private Handler myhandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 1) {
                setAllData();
            }
        }
    };
    private WeatherData weatherData;
    private JsonData jsonData;

    public WeatherFragment() {
    }

    //TODO setArgment传送数据
    public WeatherFragment(String cityId) {
        this.context = this.getActivity();
        this.cityId = cityId;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_weather, container, false);
        initView(view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();

        //自动更新
        //开启子进程，获取网络数据
        new Thread(new Runnable() {
            @Override
            public void run() {
                getWeatherData();
            }
        }).start();
    }

    /**
     * 加载数据库中的数据
     */
    private void loadData() {

        //判断数据库是否存在
        //存在读取数据库内容

        LitePal.getDatabase();//初始化数据库

        if (LitePal.isExist(JsonData.class)) {
            //从数据库中读取数据
            jsonData = LitePal.findFirst(JsonData.class);
            weatherData = HttpUtil.parseJSONWithGSON(jsonData.getJsonData());
            setAllData();
        }
    }

    /**
     * 设置全部天气数据
     */
    private void setAllData() {
        extractDataFromJson();
        setWeather();
        setHourData();
        setFutureData();
        setOtherData();
    }


    /**
     * 获取网络的返回的天气数据
     */
    private void getWeatherData() {

        String address = "https://www.tianqiapi.com/api/?version=v1&cityid=";
        HttpUtil.sendOkHttpRequest(address + cityId, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Toast.makeText(context, "网络错误，请稍后手动更新", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                if (jsonData != null) {
                    jsonData.delete();
                    jsonData = null;
                }
                jsonData = new JsonData(result);
                //保存数据到数据库
                jsonData.save();
               //获取天气数据，并转换成所需要的实体类
                weatherData = HttpUtil.parseJSONWithGSON(result);
                extractDataFromJson();
                //异步更新UI
                Message message = new Message();
                message.what = 1;
                myhandler.sendMessage(message);

            }
        });
    }

    /**
     * 提取所有的天气数据
     */
    private void extractDataFromJson() {
        DataUtil dataUtil = new DataUtil(weatherData);

        weather = dataUtil.getWeather();
        hourWeatherList = dataUtil.getHourWeatherList();
        futureWeatherList = dataUtil.getFutureWeatherList();
        otherMessage = dataUtil.getOtherMessage();
    }

    private void setWeather() {
        mTvTemperature.setText(weather.getTem());
        mTvLocation.setText(weather.getCityName());
        Glide.with(this).load(weather.getWeaImgId()).into(mImgWeatherIcon);
        mTvWeather.setText(weather.getWea());
        mTvMaxtemMintem.setText(weather.getMaxTemAndMinTem());
        mTvWind.setText(weather.getWinSpeed());
        mTvHumidity.setText(weather.getHumidity());
        mTvAir.setText(weather.getAirLevel());

    }

    private void initView(View view) {
        mTvTemperature = (TextView) view.findViewById(R.id.tv_temperature);
        mImgWeatherIcon = (ImageView) view.findViewById(R.id.img_weather_icon);
        mTvLocation = (TextView) view.findViewById(R.id.tv_location);
        mTvWeather = (TextView) view.findViewById(R.id.tv_weather);
        mTvMaxtemMintem = (TextView) view.findViewById(R.id.tv_maxtem_mintem);
        mTvWind = (TextView) view.findViewById(R.id.tv_wind);
        mTvHumidity = (TextView) view.findViewById(R.id.tv_humidity);
        mTvAir = (TextView) view.findViewById(R.id.tv_air);
        mHourRv = (HorizontalRecyclerView) view.findViewById(R.id.hourRv);
        mFutureRv = (VerticalRecyclerView) view.findViewById(R.id.futureRv);

        //其他提示
        mTvClothesLevel = (TextView) view.findViewById(R.id.tv_clothesLevel);
        mTvClothesTip = (TextView) view.findViewById(R.id.tv_clothesTip);
        mTvAirLevel = (TextView) view.findViewById(R.id.tv_airLevel);
        mTvAirTip = (TextView) view.findViewById(R.id.tv_airTip);
        mTvUvLevel = (TextView) view.findViewById(R.id.tv_uvLevel);
        mTvUcTip = (TextView) view.findViewById(R.id.tv_ucTip);
        mTvCarLevel = (TextView) view.findViewById(R.id.tv_carLevel);
        mTvCarTip = (TextView) view.findViewById(R.id.tv_carTip);
    }

    private void setOtherData() {
        mTvClothesLevel.setText(otherMessage.getClothesLevel());
        mTvClothesTip.setText(otherMessage.getClothesTip());
        mTvAirLevel.setText(otherMessage.getAirLevel());
        mTvAirTip.setText(otherMessage.getAirTip());
        mTvUvLevel.setText(otherMessage.getUvLevel());
        mTvUcTip.setText(otherMessage.getUvTip());
        mTvCarTip.setText(otherMessage.getCarTip());
        mTvCarLevel.setText(otherMessage.getCarLevel());
    }
    private void setHourData() {
        mHourRv.setAdapter(new RVAdapter<HourWeather>(hourWeatherList) {
            @Override
            public void bindDataToView(RVViewHolder holder, int position, HourWeather bean, boolean isSelected) {
                holder.setText(R.id.tv_hour_time, bean.getTime());
                holder.setText(R.id.tv_hour_tem, bean.getTem());
                holder.setImageResource(R.id.img_hour_wea_icon, bean.getWeaImgId());
            }

            @Override
            public int getItemLayoutID(int position, HourWeather bean) {
                return R.layout.item_hour;
            }

            @Override
            public void onItemClick(int position, HourWeather bean) {

            }
        });
    }

    private void setFutureData() {
        mFutureRv.setAdapter(new RVAdapter<FutureWeather>(futureWeatherList) {

            @Override
            public void bindDataToView(RVViewHolder holder, int position, FutureWeather bean, boolean isSelected) {
                holder.setText(R.id.tv_future_time, bean.getTime());
                holder.setText(R.id.tv_future_maxtem_mintem, bean.getMaxAndMinTem());
                holder.setImageResource(R.id.img_future_wea, bean.getWeaImgId());
                holder.setText(R.id.tv_future_wea, bean.getWea());
            }

            @Override
            public int getItemLayoutID(int position, FutureWeather bean) {
                return R.layout.item_future;
            }

            @Override
            public void onItemClick(int position, FutureWeather bean) {

            }
        });
    }


}
