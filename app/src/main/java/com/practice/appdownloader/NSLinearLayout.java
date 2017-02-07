package com.practice.appdownloader;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by gaofeng on 2017-01-22.
 */

public class NSLinearLayout extends LinearLayout {
    private static final String TAG = NSLinearLayout.class.getSimpleName();

    public NSLinearLayout(Context context) {
        super(context);
    }

    public NSLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NSLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}