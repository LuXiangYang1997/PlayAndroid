package com.example.playandroid.base;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

import com.example.playandroid.util.LogUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Base适配器
 * Created by 陆向阳 on 2019/3/21.
 */

public abstract class BasePageAdapter<T> extends PagerAdapter {

    public List<T> mData;//数据源
    private SparseArray<View> mViews;
    private Context context;

    public BasePageAdapter(Context context) {
        this.context = context;
        this.mData = new ArrayList<>();
        mViews = new SparseArray<View>(mData.size());
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;//设置MAX_VALUE实现循环播放
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = mViews.get(position);
        if (view == null) {
            view = newView(container, position);
            mViews.put(position, view);
        }
        container.addView(view);
        return view;
    }

    public abstract View newView(ViewGroup parent, int position);

    //Item销毁后移除这个View
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mViews.get(position));
    }

    public T getItem(int position) {
        return mData.get(position);
    }

    //加载数据
    public void loadData(List data) {
        LogUtil.e("DATA",data.size()+"");
        mData.clear();
        mData.addAll(data);
        notifyDataSetChanged();
    }

}

