package com.example.playandroid.util;

import android.content.Context;
import android.widget.Toast;

/**
 * @author created by 陆向阳 on 2019/3/22
 * Toast工具类
 */
public class ToastUtils {

    private static Context context = null;
    private static Toast mToast = null;

    public ToastUtils(Context context) {
        this.context = context;
    }

    public static void toast(Context context, String msg){
        if (mToast == null) {
            mToast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(msg);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

}
