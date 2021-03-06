package com.autism.globaltv.live.view;

import android.os.Handler;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.baselibs.utils.LogUtil;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.base.ViewUtils;
import com.autism.globaltv.base.common.Config;
import com.autism.globaltv.live.model.LiveEntity;
import com.autism.globaltv.live.pre.LiveAdapter;
import com.autism.globaltv.live.pre.PlayerPre;

/**
 * Author：i5 on 2017/4/1 15:58
 * Used:GlobalTv
 */
public class PlayerFra extends BaseFra<PlayerPre> implements LiveView, IOnItemClickListener {
    private LiveAdapter mLiveAdapter;

    @Override
    protected PlayerPre getPresenter() {
        return new PlayerPre(getActivity(), this);
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        RecyclerView mRecycler = (RecyclerView) mView.findViewById(R.id.live_recycler);
        mRecycler.setLayoutManager(new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false));
        mLiveAdapter = new LiveAdapter();
        mRecycler.setAdapter(mLiveAdapter);
        mLiveAdapter.setOnItemClick(this);
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.player_fra_layout;
    }

    @Override
    public void onSuccessLive(LiveEntity mLive) {
        mRefresh.onFinishFreshAndLoad();
        mLiveAdapter.notifyUi(mLive.getData());
    }

    @Override
    public void onFailed(String msg) {
        mRefresh.onFinishFreshAndLoad();
        LogUtil.d(TAG, msg);
    }

    @Override
    public void onRefresh() {
        mPresenter.attachView();
    }

    @Override
    public void onLoadmore() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mRefresh.onFinishFreshAndLoad();
            }
        }, 2000);
    }

    @Override
    public void itemClick(int position, LiveEntity.DataBeanX mData) {
        if ("showing".equals(mData.getCategory_slug())) {
            ViewUtils.intentLefttoRightBundleInteger(getActivity(), LiveShowPlayerAct.class, Config.ENTERUID, mData.getUid());
        } else
            ViewUtils.intentLefttoRightBundleInteger(getActivity(), LivePlayerAct.class, Config.ENTERUID, mData.getUid());
    }
}
