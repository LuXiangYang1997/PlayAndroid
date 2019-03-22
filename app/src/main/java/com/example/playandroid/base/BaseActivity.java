package com.example.playandroid.base;

import android.content.Intent;
import android.content.res.Resources;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.playandroid.R;
import com.example.playandroid.databinding.ToolbarLayoutBinding;

/**
 * BaseActivity
 * Created by 陆向阳 on 2019/3/21.
 */

public abstract class BaseActivity<V extends ViewDataBinding, VM extends BaseViewModel> extends AppCompatActivity implements IBaseActivity {
    protected V binding;
    protected VM viewModel;
    private ToolbarLayoutBinding toolbarBinding;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initParam();
        initData();
        initViewDataBinding();
        initViewObservable();
        viewModel.onCreate();
        viewModel.onCreate(savedInstanceState);
        viewModel.registerRxBus();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.removeRxBus();
        viewModel.onDestroy();
        viewModel = null;
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    /**
     * 注入绑定
     */
    private void initViewDataBinding() {
        //DataBindingUtil类需要在project的build中配置 dataBinding {enabled true }, 同步后会自动关联android.databinding包
        binding = DataBindingUtil.setContentView(this, initContentView());
        binding.setVariable(initVariableId(), viewModel = initViewModel());
        View root=binding.getRoot();
        if(root instanceof LinearLayout){
            View publicView= LayoutInflater.from(this).inflate(R.layout.toolbar_layout,null);
            ((LinearLayout) root).addView(publicView,0);
            toolbarBinding= DataBindingUtil.bind(publicView);
        }
    }

    public V getBinding(){
        return binding;
    }

    @Override
    public void initParam() {

    }

    /**
     * 初始化根布局
     *
     * @return 布局layout的id
     */
    public abstract int initContentView();

    /**
     * 初始化ViewModel的id
     *
     * @return BR的id
     */
    public abstract int initVariableId();

    /**
     * 初始化ViewModel
     *
     * @return 继承BaseViewModel的ViewModel
     */
    public abstract VM initViewModel();

    @Override
    public void initData() {

    }

    @Override
    public void initViewObservable() {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        viewModel.onRequestPermissionsResult(requestCode, permissions, grantResults);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    /**
     * Created by 刘成龙 on 2018/4/12.
     *
     * 跳转回显
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        viewModel.onActivityResult(requestCode,resultCode,data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public Resources getResources() {
        Resources resources = super.getResources();
        if (resources != null && resources.getConfiguration().fontScale != 1.0f) {
            android.content.res.Configuration configuration = resources.getConfiguration();
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }
}
