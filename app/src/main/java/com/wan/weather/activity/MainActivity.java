package com.wan.weather.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import com.wan.weather.BaseActivity;
import com.wan.weather.R;
import com.wan.weather.adapter.FragmentAdapter;
import com.wan.weather.fragment.WeatherFragment;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Starsone
 */
public class MainActivity extends BaseActivity {

    private Toolbar mToolbar;
    private ViewPager mViewpager;
    private List<WeatherFragment> weatherFragments=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbarTransparent();
        weatherFragments.add(new WeatherFragment("101300518"));
        mViewpager.setAdapter(new FragmentAdapter(getSupportFragmentManager(),weatherFragments));
    }


    /**
     * 设置toolabar透明色
     */
    private void setToolbarTransparent() {
        setSupportActionBar(mToolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
            layoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | layoutParams.flags);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.show_location:
                break;
            case R.id.about:
                break;
            case R.id.setting:
                break;
            case R.id.city_manage:
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mViewpager = (ViewPager) findViewById(R.id.viewpager);
    }

    /*private void playVideo() {
        final String videoPath = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cloud).toString();
        mVideoBackground.setVideoPath(videoPath);
        mVideoBackground.start();
        mVideoBackground.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
                mp.setLooping(true);
            }});
        mVideoBackground.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mVideoBackground.setVideoPath(videoPath);
                mVideoBackground.start();
            }
        });
    }*/
}
