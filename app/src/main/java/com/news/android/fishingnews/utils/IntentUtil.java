package com.news.android.fishingnews.utils;

import android.content.Context;
import android.content.Intent;

import com.news.android.fishingnews.activities.MainActivity;

/**
 * Created by Schnee on 2016/12/21.
 */
public class IntentUtil {

    public static Intent toMainActivity(Context context) {
        return new Intent(context, MainActivity.class);
    }
}
