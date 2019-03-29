package com.example.playandroid.ui.knowledgehierarchy.view;

import com.example.playandroid.R;
import com.example.playandroid.base.BaseFragment;
import com.example.playandroid.databinding.FragmentKnowLedgeHierarchyBinding;
import com.example.playandroid.ui.knowledgehierarchy.vm.KnowLedgeHierarchyVM;

/**
 * @author created by 陆向阳 on 2019/3/22
 * 知识体系Fragment
 */
public class KnowLedgeHierarchyFragment extends BaseFragment<FragmentKnowLedgeHierarchyBinding,KnowLedgeHierarchyVM> {

    @Override
    public int initContentView() {
        return R.layout.fragment_know_ledge_hierarchy;
    }

    @Override
    public int initVariableId() {
        return 0;
    }

    @Override
    public KnowLedgeHierarchyVM initViewModel() {
        KnowLedgeHierarchyVM knowLedgeHierarchyVM = new KnowLedgeHierarchyVM();
        return knowLedgeHierarchyVM;
    }
}
