package com.autism.globaltv.home.pre;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.baselibs.view.autopager.AutoScrollViewPager;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BasePagerHolder;
import com.autism.globaltv.home.model.BannerEntity;
import com.autism.globaltv.home.model.HomeEntity;
import com.autism.globaltv.home.view.BannerPagerAadapter;

import java.util.List;

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
        mPager.setScrollFactgor(6);
        mPager.setOffscreenPageLimit(5);
        mPager.startAutoScroll(3000);
    }

    @Override
    public void setData(List<HomeEntity.RoomBean> mData, List<BannerEntity.AppfocusBean> mBannerList) {
        super.setData(mData, mBannerList);
        mPager.setAdapter(new BannerPagerAadapter(mContext, mBannerList));
        RecomRecyclerAdapter recomRecyclerAdapter = new RecomRecyclerAdapter(mData);
        mRecycler.setLayoutManager(new LinearLayoutManager(mContext));
        mRecycler.setAdapter(recomRecyclerAdapter);
    }
}
