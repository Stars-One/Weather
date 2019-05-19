package com.wan.weather.activity;

import android.os.Bundle;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.MyLocationData;
import com.baidu.mapapi.model.LatLng;
import com.wan.weather.BaseActivity;
import com.wan.weather.R;
import com.yanzhenjie.permission.Action;
import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.runtime.Permission;

import java.util.List;


public class MapActivity extends BaseActivity {

    private MapView mMapview;
    private BaiduMap baiduMap;
    private LocationClient mlocationclient;
    private boolean firstFlag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //百度地图SDK初始化，必须要在setContentView之前调用
        SDKInitializer.initialize(getApplicationContext());
        mlocationclient = new LocationClient(getApplicationContext());
        //通过LocationClientOption设置LocationClient相关参数
        LocationClientOption option = new LocationClientOption();
        option.setOpenGps(true); // 打开gps
        option.setCoorType("bd09ll"); // 设置坐标类型
        option.setScanSpan(1000);
        mlocationclient.setLocOption(option);

        mlocationclient.registerLocationListener(new MyLocationListener());

        setContentView(R.layout.activity_map);

        AndPermission.with(this)
                .runtime()
                .permission(Permission.ACCESS_COARSE_LOCATION, Permission.ACCESS_FINE_LOCATION)
                .onGranted(new Action<List<String>>() {
                    @Override
                    public void onAction(List<String> data) {
                        mlocationclient.start();
                    }
                })
                .onDenied(new Action<List<String>>() {
                    @Override
                    public void onAction(List<String> data) {
                        finish();
                    }
                }).start();

    }


    @Override
    public void initData() {

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mMapview.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMapview.onPause();
    }

    @Override
    protected void onDestroy() {
        baiduMap.setMyLocationEnabled(false);
        mMapview.onDestroy();
        mMapview = null;
        baiduMap.setMyLocationEnabled(false);
        super.onDestroy();
    }

    @Override
    public void initView() {

        mMapview = (MapView) findViewById(R.id.mapview);
        baiduMap = mMapview.getMap();
        baiduMap.setMapStatus(MapStatusUpdateFactory.zoomTo(20));
    }

    public class MyLocationListener extends BDAbstractLocationListener {
        @Override
        public void onReceiveLocation(BDLocation location) {
            //mapView 销毁后不在处理新接收的位置
            if (location == null || mMapview == null) {
                return;
            }
            double longitude = location.getLongitude();//经度
            double latitude = location.getLatitude();//纬度
            LatLng ll = new LatLng(latitude, longitude);
            MapStatusUpdate mapStatusUpdate = MapStatusUpdateFactory.newLatLng(ll);
            baiduMap.setMyLocationEnabled(true);//设置当前位置蓝色小圆点显示
            baiduMap.animateMapStatus(mapStatusUpdate);//地图自动移动到当前定位所在位置

            MyLocationData locData = new MyLocationData.Builder()
                    .longitude(location.getLongitude())
                    .latitude(location.getLatitude())
                    .build();
            baiduMap.setMyLocationData(locData);//设置光标显示

        }
    }
}