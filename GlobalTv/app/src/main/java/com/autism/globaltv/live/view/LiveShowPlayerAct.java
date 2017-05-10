package com.autism.globaltv.live.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.autism.baselibs.utils.NumUtils;
import com.autism.baselibs.utils.ToastUtils;
import com.autism.baselibs.view.chat.ChatListView;
import com.autism.baselibs.view.chat.InputPanel;
import com.autism.baselibs.view.chat.animation.HeartLayout;
import com.autism.baselibs.view.glide.GlideUtils;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseAct;
import com.autism.globaltv.base.BottomPanelFragment;
import com.autism.globaltv.base.ViewUtils;
import com.autism.globaltv.base.common.Config;
import com.autism.globaltv.live.model.LiveDetailEntity;
import com.autism.globaltv.live.model.message.GiftMessage;
import com.autism.globaltv.live.pre.ChatListAdapter;
import com.autism.globaltv.live.pre.LivePlayerController;
import com.autism.globaltv.live.pre.LivePre;

import java.util.Random;

import io.rong.imlib.RongIMClient;
import io.rong.imlib.model.MessageContent;
import io.rong.message.TextMessage;

/**
 * Author：autism on 2017/4/12 17:48
 * Used:GlobalTv
 */
public class LiveShowPlayerAct extends BaseAct<LivePre> implements LivePlayerView, View.OnClickListener, IPlayerLifeCircle, Handler.Callback {
    private String mUid;
    private LivePlayerController mLivePlayer;
    private SurfaceView mSurface;
    private ViewGroup background;
    private ChatListView chatListView;
    private BottomPanelFragment bottomPanel;
    private ImageView btnGift;
    private ImageView btnHeart;
    private HeartLayout heartLayout;
    private ChatListAdapter chatListAdapter;
    private Handler handler = new Handler(this);
    private Random random = new Random();
    private ImageView mImgePlayer;
    private TextView mTvName;
    private TextView mTvView;
    private boolean login;

    @Override
    public void setLiveConfig() {
        super.setLiveConfig();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        LiveKit.addEventHandler(handler);
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
        mSurface = (SurfaceView) findViewById(R.id.sv_player);
        background = (ViewGroup) findViewById(R.id.background);
        chatListView = (ChatListView) findViewById(R.id.chat_listview);
        bottomPanel = (BottomPanelFragment) getSupportFragmentManager().findFragmentById(R.id.bottom_bar);
        btnGift = (ImageView) bottomPanel.getView().findViewById(R.id.btn_gift);
        btnHeart = (ImageView) bottomPanel.getView().findViewById(R.id.btn_heart);
        heartLayout = (HeartLayout) findViewById(R.id.heart_layout);
        findViewById(R.id.back_iv).setOnClickListener(this);
        mTvName = (TextView) findViewById(R.id.tv_user);
        mImgePlayer = (ImageView) findViewById(R.id.iv_user);
        mTvView = (TextView) findViewById(R.id.tv_viewer);
        //用户头像
        RecyclerView mRvListView = (RecyclerView) findViewById(R.id.rv_view);
        mRvListView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mRvListView.setAdapter(null);

        chatListAdapter = new ChatListAdapter();
        chatListView.setAdapter(chatListAdapter);
        background.setOnClickListener(this);
        btnGift.setOnClickListener(this);
        btnHeart.setOnClickListener(this);
        bottomPanel.setInputPanelListener(new InputPanel.InputPanelListener() {
            @Override
            public void onSendClick(String text) {
                TextMessage content = TextMessage.obtain(text);
                LiveKit.sendMessage(content);
            }
        });
        mLivePlayer = new LivePlayerController(this, mSurface, 0, this);
    }

    @Override
    protected int getRelayoutID() {
        return R.layout.live_showing_act;
    }

    @Override
    public void onEnterSuccess(LiveDetailEntity mLiveData) {
        mLivePlayer.setDataResUrl(mLiveData.getLive().getWs().getFlv().get_$5().getSrc());
        GlideUtils.loadCirleImg(this, mLiveData.getAvatar(), mImgePlayer, R.mipmap.ic_default_head);
        mTvName.setText(mLiveData.getNick());
        mTvView.setText(new StringBuffer().append("观看人数").append(NumUtils.transFormNum(String.valueOf(mLiveData.getView()))).toString());
    }

    @Override
    public void onEnterFailed(String msg) {
        ToastUtils.showToast(this, msg);
    }

    @Override
    public void onClick(View v) {
        GiftMessage msg;
        int id = v.getId();
        if (id == R.id.back_iv) {
            mLivePlayer.release();
            ViewUtils.left2RightOut(this);
            finish();
            return;
        }
        //判断是否登陆,初始化用户信息,需要在init中同步融云用户信息 TODO
        if (!login) {
            ToastUtils.showToast(this, "请先登陆,谢谢~");
            return;
        }
        switch (id) {
            case R.id.background:
                bottomPanel.onBackAction();
                break;
            case R.id.btn_gift:
                msg = new GiftMessage("2", "送您一个礼物");
                LiveKit.sendMessage(msg);
                break;
            case R.id.btn_heart:
                heartLayout.post(new Runnable() {
                    @Override
                    public void run() {
                        int rgb = Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255));
                        heartLayout.addHeart(rgb);
                    }
                });
                msg = new GiftMessage("1", "为您点赞");
                LiveKit.sendMessage(msg);
                break;
        }
    }

    @Override
    public void onStartPlay() {
        dissLoading();
    }

    @Override
    public void onStopPlay() {
        showLoading();
    }

    @Override
    public void onErrorPlay() {
        dissLoading();
    }

    @Override
    public void onReconnect() {
        showLoading();
    }

    @Override
    public boolean handleMessage(Message msg) {
        switch (msg.what) {
            case LiveKit.MESSAGE_ARRIVED: {
                MessageContent content = (MessageContent) msg.obj;
                chatListAdapter.addMessage(content);
                break;
            }
            case LiveKit.MESSAGE_SENT: {
                MessageContent content = (MessageContent) msg.obj;
                chatListAdapter.addMessage(content);
                break;
            }
            case LiveKit.MESSAGE_SEND_ERROR: {
                break;
            }
            default:
        }
        chatListAdapter.notifyDataSetChanged();
        return false;
    }
}
