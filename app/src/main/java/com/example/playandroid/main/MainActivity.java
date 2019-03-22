package com.example.playandroid.main;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.playandroid.R;
import com.example.playandroid.adapter.FragmentPageAdapter;
import com.example.playandroid.databinding.ActivityMainBinding;
import com.example.playandroid.ui.home.view.HomeFragment;
import com.example.playandroid.ui.knowledgehierarchy.view.KnowLedgeHierarchyFragment;
import com.example.playandroid.ui.navigation.view.NavigationFragment;
import com.example.playandroid.ui.program.view.ProgramFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initView();
    }

    /**
     * 初始化View
     */
    private void initView() {

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
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.ll_hpmepage:
                mainBinding.viewpager.setCurrentItem(0);
                break;
            case R.id.ll_knowledgehierarchy:
                mainBinding.viewpager.setCurrentItem(1);
                break;
            case R.id.ll_navigation:
                mainBinding.viewpager.setCurrentItem(2);
                break;
            case R.id.ll_program:
                mainBinding.viewpager.setCurrentItem(3);
                break;
        }

    }
}
