package com.lxy.com.application;

import android.app.Application;
import android.content.Context;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by LXY on 2016/1/13.
 */
public class BaseApplication extends Application {

    //初始化极光推送SDK
//    public static void init(Context context){}
//    public static void setDebugMode(boolean debugEnalbed){}

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }







}
