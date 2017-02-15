package com.news.android.fishingnews;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Schnee on 2016/12/20.
 */

public abstract class NewsBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("currentActivity",getClass().getSimpleName());
        setContentView(R.layout.activity_splash);

    }
}
