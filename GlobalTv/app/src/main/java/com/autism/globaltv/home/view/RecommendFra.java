package com.autism.globaltv.home.view;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.baselibs.view.autopager.AutoScrollViewPager;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.base.IPresenter;
import com.autism.globaltv.home.model.BannerEntity;
import com.autism.globaltv.home.model.HomeEntity;
import com.autism.globaltv.home.pre.RecomRecyclerAdapter;
import com.autism.globaltv.home.pre.RecommendPre;

import java.util.List;

/**
 * Author：i5 on 2017/4/7 14:51
 * Used:GlobalTv
 */
public class RecommendFra extends BaseFra<RecommendPre> implements RecommendView {
    private RecyclerView mRecycler;
    private AutoScrollViewPager mPager;
    private RecomRecyclerAdapter mRecyclerRecomAdater;

    @Override
    protected RecommendPre getPresenter() {
        return new RecommendPre(getActivity(), this);
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        mPager = (AutoScrollViewPager) mView.findViewById(R.id.auto_pager);
        mRecycler = (RecyclerView) mView.findViewById(R.id.auto_recycler);
        measure(mPager, 0, 250);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        mRecyclerRecomAdater = new RecomRecyclerAdapter();
        mRecycler.setAdapter(mRecyclerRecomAdater);
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.recommom_layout;
    }

    @Override
    public void onRecommonSuccess(HomeEntity mData) {
        mRecyclerRecomAdater.notifyUi(mData);
    }

    @Override
    public void onBannerSuccess(BannerEntity mDate) {
        BannerPagerAadapter bannerPagerAadapter = new BannerPagerAadapter(getActivity(), mDate);
        mPager.setAdapter(bannerPagerAadapter);
        mPager.startAutoScroll(3000);
    }

    @Override
    public void onRecommonFailed(String msg) {

    }
}
