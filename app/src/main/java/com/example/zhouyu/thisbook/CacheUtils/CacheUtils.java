package com.example.zhouyu.thisbook.CacheUtils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.zhouyu.thisbook.SplashActivity;

public class CacheUtils {
    public static boolean getBoolean(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences("test", Context.MODE_PRIVATE);
        return sp.getBoolean(key, false);
    }
}
