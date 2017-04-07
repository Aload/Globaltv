package com.autism.globaltv.home.view;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.autism.baselibs.utils.LogUtil;
import com.autism.baselibs.view.tab.SlidingTabLayout;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.home.model.BannerEntity;
import com.autism.globaltv.home.model.HomeEntity;
import com.autism.globaltv.home.pre.HomePre;
import com.autism.globaltv.home.pre.RecommonAdapter;

import java.util.List;

/**
 * Author：Autism on 2017/4/1 15:58
 * Used:GlobalTv
 */
public class HomeFra extends BaseFra<HomePre> implements IHomeView, View.OnClickListener {
    private SlidingTabLayout mTabLayout;
    private ImageView mTabIndicator;
    private ViewPager mPager;
    private RecommonAdapter mRecommonAdapter;
    private List<BannerEntity.AppfocusBean> mList;

    @Override
    protected HomePre getPresenter() {
        return new HomePre(getActivity(), this);
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        super.initTitle(mView);
        setTitleLeftIcon(R.mipmap.img_rec_logo, null);
        setTitleRightIcon(R.drawable.btn_search_selector, this);
        showDivider(true);
        mTabLayout = (SlidingTabLayout) mView.findViewById(R.id.mTablayout);
        mTabIndicator = (ImageView) mView.findViewById(R.id.tabManager);
        mPager = (ViewPager) mView.findViewById(R.id.vp_pager);
    }


    @Override
    protected int getReLayoutFraID() {
        return R.layout.home_fra_layout;
    }

    @Override
    public void onSuccess(List<HomeEntity.RoomBean> mBean) {
        mRefresh.onFinishFreshAndLoad();
        if (null == mBean && mBean.isEmpty()) return;
        mRecommonAdapter = new RecommonAdapter(getActivity(), mBean, mList);
        mPager.setOffscreenPageLimit(2);
        mPager.setAdapter(mRecommonAdapter);
        mTabLayout.setViewPager(mPager);
    }

    @Override
    public void onError() {
        mRefresh.onFinishFreshAndLoad();
        LogUtil.d(TAG, "请求失败");
    }

    @Override
    public void onBannerSuccess(List<BannerEntity.AppfocusBean> mBean) {
        this.mList = mBean;
    }

    @Override
    public void onClick(View v) {

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
}
