package com.autism.globaltv.live.view;

import android.os.Handler;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.baselibs.utils.LogUtil;
import com.autism.baselibs.view.refresh.SpringView;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.live.model.LiveEntity;
import com.autism.globaltv.live.pre.PlayerPre;

/**
 * Author：i5 on 2017/4/1 15:58
 * Used:GlobalTv
 */
public class PlayerFra extends BaseFra<PlayerPre> implements LiveView {
    private LiveAdapter mLiveAdapter;

    @Override
    protected PlayerPre getPresenter() {
        return new PlayerPre(getActivity(), this);
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        super.initTitle(mView);
        showDivider(true);
        setTitleText("直播频道");
        final SpringView mRefresh = (SpringView) mView.findViewById(R.id.refresh_sp);
        RecyclerView mRecycler = (RecyclerView) mView.findViewById(R.id.live_recycler);
        mRecycler.setLayoutManager(new GridLayoutManager(getActivity(), 2, LinearLayoutManager.VERTICAL, false));

        mLiveAdapter = new LiveAdapter();
        mRecycler.setAdapter(null);
        mRefresh.setType(SpringView.Type.FOLLOW);
        mRefresh.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRefresh.onFinishFreshAndLoad();
                    }
                }, 2000);
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
        });
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.player_fra_layout;
    }

    @Override
    public void onSuccessLive(LiveEntity mLive) {
        mLiveAdapter.notifyUi(mLive.getData());
    }

    @Override
    public void onFailed(String msg) {
        LogUtil.d(TAG, msg);
    }
}
