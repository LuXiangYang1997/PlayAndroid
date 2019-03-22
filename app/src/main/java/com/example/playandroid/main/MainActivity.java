package com.example.playandroid.main;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.KeyEvent;
import android.view.View;
import com.example.playandroid.R;
import com.example.playandroid.adapter.FragmentPageAdapter;
import com.example.playandroid.adapter.SideMenuListAdapter;
import com.example.playandroid.bean.SideMenuBean;
import com.example.playandroid.constant.Constant;
import com.example.playandroid.databinding.ActivityMainBinding;
import com.example.playandroid.ui.home.view.HomeFragment;
import com.example.playandroid.ui.knowledgehierarchy.view.KnowLedgeHierarchyFragment;
import com.example.playandroid.ui.navigation.view.NavigationFragment;
import com.example.playandroid.ui.program.view.ProgramFragment;
import com.example.playandroid.util.StatuBarUtils;
import com.example.playandroid.util.ToastUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding mainBinding;
    private SideMenuListAdapter sideMenuListAdapter;
    private int keyBackClickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StatuBarUtils.setTransparent(this);
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initView();
        initData();
    }

    /**
     * 初始化View
     */
    private void initView() {

        mainBinding.slideMenuView.scrollTo(0,0);

        mainBinding.toolbarLayout.imgLeft.setImageResource(R.mipmap.icon_side);

        mainBinding.toolbarLayout.imgLeft.setOnClickListener(this);
        mainBinding.llHpmepage.setOnClickListener(this);
        mainBinding.llKnowledgehierarchy.setOnClickListener(this);
        mainBinding.llNavigation.setOnClickListener(this);
        mainBinding.llProgram.setOnClickListener(this);

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new HomeFragment());
        fragmentList.add(new KnowLedgeHierarchyFragment());
        fragmentList.add(new NavigationFragment());
        fragmentList.add(new ProgramFragment());

        FragmentPageAdapter fragmentPageAdapter = new FragmentPageAdapter(getSupportFragmentManager(),fragmentList);
        mainBinding.viewpager.setAdapter(fragmentPageAdapter);
        mainBinding.viewpager.setPageTransformer(true,new DepthPageTransformer());

        sideMenuListAdapter = new SideMenuListAdapter(this);
        mainBinding.drawerRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.drawerRecyclerView.setAdapter(sideMenuListAdapter);
    }

    /**
     * 初始化数据
     */
    private void initData() {

        List<SideMenuBean> sideMenuBeanList = new ArrayList<>();
        for (int i = 0;i < Constant.SIDE_MENU_ARRAY.length;i++){
            SideMenuBean sideMenuBean = new SideMenuBean();
            sideMenuBean.setName(Constant.SIDE_MENU_ARRAY[i]);
            sideMenuBeanList.add(sideMenuBean);
        }
        sideMenuListAdapter.loadData(sideMenuBeanList);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.ll_hpmepage:
                mainBinding.viewpager.setCurrentItem(Constant.HOME_PAGE);
                break;
            case R.id.ll_knowledgehierarchy:
                mainBinding.viewpager.setCurrentItem(Constant.KNOWLEDGE_HIERARCHY);
                break;
            case R.id.ll_navigation:
                mainBinding.viewpager.setCurrentItem(Constant.NAVIGATION);
                break;
            case R.id.ll_program:
                mainBinding.viewpager.setCurrentItem(Constant.PROGRAM);
                break;
            case R.id.img_left:
                mainBinding.slideMenuView.toggle();
                break;
        }

    }
    //两次退出应用
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            switch (keyBackClickCount++) {
                case 0:
                    ToastUtils.toast(this,"再次按返回键退出");
                    Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            keyBackClickCount = 0;
                        }
                    }, 3000);
                    break;
                case 1:
                    finish();
                    break;
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


}
