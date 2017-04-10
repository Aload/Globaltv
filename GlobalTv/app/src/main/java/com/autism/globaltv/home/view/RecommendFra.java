package com.autism.globaltv.home.view;

import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.baselibs.utils.LogUtil;
import com.autism.baselibs.view.autopager.AutoScrollViewPager;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.home.model.BannerEntity;
import com.autism.globaltv.home.model.HomeEntity;
import com.autism.globaltv.home.pre.RecomRecyclerAdapter;
import com.autism.globaltv.home.pre.RecommendPre;

/**
 * Author：i5 on 2017/4/7 14:51
 * Used:GlobalTv
 */
public class RecommendFra extends BaseFra<RecommendPre> implements RecommendView {
    private RecyclerView mRecycler;
    private AutoScrollViewPager mPager;
    private RecomRecyclerAdapter mRecyclerRecomAdapter;

    @Override
    protected RecommendPre getPresenter() {
        return new RecommendPre(getActivity(), this);
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        mPager = (AutoScrollViewPager) mView.findViewById(R.id.auto_pager);
        mRecycler = (RecyclerView) mView.findViewById(R.id.auto_recycler);
        measure(mPager, 0, 350);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        mRecyclerRecomAdapter = new RecomRecyclerAdapter();
        mRecycler.setAdapter(mRecyclerRecomAdapter);
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.recommom_layout;
    }

    @Override
    public void onRecommonSuccess(HomeEntity mData) {
        mRefresh.onFinishFreshAndLoad();
        mRecyclerRecomAdapter.notifyUi(mData);
    }

    @Override
    public void onBannerSuccess(BannerEntity mDate) {

        BannerPagerAdapter bannerPagerAdapter = new BannerPagerAdapter(getActivity(), mDate);
        mPager.setAdapter(bannerPagerAdapter);
        mPager.startAutoScroll(3000);
        mPager.setScrollFactgor(6.0D);
        mPager.setOffscreenPageLimit(4);
    }

    @Override
    public void onRefresh() {
        super.onRefresh();
        mPresenter.attachView();
    }

    @Override
    public void onLoadmore() {
        super.onLoadmore();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mRefresh.onFinishFreshAndLoad();
            }
        }, 2000);
    }

    @Override
    public void onRecommonFailed(String msg) {
        LogUtil.d(TAG, msg);
        mRefresh.onFinishFreshAndLoad();
    }
}
