package com.example.playandroid.util;

import android.util.Log;

/**
 * 日志管理类
 * Created by 陆向阳 on 2019/3/21.
 */

public class LogUtils {
    public static boolean isDebug = true;//日志开关，false为关闭

    private final static String APP_TAG = "PlayAndroid";

    public static void v(String msg) {
        if (isDebug) {
            Log.v(APP_TAG, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (isDebug) {
            Log.v(tag, msg);
        }
    }


    public static void d(String msg) {
        if (isDebug) {
            Log.d(APP_TAG, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }


    public static void i(String msg) {
        if (isDebug) {
            Log.i(APP_TAG, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }



    public static void w(String msg) {
        if (isDebug) {
            Log.w(APP_TAG, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (isDebug) {
            Log.w(tag, msg);
        }
    }


    public static void e(String msg) {
        if (isDebug) {
            Log.e(APP_TAG, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }
    }


}
