package com.kk.materiallearning.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KK on 10/14/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragList = new ArrayList<>();
    private List<String> fragName = new ArrayList<>();
    public void addNewFrag (Fragment newFragment , String name ){
        fragList.add(newFragment);
        fragName.add(name);

    }
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public CharSequence getPageTitle(int position){
        return fragName.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragList.get(position);
    }

    @Override
    public int getCount() {
        return fragList.size();
    }
}
