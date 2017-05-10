package com.autism.globaltv.home.view;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.autism.baselibs.utils.LogUtil;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.home.model.NormalEntity;
import com.autism.globaltv.home.pre.HomePre;
import com.king.base.adapter.ViewPagerFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：autism on 2017/5/10 10:57
 * Used:GlobalTv
 */
public class HomeFra extends BaseFra<HomePre> implements HomeView {
    private ViewPagerFragmentAdapter mHomePager;
    private TabLayout mTabLayout;
    private static final String TAG = HomeFra.class.getSimpleName();
    private ViewPager mPager;
    private List<CharSequence> listTitle;
    private List<NormalEntity> listCategory;
    private List<Fragment> listData;

    @Override
    protected HomePre getPresenter() {
        return new HomePre(getActivity(), this);
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.home_fra_layout;
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        listCategory = new ArrayList<>();
        listData = new ArrayList<>();
        listTitle = new ArrayList<>();
        mTabLayout = (TabLayout) mView.findViewById(R.id.home_tab);
        mPager = (ViewPager) mView.findViewById(R.id.tab_pager);
        mHomePager = new ViewPagerFragmentAdapter(getChildFragmentManager(), listData, listTitle);
        mPager.setAdapter(mHomePager);
        mPager.setAdapter(mHomePager);
        mTabLayout.setupWithViewPager(mPager);
    }

    @Override
    public void getHomeData(List<NormalEntity> mList) {
        mPager.setOffscreenPageLimit(mList.size());
        toSetList(listCategory, mList, false);
        listData.clear();
        List<CharSequence> listTemp = new ArrayList<>();
        //----------------------
        listTemp.add(getText(R.string.recommend));
        listData.add(new RecommendFra());
        listTemp.add(getText(R.string.tab_all));
        listData.add(NormalFragment.newInstance(null));
        for (NormalEntity roomBean : mList) {
            listTemp.add(roomBean.getName());
            listData.add(NormalFragment.newInstance(roomBean.getSlug()));
        }
        toSetList(listTitle, listTemp, false);
        if (mHomePager != null) {
            mHomePager.setListTitle(listTitle);
            mHomePager.setListData(listData);
            mHomePager.notifyDataSetChanged();
        }
    }

    @Override
    public void getErrorData(String msg) {
        LogUtil.d(TAG, msg);
    }
}
