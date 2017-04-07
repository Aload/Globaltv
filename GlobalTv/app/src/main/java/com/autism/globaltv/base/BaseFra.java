package com.autism.globaltv.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.baselibs.EventBusLogicUtils;
import com.autism.baselibs.view.refresh.SpringView;
import com.autism.baselibs.view.refresh.container.MeituanFooter;
import com.autism.baselibs.view.refresh.container.MeituanHeader;
import com.autism.globaltv.R;
import com.autism.logiclibs.UiUtils;

/**
 * Author：autism on 2017/4/1 11:26
 * Used:GlobalTv base fragment
 */
public abstract class BaseFra<T extends IPresenter> extends Fragment implements SpringView.OnFreshListener {
    protected static final String TAG = BaseFra.class.getSimpleName();

    protected ImageView mTvTitleLeft;
    protected ImageView mTvTitleRight;
    protected View mViewDivider;
    protected View mViewTitleRight;
    protected T mPresenter;
    private TextView mTitle;

    protected SpringView mRefresh;

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
        mRefresh = (SpringView) mView.findViewById(R.id.refresh_sp);
        if (null != mRefresh) {
            mRefresh.setListener(this);
            mRefresh.setType(SpringView.Type.FOLLOW);
            mRefresh.setHeader(new MeituanHeader(getActivity()));
            mRefresh.setFooter(new MeituanFooter(getActivity()));
        }
    }

    protected abstract int getReLayoutFraID();

    /**
     * 初始化标题
     *
     * @param mView
     */
    protected void initTitle(View mView) {
        View mTitleLayout = mView.findViewById(R.id.title_layout);
        if (null == mTitleLayout) return;
        measure(mTitleLayout, 0, 168);
        mTvTitleLeft = (ImageView) mView.findViewById(R.id.left_img);
        mTitle = (TextView) mView.findViewById(R.id.title_txt);
        mTvTitleRight = (ImageView) mView.findViewById(R.id.right_img);
        mViewDivider = mView.findViewById(R.id.title_divider);
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
            measure(mTvTitleLeft, 150, 75);
        }
        if (null != listener & null != mTvTitleLeft) {
            mTvTitleLeft.setOnClickListener(listener);
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

    @Override
    public void onRefresh() {

    }

    @Override
    public void onLoadmore() {

    }
}
