package com.autism.globaltv.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.autism.baselibs.EventBusLogicUtils;
import com.autism.logiclibs.UiUtils;

/**
 * Author：autism on 2017/4/1 11:26
 * Used:GlobalTv base fragment
 */
public abstract class BaseFra<T extends IPresenter> extends Fragment {
    protected T mPresenter;
    protected static final String TAG=BaseFra.class.getSimpleName();

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

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBusLogicUtils.unRegisterBus(this);
    }
}
