package com.example.playandroid.ui.home.view;

import com.example.playandroid.R;
import com.example.playandroid.base.BaseFragment;
import com.example.playandroid.databinding.FragmentHomeBinding;
import com.example.playandroid.ui.home.vm.HomePageVM;

/**
 * @author created by 陆向阳 on 2019/3/22
 * 首页Fragment
 */
public class HomeFragment extends BaseFragment<FragmentHomeBinding,HomePageVM> {

    @Override
    public int initContentView() {
        return R.layout.fragment_home;
    }

    @Override
    public int initVariableId() {

        return 0;
    }

    @Override
    public HomePageVM initViewModel() {
        HomePageVM homePageVM = new HomePageVM();
        return homePageVM;
    }
}
