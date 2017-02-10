package com.practice.appdownloader;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CategoryActivity extends AppCompatActivity {
    ViewPager categoryVp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        categoryVp = (ViewPager) findViewById(R.id.catagoryVp);
        categoryVp.setAdapter(new CategoryViewPagerAdapter(getSupportFragmentManager()));
    }
}
