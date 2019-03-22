package com.example.playandroid.ui.program.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.playandroid.R;
import com.example.playandroid.base.BaseFragment;
import com.example.playandroid.base.BaseViewModel;
import com.example.playandroid.databinding.FragmentProgramBinding;
import com.example.playandroid.ui.program.vm.ProgramVM;

/**
 * @author created by 陆向阳 on 2019/3/22
 * 项目Program
 */
public class ProgramFragment extends BaseFragment<FragmentProgramBinding,ProgramVM> {

    @Override
    public int initContentView() {
        return R.layout.fragment_program;
    }

    @Override
    public int initVariableId() {
        return 0;
    }

    @Override
    public ProgramVM initViewModel() {

        ProgramVM programVM = new ProgramVM();

        return programVM;
    }
}
