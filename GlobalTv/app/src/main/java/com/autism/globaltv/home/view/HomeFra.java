package com.autism.globaltv.home.view;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.autism.baselibs.utils.LogUtil;
import com.autism.baselibs.view.refresh.SpringView;
import com.autism.baselibs.view.refresh.container.MeituanFooter;
import com.autism.baselibs.view.refresh.container.MeituanHeader;
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
    private int[] pullAnimSrcs = new int[]{R.mipmap.mt_pull, R.mipmap.mt_pull01, R.mipmap.mt_pull02, R.mipmap.mt_pull03, R.mipmap.mt_pull04, R.mipmap.mt_pull05};
    private int[] refreshAnimSrcs = new int[]{R.mipmap.mt_refreshing01, R.mipmap.mt_refreshing02, R.mipmap.mt_refreshing03, R.mipmap.mt_refreshing04, R.mipmap.mt_refreshing05, R.mipmap.mt_refreshing06};
    private int[] loadingAnimSrcs = new int[]{R.mipmap.mt_loading01, R.mipmap.mt_loading02};
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
        final SpringView springView = (SpringView) mView.findViewById(R.id.pv_refresh);
        mTabLayout = (SlidingTabLayout) mView.findViewById(R.id.mTablayout);
        mTabIndicator = (ImageView) mView.findViewById(R.id.tabManager);
        mPager = (ViewPager) mView.findViewById(R.id.vp_pager);
        springView.setType(SpringView.Type.FOLLOW);
        springView.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        springView.onFinishFreshAndLoad();
                    }
                }, 2000);
            }

            @Override
            public void onLoadmore() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        springView.onFinishFreshAndLoad();
                    }
                }, 2000);
            }
        });
        springView.setHeader(new MeituanHeader(getActivity(), pullAnimSrcs, refreshAnimSrcs));
        springView.setFooter(new MeituanFooter(getActivity(), loadingAnimSrcs));
    }


    @Override
    protected int getReLayoutFraID() {
        return R.layout.home_fra_layout;
    }

    @Override
    public void onSuccess(List<HomeEntity.RoomBean> mBean) {
        if (null == mBean && mBean.isEmpty()) return;
        mRecommonAdapter = new RecommonAdapter(getActivity(), mBean, mList);
        mPager.setOffscreenPageLimit(2);
        mPager.setAdapter(mRecommonAdapter);
        mTabLayout.setViewPager(mPager);
    }

    @Override
    public void onError() {
        LogUtil.d(TAG, "请求失败");
    }

    @Override
    public void onBannerSuccess(List<BannerEntity.AppfocusBean> mBean) {
        this.mList = mBean;
    }

    @Override
    public void onClick(View v) {

    }
}
