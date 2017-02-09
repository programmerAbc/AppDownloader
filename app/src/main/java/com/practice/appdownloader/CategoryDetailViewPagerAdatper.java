package com.practice.appdownloader;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.practice.appdownloader.model.CategoryResponse;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gaofeng on 2017-02-07.
 */

public class CategoryDetailViewPagerAdatper extends FragmentStatePagerAdapter {
    CategoryResponse.Data data;
    List<CategoryDetailFrag> categoryDetailFrags = new LinkedList<>();
    List<String> pageTitles =new LinkedList<>();
    public CategoryDetailViewPagerAdatper(FragmentManager fm) {
        super(fm);
    }

    public void setData(CategoryResponse.Data data) {
        this.data = data;
        categoryDetailFrags.clear();
        pageTitles.clear();
        pageTitles.add(data.getTitle());
        categoryDetailFrags.add(CategoryDetailFrag.newInstance("https://api.coolapk.com/v6/apk/index?listType=cat&catId="+data.getId()+"&apkType="+data.getApkType()+"&rankType=default&page=1"));
        String[] tagList = data.getTagList();
        for (String tag : tagList) {
            pageTitles.add(tag);
            categoryDetailFrags.add(CategoryDetailFrag.newInstance("https://api.coolapk.com/v6/apk/search?searchType=tag&tag=" + tag + "&apkType="+data.getApkType()+"&rankType=default&page=1"));
        }
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return categoryDetailFrags.get(position);
    }

    @Override
    public int getCount() {
        return categoryDetailFrags.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return pageTitles.get(position);
    }
}
