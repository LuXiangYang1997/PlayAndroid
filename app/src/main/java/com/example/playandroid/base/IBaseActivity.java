package com.example.playandroid.base;

/**
 * Created by 陆向阳 on 2019/3/21.
 */

public interface IBaseActivity {
    /**
     * 初始化界面传递参数
     */
    void initParam();
    /**
     * 初始化数据
     */
    void initData();

    /**
     * 初始化界面观察者的监听
     */
    void initViewObservable();

}
