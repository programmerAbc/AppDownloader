package com.practice.appdownloader;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by usera on 2017/1/22.
 */

public class CatagoryViewPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<CatagoryFrag> fragments;

    public CatagoryViewPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments = new ArrayList<>();
        fragments.add(CatagoryFrag.newInstance(CatagoryFrag.Type.APP));
        fragments.add(CatagoryFrag.newInstance(CatagoryFrag.Type.GAME));
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).getType().toString();
    }
}
