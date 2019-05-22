package com.wan.weather.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.wan.weather.BaseActivity;
import com.wan.weather.R;


public class CityManageActivity extends BaseActivity implements View.OnClickListener {

    private LinearLayout mCityGuilin;
    private LinearLayout mCityLiuzhou;
    private LinearLayout mCityNannning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_manage);
        initView();
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {

        mCityGuilin = (LinearLayout) findViewById(R.id.city_guilin);
        mCityLiuzhou = (LinearLayout) findViewById(R.id.city_liuzhou);
        mCityNannning = (LinearLayout) findViewById(R.id.city_nannning);
        mCityGuilin.setOnClickListener(this);
        mCityLiuzhou.setOnClickListener(this);
        mCityNannning.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        switch (v.getId()) {
            case R.id.city_guilin:
                intent.putExtra("cityId", 0);
                setResult(1,intent);
                break;
            case R.id.city_liuzhou:
                intent.putExtra("cityId", 1);
                setResult(1,intent);
                break;
            case R.id.city_nannning:
                intent.putExtra("cityId", 2);
                setResult(1,intent);
                break;
            default:
                break;
        }
        finish();
    }
}