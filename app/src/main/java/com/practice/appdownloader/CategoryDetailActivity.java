package com.practice.appdownloader;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.practice.appdownloader.model.CategoryResponse;

public class CategoryDetailActivity extends AppCompatActivity {
    private static final String TAG = CategoryDetailActivity.class.getSimpleName();
    CategoryResponse.Data data = null;
    ViewPager viewPager;
    CategoryDetailViewPagerAdatper categoryDetailViewPagerAdatper;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        data = intent.getParcelableExtra(CategoryResponse.Data.class.getSimpleName());
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout= (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager,true);
        categoryDetailViewPagerAdatper = new CategoryDetailViewPagerAdatper(getSupportFragmentManager());
        viewPager.setAdapter(categoryDetailViewPagerAdatper);
        categoryDetailViewPagerAdatper.setData(data);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
