package com.autism.globaltv.home.pre;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.baselibs.utils.LogUtil;
import com.autism.baselibs.view.autopager.AutoScrollViewPager;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BasePagerHolder;
import com.autism.globaltv.home.model.BannerEntity;
import com.autism.globaltv.home.model.HomeEntity;
import com.autism.globaltv.home.view.BannerPagerAadapter;

import java.util.List;
import java.util.logging.Logger;

/**
 * Author：i5 on 2017/4/5 14:15
 * Used:GlobalTv
 */
public class RecommonHolder extends BasePagerHolder<List<HomeEntity.RoomBean>> {
    private RecyclerView mRecycler;
    private AutoScrollViewPager mPager;

    public RecommonHolder(View mView, Context mContext) {
        super(mView, mContext);
    }

    @Override
    public void onInitView(View mView) {
        mPager = (AutoScrollViewPager) mView.findViewById(R.id.auto_pager);
        mRecycler = (RecyclerView) mView.findViewById(R.id.auto_recycler);
        measure(mPager, 0, 250);
    }

    @Override
    public void setData(List<HomeEntity.RoomBean> mData, List<BannerEntity.AppfocusBean> mBannerList) {
        super.setData(mData, mBannerList);
        mPager.setAdapter(new BannerPagerAadapter(mContext, mBannerList));
        mRecycler.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, true));
        mRecycler.setAdapter(new RecomRecyclerAdapter(mData));
    }
}
