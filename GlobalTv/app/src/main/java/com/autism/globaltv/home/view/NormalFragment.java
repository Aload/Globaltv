package com.autism.globaltv.home.view;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.baselibs.utils.LogUtil;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.base.ViewUtils;
import com.autism.globaltv.base.common.Config;
import com.autism.globaltv.home.model.api.LiveListEntity;
import com.autism.globaltv.home.pre.NormalAdapter;
import com.autism.globaltv.home.pre.NormalPre;
import com.autism.globaltv.live.view.LivePlayerAct;
import com.autism.globaltv.live.view.LiveShowPlayerAct;

/**
 * Author：i5 on 2017/5/10 14:39
 * Used:GlobalTv
 */
public class NormalFragment extends BaseFra<NormalPre> implements NormalView, OnNormalOnclick {
    private NormalAdapter mNormalAdapter;
    private String mSlug;

    public static NormalFragment newInstance(String slug) {
        Bundle args = new Bundle();

        NormalFragment fragment = new NormalFragment();
        fragment.mSlug = slug;
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected NormalPre getPresenter() {
        return new NormalPre(getActivity(), this, mSlug);
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        RecyclerView mRecycleView = (RecyclerView) mView.findViewById(R.id.home_view_recycler);
        mRecycleView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mNormalAdapter = new NormalAdapter();
        mRecycleView.setAdapter(mNormalAdapter);
        mNormalAdapter.setItemClick(this);
    }

    @Override
    public void onRefresh() {
        super.onRefresh();
        mPresenter.attachView();
    }

    @Override
    public void onLoadmore() {
        super.onLoadmore();
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.home_common_layout;
    }

    @Override
    public void getNormalList(LiveListEntity mList) {
        mRefresh.onFinishFreshAndLoad();
        mNormalAdapter.notifyUi(mList);
    }

    @Override
    public void getNormalError(String msg) {
        LogUtil.e("TAG", msg);
    }

    @Override
    public void onItemClick(LiveListEntity.LiveInfo mData) {
        if ("showing".equals(mData.getCategory_slug())) {
            ViewUtils.intentLefttoRightBundleInteger(getActivity(), LiveShowPlayerAct.class, Config.ENTERUID, String.valueOf(mData.getUid()));
        } else
            ViewUtils.intentLefttoRightBundleInteger(getActivity(), LivePlayerAct.class, Config.ENTERUID, String.valueOf(mData.getUid()));
    }
}
