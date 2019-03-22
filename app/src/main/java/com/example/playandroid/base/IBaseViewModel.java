package com.example.playandroid.base;

import android.os.Bundle;

/**
 * Created by 陆向阳 on 2019/3/21.
 */

public interface IBaseViewModel {
//    void initData();

    /**
     * View的界面创建时回调
     */
    void onCreate();

    /**
     * View的界面销毁时回调
     */
    void onDestroy();

    /**
     * 注册RxBus
     */
    void registerRxBus();

    /**
     * 移除RxBus
     */
    void removeRxBus();

    void onResume();

    /**
     * 懒加载 lwd
     */
    void lazyLoad();

    /**
     * 停止加载 lwd
     */
    void stopLoad();

    /**
     * 横竖屏切换时需要用到bundle
     * @param savedInstanceState
     */
    void onCreate(Bundle savedInstanceState);
}
