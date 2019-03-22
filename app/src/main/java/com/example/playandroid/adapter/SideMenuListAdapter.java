package com.example.playandroid.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.ViewGroup;
import com.example.playandroid.R;
import com.example.playandroid.base.BaseAdapter;
import com.example.playandroid.base.BaseViewHolder;
import com.example.playandroid.bean.SideMenuBean;
import com.example.playandroid.constant.Constant;
import com.example.playandroid.databinding.SideMenuLayoutBinding;
import com.example.playandroid.util.EmptyUtils;

/**
 * @author created by 陆向阳 on 2019/3/22
 */
public class SideMenuListAdapter extends BaseAdapter<SideMenuBean, BaseViewHolder> {

    private Context context;

    public SideMenuListAdapter(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public BaseViewHolder onCreateVH(ViewGroup parent, int viewType) {
      SideMenuLayoutBinding sideMenuLayoutBinding = DataBindingUtil.inflate(inflater,R.layout.side_menu_layout,parent,false);
        return new BaseViewHolder(sideMenuLayoutBinding);
    }

    @Override
    public void onBindVH(BaseViewHolder baseViewHolder, int position) {
        SideMenuLayoutBinding sideMenuLayoutBinding = (SideMenuLayoutBinding) baseViewHolder.getBinding();
        if (EmptyUtils.isNotEmpty(mList.get(position))){
            sideMenuLayoutBinding.tvName.setText(mList.get(position).getName());
            if (mList.get(position).getName().equals(Constant.SIDE_MENU_ARRAY[0])){

            }else if (mList.get(position).getName().equals(Constant.SIDE_MENU_ARRAY[1])){

            }
        }
    }
}
