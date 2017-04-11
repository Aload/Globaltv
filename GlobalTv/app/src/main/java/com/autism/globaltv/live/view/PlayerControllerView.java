package com.autism.globaltv.live.view;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.baselibs.view.glide.GlideUtils;
import com.autism.globaltv.R;
import com.autism.globaltv.live.model.LiveDetailEntity;
import com.autism.logiclibs.UiUtils;

/**
 * Author：i5 on 2017/4/10 13:29
 * Used:GlobalTv
 */
public class PlayerControllerView extends FrameLayout implements View.OnClickListener {
    private TextView mHeaderTitle;
    private TextView mHeaderContent;
    private CheckBox mOffOn;
    private TextView mNum;
    private ImageView mFullScreen;
    private View mController;
    private IPlayerControllerListener mPlayerListener;
    private ImageView mHeaderView;

    public PlayerControllerView(@NonNull Context context) {
        this(context, null);
    }

    public PlayerControllerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PlayerControllerView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        onInitView(context);
    }

    private void onInitView(Context context) {
        View mControllerView = LayoutInflater.from(context).inflate(R.layout.controll_view, null);
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
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
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

    /**
     * 控制是否显示控制器
     *
     * @param isShown
     */
    public void setControllerView(boolean isShown) {
        mController.setVisibility(isShown ? VISIBLE : INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cb_player:
                mPlayerListener.onPlayer();
                break;
            case R.id.iv_fullscreen:
                mPlayerListener.onOffScreen();
                break;
            case R.id.back:
                mPlayerListener.onStopPlay();
                break;
            case R.id.share:
                break;
            default:
                break;
        }
    }

    /**
     * 设置控制器监听器
     *
     * @param mListener
     */
    public void setVariableListener(IPlayerControllerListener mListener) {
        this.mPlayerListener = mListener;
    }

    /**
     * 设置控制器数据
     *
     * @param mLiveData
     */
    public void setOtherData(LiveDetailEntity mLiveData) {
        mHeaderTitle.setText(mLiveData.getTitle());
        mHeaderContent.setText(mLiveData.getIntro());
        mNum.setText(String.valueOf(mLiveData.getView()));
        GlideUtils.loadCirleImg(getContext(), mLiveData.getAvatar(), mHeaderView, R.mipmap.ic_default_head);
    }

    public interface IPlayerControllerListener {
        void onPlayer();

        void onOffScreen();

        void onStopPlay();
    }
}
