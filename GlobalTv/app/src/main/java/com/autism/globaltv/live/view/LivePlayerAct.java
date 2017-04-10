package com.autism.globaltv.live.view;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.RelativeLayout;

import com.autism.baselibs.view.tablayout.SmartTabLayout;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseAct;
import com.autism.globaltv.base.common.Config;
import com.autism.globaltv.live.model.LiveDetailEntity;
import com.autism.globaltv.live.pre.LivePlayerController;
import com.autism.globaltv.live.pre.LivePre;

/**
 * Author：i5 on 2017/4/10 11:00
 * Used:GlobalTv
 */
public class LivePlayerAct extends BaseAct<LivePre> implements View.OnTouchListener, LivePlayerView {
    private PlayerControllerView mControllerView;
    private String mUid;
    private LivePlayerController mLivePlayer;

    @Override
    protected LivePre getPresenter() {
        return new LivePre(this, this, mUid);
    }

    @Override
    protected void onInitViews() {
        Intent intent = getIntent();
        mUid = intent.getStringExtra(Config.ENTERUID);
        RelativeLayout mControllerViewContent = (RelativeLayout) findViewById(R.id.rl_controller_layout);
        measure(mControllerViewContent, 0, 450);
        SurfaceView mSurface = (SurfaceView) findViewById(R.id.sv_player);
        measure(mSurface, 0, 450);
        mSurface.setOnTouchListener(this);
        mControllerView = (PlayerControllerView) findViewById(R.id.pc_layout);
        SmartTabLayout smartTabLayout = (SmartTabLayout) findViewById(R.id.viewpagertab);
        ViewPager mPager = (ViewPager) findViewById(R.id.vp_player);

        mLivePlayer = new LivePlayerController(this, mSurface, 0);
    }

    @Override
    protected int getRelayoutID() {
        return R.layout.act_live_player;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                mControllerView.setControllerView(true);
                break;
            case MotionEvent.ACTION_UP:
                mControllerView.setControllerView(false);
                break;
        }
        return false;
    }

    @Override
    public void onEnterSuccess(LiveDetailEntity mLiveData) {
        mLivePlayer.setDataResUrl(mLiveData.getLive().getWs().getFlv().get_$3().getSrc());
    }

    @Override
    public void onEnterFailed(String msg) {

    }
}
