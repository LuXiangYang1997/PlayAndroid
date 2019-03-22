package com.example.playandroid.ui.navigation.view;

import com.example.playandroid.R;
import com.example.playandroid.base.BaseFragment;
import com.example.playandroid.databinding.FragmentNavigationBinding;
import com.example.playandroid.ui.navigation.vm.NavigationVM;

/**
 * @author created by 陆向阳 on 2019/3/22
 * 导航Fragment
 */
public class NavigationFragment extends BaseFragment<FragmentNavigationBinding,NavigationVM> {

    @Override
    public int initContentView() {
        return R.layout.fragment_navigation;
    }

    @Override
    public int initVariableId() {
        return 0;
    }

    @Override
    public NavigationVM initViewModel() {
        NavigationVM navigationVM = new NavigationVM();
        return navigationVM;
    }
}
