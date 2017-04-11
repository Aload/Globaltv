package com.autism.globaltv.live.view;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.SurfaceView;
import android.widget.RelativeLayout;

import com.autism.baselibs.view.tablayout.FragmentPagerItem;
import com.autism.baselibs.view.tablayout.FragmentPagerItemAdapter;
import com.autism.baselibs.view.tablayout.FragmentPagerItems;
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
public class LivePlayerAct extends BaseAct<LivePre> implements LivePlayerView, PlayerControllerView.IPlayerControllerListener, IPlayerLifeCircle {
    private PlayerControllerView mControllerView;
    private String mUid;
    private LivePlayerController mLivePlayer;

    @Override
    protected LivePre getPresenter() {
        return new LivePre(this, this, mUid);
    }

    @Override
    public void onInitViews() {
        Intent intent = getIntent();
        mUid = intent.getStringExtra(Config.ENTERUID);
        RelativeLayout mControllerViewContent = (RelativeLayout) findViewById(R.id.rl_controller_layout);
        measure(mControllerViewContent, 0, 600);
        SurfaceView mSurface = (SurfaceView) findViewById(R.id.sv_player);
        measure(mSurface, 0, 450);
        mControllerView = (PlayerControllerView) findViewById(R.id.pc_layout);
        SmartTabLayout smartTabLayout = (SmartTabLayout) findViewById(R.id.viewpagertab);
        ViewPager mPager = (ViewPager) findViewById(R.id.vp_player);
        FragmentPagerItems pages = new FragmentPagerItems(this);
        pages.add(FragmentPagerItem.of(getString(R.string.chat), ChatFra.class));
        pages.add(FragmentPagerItem.of(getString(R.string.sort), SortPlayerFra.class));
        pages.add(FragmentPagerItem.of(getString(R.string.player), PlayerDetailFra.class));
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), pages);
        mPager.setAdapter(adapter);
        smartTabLayout.setViewPager(mPager);
        mLivePlayer = new LivePlayerController(this, mSurface, 0, this);
        mControllerView.setVariableListener(this);
    }

    @Override
    protected int getRelayoutID() {
        return R.layout.act_live_player;
    }


    @Override
    public void onEnterSuccess(LiveDetailEntity mLiveData) {
        mControllerView.setOtherData(mLiveData);
        mLivePlayer.setDataResUrl(mLiveData.getLive().getWs().getFlv().get_$3().getSrc());
    }

    @Override
    public void onEnterFailed(String msg) {

    }

    @Override
    public void onPlayer() {

    }

    @Override
    public void onOffScreen() {

    }

    @Override
    public void onStartPlay() {
        dissLoading();
    }

    @Override
    public void onStopPlay() {

    }

    @Override
    public void onErrorPlay() {

    }

    @Override
    public void onReconnect() {
        showLoading();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
