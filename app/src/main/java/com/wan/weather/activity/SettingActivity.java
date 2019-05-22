package com.wan.weather.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
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
        SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit();//获得SHaredPreferences.Editor对象
        editor.putBoolean("switchFlag", mSwitchPicture.isChecked());
        if (mSwitchPicture.isChecked()) {
            editor.putString("imgPath","");
        }
        editor.apply();
        super.onDestroy();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();

            SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit();//获得SHaredPreferences.Editor对象
            editor.putString("imgPath",picturePath);
            editor.apply();
            showToast("背景图需要重启才能生效哦！");
            mSwitchPicture.setChecked(false);
        }

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
        if (preferences.getBoolean("switchFlag", false)) {
            mSwitchPicture.setChecked(true);
        }

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.setting_img:
                Intent i = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i, 1);
                break;
            case R.id.setting_random_img:
                mSwitchPicture.setChecked(!mSwitchPicture.isChecked());
                //随机图片开启后，自定义图片失效

                break;
            case R.id.setting_time_alarm:
                break;
            case R.id.setting_mode:
                break;
            default:
                break;
        }
    }

    private void selectImg() {

    }
}