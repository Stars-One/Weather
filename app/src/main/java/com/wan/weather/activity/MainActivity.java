package com.wan.weather.activity;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.wan.movecirclepoint.CirclePoint;
import com.wan.weather.BaseActivity;
import com.wan.weather.R;
import com.wan.weather.adapter.FragmentAdapter;
import com.wan.weather.fragment.WeatherFragment;
import com.wan.weather.utils.DataUtil;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Starsone
 */
public class MainActivity extends BaseActivity {

    private Toolbar mToolbar;
    private ViewPager mViewpager;
    private List<WeatherFragment> weatherFragments = new ArrayList<>();
    private CirclePoint mCirclePoint;
    private LinearLayout mMainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        setToolbarTransparent();
        weatherFragments.add(new WeatherFragment("101300518"));//雁山
        weatherFragments.add(new WeatherFragment("101300501"));//桂林
        weatherFragments.add(new WeatherFragment("101300101"));//南宁
        mViewpager.setAdapter(new FragmentAdapter(getSupportFragmentManager(), weatherFragments));
        mViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                mCirclePoint.setonPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
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
                startActivity(MapActivity.class);

                break;
            case R.id.about:
                startActivity(AboutActivity.class);
                break;
            case R.id.setting:
                startActivity(SettingActivity.class);
                break;
            case R.id.city_manage:
                startActivity(CityManageActivity.class);
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
        mCirclePoint = (CirclePoint) findViewById(R.id.circlePoint);
        mMainLayout = (LinearLayout) findViewById(R.id.main_layout);
        SharedPreferences preferences = getSharedPreferences("data", MODE_PRIVATE);//获得SharedPreferences的对象

        //括号里的判断是去找switchFlag这个对应的数值，若是找不到，则是返回false，找到了的话就是我们上面定义的true，就会执行其中的语句
        if (preferences.getBoolean("switchFlag", false)) {
            mMainLayout.setBackgroundResource(new DataUtil().getBgId());
        }


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
