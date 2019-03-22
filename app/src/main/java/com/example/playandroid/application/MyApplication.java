package com.example.playandroid.application;

import android.app.Application;

/**
 * @author created by 陆向阳 on 2019/3/21
 */
public class MyApplication extends Application {

    private MyApplication instance;


    @Override
    public void onCreate() {
        super.onCreate();

    }

    public MyApplication getInstance() {
        return instance;
    }
}
