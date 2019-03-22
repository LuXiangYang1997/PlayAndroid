package com.example.playandroid.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;


/**
 * Base适配器
 * Created by 陆向阳 on 2019/3/21.
 */
public class BaseViewModel implements IBaseViewModel {
    protected Context context;
    public BaseViewModel() {
    }

    public BaseViewModel(Context context) {
        this.context = context;
    }

    public BaseViewModel(Fragment fragment) {
        this(fragment.getContext());
    }

    /**
     * 跳转页面
     *
     * @param clz 所跳转的目的Activity类
     */
    public void startActivity(Class<?> clz) {
        context.startActivity(new Intent(context, clz));
    }

    public void finish(){
        ((Activity)context).finish();
    }

    /**
     * 跳转页面
     *
     * @param clz    所跳转的目的Activity类
     * @param bundle 跳转所携带的信息
     */
    public void startActivity(Class<?> clz, Bundle bundle) {
        Intent intent = new Intent(context, clz);
        if (bundle != null) {
            intent.putExtras( bundle);
        }
        context.startActivity(intent);
    }

    /**
     * 跳转页面
     * @param clz 所跳转的目的Activity类
     * @param flag  跳转所携带的flag信息
     */
    public void startActivity(Class<?> clz, int flag) {
        Intent intent = new Intent(context, clz);
        intent.addFlags(flag);
        context.startActivity(intent);
    }

    /**
     * 跳转容器页面
     *
     * @param canonicalName 规范名 : Fragment.class.getCanonicalName()
     * @param bundle        跳转所携带的信息
     */
    public void startContainerActivity(String canonicalName, Bundle bundle) {
        Intent intent = new Intent(context, ContainerActivity.class);
        intent.putExtra(ContainerActivity.FRAGMENT, canonicalName);
        if (bundle != null) {
            intent.putExtra(ContainerActivity.BUNDLE, bundle);
        }
        context.startActivity(intent);
    }

    /**
     * 跳转容器页面
     *
     * @param canonicalName 规范名 : Fragment.class.getCanonicalName()
     */
    public void startContainerActivity(String canonicalName) {
        Intent intent = new Intent(context, ContainerActivity.class);
        intent.putExtra(ContainerActivity.FRAGMENT, canonicalName);
        context.startActivity(intent);
    }

    @Override
    public void onCreate() {
    }

    @Override
    public void onDestroy() {
    }

    @Override
    public void registerRxBus() {
    }

    @Override
    public void removeRxBus() {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void lazyLoad() {

    }

    @Override
    public void stopLoad() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

    }

    /**
     * 权限处理
     * @param requestCode
     * @param permissions
     * @param grantResults
     */
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    }

    /**
     * Created by 刘成龙 on 2018/4/12.
     *
     * 跳转回显
     * */
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

}
