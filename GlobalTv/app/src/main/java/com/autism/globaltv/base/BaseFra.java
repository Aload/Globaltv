package com.autism.globaltv.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.autism.baselibs.EventBusLogicUtils;
import com.autism.globaltv.R;
import com.autism.logiclibs.UiUtils;

/**
 * Author：autism on 2017/4/1 11:26
 * Used:GlobalTv base fragment
 */
public abstract class BaseFra<T extends IPresenter> extends Fragment {
    protected T mPresenter;
    protected static final String TAG = BaseFra.class.getSimpleName();
    protected TextView mTvTitle;
    protected TextView mTvTitleLeft;
    protected TextView mTvTitleLeft1;
    protected TextView mTvTitleRight;
    protected TextView mTvTitleRight1;
    protected View mViewTitle;
    protected View mViewDivider;
    private View mViewTitleLeft;
    protected View mViewTitleLeft1;
    protected View mViewTitleRight;
    protected View mViewTitleRight1;
    protected View mViewStatusBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = LayoutInflater.from(getActivity()).inflate(getReLayoutFraID(), container, false);
        onInitFraView(mView);
        onVariable();
        EventBusLogicUtils.registerBus(this);
        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPresenter = getPresenter();
        if (null != mPresenter) mPresenter.attachView();
    }

    protected abstract T getPresenter();

    /**
     * 测量view位置
     *
     * @param mViewTitle
     * @param width      width
     * @param height     height
     */
    protected void measure(View mViewTitle, int width, int height) {
        UiUtils.measure(mViewTitle, width, height);
    }

    /**
     * 初始化部分的参数
     */
    public void onVariable() {

    }

    /**
     * 需要初始化view时候复写即可
     *
     * @param mView
     */
    protected void onInitFraView(View mView) {

    }

    protected abstract int getReLayoutFraID();

    /**
     * 初始化标题
     *
     * @param mView
     */
    protected void initTitle(View mView) {
        mViewTitle = mView.findViewById(R.id.view_title);
        mViewDivider = mView.findViewById(R.id.view_divider);
        mViewStatusBar = mView.findViewById(R.id.view_status_bar);
        if (null != mViewTitle) {
            measure(mViewTitle, 0, 168);
            mViewTitleLeft = mView.findViewById(R.id.ll_title_left);
            mViewTitleLeft1 = mView.findViewById(R.id.ll_title_left_1);
            mViewTitleRight = mView.findViewById(R.id.ll_title_right);
            mViewTitleRight1 = mView.findViewById(R.id.ll_title_right1);
            mTvTitle = (TextView) mView.findViewById(R.id.tv_title_mid);
            mTvTitleLeft = (TextView) mView.findViewById(R.id.tv_title_left);
            mTvTitleLeft1 = (TextView) mView.findViewById(R.id.tv_title_left_1);
            mTvTitleRight = (TextView) mView.findViewById(R.id.tv_title_right);
            mTvTitleRight1 = (TextView) mView.findViewById(R.id.tv_title_right_1);
        }
    }

    /**
     * 设置文字
     *
     * @param title
     */
    protected void setTitleText(String title) {
        if (null != mTvTitle) {
            mTvTitle.setText(title);
        }
    }

    /**
     * 设置左边的按钮图片
     *
     * @param resId
     * @param listener
     */
    protected void setTitleLeftIcon(int resId, View.OnClickListener listener) {
        if (null != mTvTitleLeft) {
            mTvTitleLeft.setBackgroundResource(resId);
            measure(mTvTitleLeft, 0, 75);
        }
        if (null != listener & null != mViewTitleLeft) {
            mViewTitleLeft.setOnClickListener(listener);
        }
    }

    /**
     * 设置右边的按钮的图片
     *
     * @param resId
     * @param listener
     */
    protected void setTitleRightIcon(int resId, View.OnClickListener listener) {
        if (null != mTvTitleRight) {
            mTvTitleRight.setBackgroundResource(resId);
            measure(mTvTitleRight, 92, 92);
        }
        if (null != listener & null != mViewTitleRight) {
            mViewTitleRight.setOnClickListener(listener);
        }
    }

    /**
     * 是否显示分割线
     *
     * @param show
     */
    protected void showDivider(boolean show) {
        if (null == mViewDivider) {
            return;
        }
        if (show) {
            mViewDivider.setVisibility(View.VISIBLE);
        } else {
            mViewDivider.setVisibility(View.GONE);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBusLogicUtils.unRegisterBus(this);
    }
}
