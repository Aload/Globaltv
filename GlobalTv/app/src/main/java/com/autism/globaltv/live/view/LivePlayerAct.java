package com.autism.globaltv.live.view;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.autism.baselibs.view.glide.GlideUtils;
import com.autism.baselibs.view.tablayout.FragmentPagerItem;
import com.autism.baselibs.view.tablayout.FragmentPagerItemAdapter;
import com.autism.baselibs.view.tablayout.FragmentPagerItems;
import com.autism.baselibs.view.tablayout.SmartTabLayout;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseAct;
import com.autism.globaltv.base.ViewUtils;
import com.autism.globaltv.base.common.Config;
import com.autism.globaltv.live.model.DanmuEntity;
import com.autism.globaltv.live.model.LiveDetailEntity;
import com.autism.globaltv.live.pre.LivePlayerController;
import com.autism.globaltv.live.pre.LivePre;
import com.autism.logiclibs.UiUtils;
import com.orzangleli.xdanmuku.DanmuContainerView;
import com.orzangleli.xdanmuku.DanmuConverter;

import java.util.Random;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

/**
 * Author：i5 on 2017/4/10 11:00
 * Used:GlobalTv
 */
public class LivePlayerAct extends BaseAct<LivePre> implements LivePlayerView, IPlayerLifeCircle, View.OnClickListener, View.OnTouchListener {
    private View mControllerView;
    private String mUid;
    private LivePlayerController mLivePlayer;
    private TextView mHeaderTitle;
    private TextView mHeaderContent;
    private CheckBox mOffOn;
    private TextView mNum;
    private ImageView mFullScreen;
    private View mController;
    private ImageView mHeaderView;
    private FrameLayout mControllerViewContent;
    private SurfaceView mSurface;
    private boolean isVertical = true;

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
        Intent intent = getIntent();
        mUid = intent.getStringExtra(Config.ENTERUID);
        mControllerViewContent = (FrameLayout) findViewById(R.id.rl_controller_layout);
        mSurface = (SurfaceView) findViewById(R.id.sv_player);
        DanmuContainerView mDmView = (DanmuContainerView) findViewById(R.id.dm_view);
        measure(mControllerViewContent, 0, 600);
        measure(mSurface, 0, 450);
        measure(mDmView, 0, 450);
        mControllerView = findViewById(R.id.pc_layout);
        mControllerView.setOnTouchListener(this);
        View mBack = mControllerView.findViewById(R.id.back);
        mBack.setOnClickListener(this);
        View mShare = mControllerView.findViewById(R.id.share);
        mShare.setOnClickListener(this);
        mController = mControllerView.findViewById(R.id.rl_controller);
        UiUtils.measure(mController, 0, 450);

        mOffOn = (CheckBox) mControllerView.findViewById(R.id.cb_player);
        mNum = (TextView) mControllerView.findViewById(R.id.tv_num);
        mFullScreen = (ImageView) mControllerView.findViewById(R.id.iv_fullscreen);

        View mHeaderContainer = mControllerView.findViewById(R.id.rl_container);
        UiUtils.measure(mHeaderContainer, 0, 150);

        mHeaderView = (ImageView) mControllerView.findViewById(R.id.iv_header);
        UiUtils.measure(mHeaderView, 92, 92);

        mHeaderTitle = (TextView) mControllerView.findViewById(R.id.tv_title);
        mHeaderContent = (TextView) mControllerView.findViewById(R.id.tv_content);

        mOffOn.setOnClickListener(this);
        mFullScreen.setOnClickListener(this);

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
        DanmuConverter danmuConverter = new DanmuConverter<DanmuEntity>() {
            @Override
            public int getSingleLineHeight() {
                //将所有类型弹幕的布局拿出来，找到高度最大值，作为弹道高度
                View view = LayoutInflater.from(LivePlayerAct.this).inflate(R.layout.item_danmu, null);
                //指定行高
                view.measure(0, 0);
                View view1 = LayoutInflater.from(LivePlayerAct.this).inflate(R.layout.item_danmu_02, null);
                //指定行高
                view.measure(0, 0);
                return Math.max(view.getMeasuredHeight(), view1.getMeasuredHeight());
            }

            @Override
            public View convert(DanmuEntity mEntity) {
                View mView;
                if (mEntity.getType() == 0) {
                    mView = LayoutInflater.from(LivePlayerAct.this).inflate(R.layout.item_danmu, null);
                    TextView content = (TextView) mView.findViewById(R.id.dm_txt);
                    ImageView image = (ImageView) mView.findViewById(R.id.dm_img);
                    measure(image, 72, 72);
                    GlideUtils.loadCirleImg(LivePlayerAct.this, mEntity.getImgUri(), image, R.mipmap.ic_default_head);
                    content.setText(mEntity.getMsg());
                } else {
                    mView = LayoutInflater.from(LivePlayerAct.this).inflate(R.layout.item_danmu_02, null);
                    TextView mText = (TextView) mView.findViewById(R.id.tv_dm);
                    mText.setText(mEntity.getMsg());
                }
                return mView;
            }
        };
        mDmView.setConverter(danmuConverter);
        mDmView.setSpeed(DanmuContainerView.HIGH_SPEED);
        mDmView.setGravity(DanmuContainerView.GRAVITY_TOP | DanmuContainerView.GRAVITY_CENTER | DanmuContainerView.GRAVITY_BOTTOM);
    }

    /**
     * 控制是否显示控制器
     *
     * @param isShown
     */
    public void setControllerView(boolean isShown) {
        mController.setVisibility(isShown ? VISIBLE : INVISIBLE);
    }

    @Override
    protected int getRelayoutID() {
        return R.layout.act_live_player;
    }


    @Override
    public void onEnterSuccess(LiveDetailEntity mLiveData) {
        mHeaderTitle.setText(mLiveData.getTitle());
        mHeaderContent.setText(mLiveData.getIntro());
        mNum.setText(String.valueOf(mLiveData.getView()));
        GlideUtils.loadCirleImg(this, mLiveData.getAvatar(), mHeaderView, R.mipmap.ic_default_head);
        LiveDetailEntity.LiveBean.WsBean.FlvBean._$3Bean src3 = mLiveData.getLive().getWs().getFlv().get_$3();
        LiveDetailEntity.LiveBean.WsBean.FlvBean._$4Bean src4 = mLiveData.getLive().getWs().getFlv().get_$4();
        LiveDetailEntity.LiveBean.WsBean.FlvBean._$5Bean src5 = mLiveData.getLive().getWs().getFlv().get_$5();
        if (null != src3) {
            mLivePlayer.setDataResUrl(src3.getSrc());
        } else if (null != src4) {
            mLivePlayer.setDataResUrl(src4.getSrc());
        } else {
            mLivePlayer.setDataResUrl(src5.getSrc());
        }
    }

    @Override
    public void onEnterFailed(String msg) {

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

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.back:
                ViewUtils.left2RightOut(this);
                finish();
                break;
            case R.id.share:
                break;
            case R.id.cb_player:
                break;
            case R.id.iv_fullscreen:
                setRequestedOrientation(isVertical ? ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE : ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                break;
        }
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        isVertical = newConfig.orientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                setControllerView(true);
                break;
            case MotionEvent.ACTION_UP:
                setControllerView(false);
                break;
        }
        return super.onTouchEvent(event);
    }
}
