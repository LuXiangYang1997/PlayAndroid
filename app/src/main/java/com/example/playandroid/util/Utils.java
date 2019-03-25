package com.example.playandroid.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/**
 * @author created by 陆向阳 on 2019/3/25
 */
public class Utils {

    public static int convertDPtoPixels(Context context, int dp) {
        Resources resource = context.getResources();
        return(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resource.getDisplayMetrics());
    }


}
