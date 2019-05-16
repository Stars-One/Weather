package com.wan.weather.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.wan.weather.fragment.WeatherFragment;

import java.util.List;

/**
 * @author StarsOne
 * @date Create in  2019/5/16 0016 9:55
 * @description
 */
public class FragmentAdapter extends FragmentPagerAdapter{
    private List<WeatherFragment> fragments ;
    private final FragmentManager fm;

    public FragmentAdapter(FragmentManager fm, List<WeatherFragment> fragments) {
        super(fm);
        this.fragments = fragments;
        this.fm = fm;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
