package com.practice.appdownloader;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CatagoryActivity extends AppCompatActivity {
    ViewPager catagoryVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory);
        catagoryVp = (ViewPager) findViewById(R.id.catagoryVp);
        catagoryVp.setAdapter(new CatagoryViewPagerAdapter(getSupportFragmentManager()));
    }
}
