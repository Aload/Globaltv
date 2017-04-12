package com.autism.globaltv.live.view;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseAct;
import com.autism.globaltv.base.ViewUtils;
import com.autism.globaltv.base.common.Config;
import com.autism.globaltv.live.model.LiveDetailEntity;
import com.autism.globaltv.live.pre.LivePlayerController;
import com.autism.globaltv.live.pre.LivePre;

/**
 * Author：i5 on 2017/4/12 17:48
 * Used:GlobalTv
 */
public class LiveShowPlayerAct extends BaseAct<LivePre> implements LivePlayerView, View.OnTouchListener, View.OnClickListener, IPlayerLifeCircle {
    private View mControllerView;
    private String mUid;
    private LivePlayerController mLivePlayer;
    private CheckBox mOffOn;
    private TextView mNum;
    private ImageView mFullScreen;
    private View mController;
    private FrameLayout mControllerViewContent;
    private SurfaceView mSurface;


    @Override
    public void setLiveConfig() {
        super.setLiveConfig();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    @Override
    protected LivePre getPresenter() {
        return new LivePre(this, this, mUid);
    }

    @Override
    public void onInitViews() {
        super.onInitViews();
        Intent intent = getIntent();
        mUid = intent.getStringExtra(Config.ENTERUID);
        mControllerViewContent = (FrameLayout) findViewById(R.id.rl_controller_layout);
        mSurface = (SurfaceView) findViewById(R.id.sv_player);
        mControllerView = findViewById(R.id.pc_layout);
        mControllerView.setOnTouchListener(this);
        View mBack = mControllerView.findViewById(R.id.back);
        mBack.setOnClickListener(this);
        View mShare = mControllerView.findViewById(R.id.share);
        mShare.setOnClickListener(this);
        mController = mControllerView.findViewById(R.id.rl_controller);
        mOffOn = (CheckBox) mControllerView.findViewById(R.id.cb_player);
        mNum = (TextView) mControllerView.findViewById(R.id.tv_num);
        mFullScreen = (ImageView) mControllerView.findViewById(R.id.iv_fullscreen);
        mFullScreen.setVisibility(View.GONE);
        mLivePlayer = new LivePlayerController(this, mSurface, 0, this);
    }

    @Override
    protected int getRelayoutID() {
        return R.layout.live_showing_act;
    }

    @Override
    public void onEnterSuccess(LiveDetailEntity mLiveData) {
        mLivePlayer.setDataResUrl(mLiveData.getLive().getWs().getFlv().get_$5().getSrc());
    }

    @Override
    public void onEnterFailed(String msg) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.back:
                mLivePlayer.setOnStopPlay();
                ViewUtils.left2RightOut(this);
                finish();
                break;
        }
    }

    @Override
    public void onStartPlay() {

    }

    @Override
    public void onStopPlay() {

    }

    @Override
    public void onErrorPlay() {

    }

    @Override
    public void onReconnect() {

    }
}
