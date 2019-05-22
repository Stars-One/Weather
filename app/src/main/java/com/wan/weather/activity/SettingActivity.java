package com.wan.weather.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;

import com.wan.weather.BaseActivity;
import com.wan.weather.R;


public class SettingActivity extends BaseActivity implements View.OnClickListener {

    private LinearLayout mSettingImg;
    private LinearLayout mSettingRandomImg;
    private LinearLayout mSettingTimeAlarm;
    private LinearLayout mSettingMode;
    private Switch mSwitchPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        initView();
    }

    @Override
    public void initData() {

    }

    @Override
    protected void onDestroy() {
        SharedPreferences.Editor editor = getSharedPreferences("data",MODE_PRIVATE).edit();//获得SHaredPreferences.Editor对象
        editor.putBoolean("switchFlag", mSwitchPicture.isChecked());
        editor.apply();
        super.onDestroy();
    }

    @Override
    public void initView() {

        mSettingImg = (LinearLayout) findViewById(R.id.setting_img);
        mSettingImg.setOnClickListener(this);
        mSettingRandomImg = (LinearLayout) findViewById(R.id.setting_random_img);
        mSettingRandomImg.setOnClickListener(this);
        mSettingTimeAlarm = (LinearLayout) findViewById(R.id.setting_time_alarm);
        mSettingTimeAlarm.setOnClickListener(this);
        mSettingMode = (LinearLayout) findViewById(R.id.setting_mode);
        mSettingMode.setOnClickListener(this);
        mSwitchPicture = (Switch) findViewById(R.id.switch_picture);
        SharedPreferences preferences = getSharedPreferences("data", MODE_PRIVATE);//获得SharedPreferences的对象
        if (preferences.getBoolean("switchFlag",false)) {
            mSwitchPicture.setChecked(true);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.setting_img:
                break;
            case R.id.setting_random_img:
                mSwitchPicture.setChecked(!mSwitchPicture.isChecked());
                break;
            case R.id.setting_time_alarm:
                break;
            case R.id.setting_mode:
                break;
            default:
                break;
        }
    }
}