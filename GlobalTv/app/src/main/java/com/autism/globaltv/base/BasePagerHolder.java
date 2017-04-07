package com.autism.globaltv.base;

import android.content.Context;
import android.view.View;

import com.autism.globaltv.home.model.BannerEntity;
import com.autism.logiclibs.UiUtils;

import java.util.List;

/**
 * Author：i5 on 2017/4/5 14:11
 * Used:GlobalTv
 */
public abstract class BasePagerHolder<T> {
    protected Context mContext;

    public BasePagerHolder(View mView, Context mContext) {
        this.mContext = mContext;
        onInitView(mView);
    }

    public abstract void onInitView(View mView);

    public void setData(T mData) {

    }

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
}
