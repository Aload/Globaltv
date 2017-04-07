package com.autism.globaltv.home.view;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseRecyclerHolder;
import com.autism.globaltv.home.model.HomeEntity;
import com.autism.globaltv.home.pre.RecommonItemAdapter;

/**
 * Author：i5 on 2017/4/5 14:43
 * Used:GlobalTv
 */
public class RecomRecyclerHolder extends BaseRecyclerHolder<HomeEntity.RoomBean> {
    private TextView mTitle;
    private RecommonItemAdapter recommonItemAdapter;

    public RecomRecyclerHolder(ViewGroup parent) {
        super(parent, R.layout.recommon_item);
        mTitle = $(R.id.item_title);
        RecyclerView mRecycler = $(R.id.child_recycler);
        View mLayout = $(R.id.title_layout);
        measure(mLayout, 0, 160);
        mRecycler.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recommonItemAdapter = new RecommonItemAdapter();
        mRecycler.setAdapter(recommonItemAdapter);
    }

    @Override
    public void setData(HomeEntity.RoomBean mData) {
        mTitle.setText(mData.getName());
        recommonItemAdapter.notifyItemUi(mData.getList());
    }
}
