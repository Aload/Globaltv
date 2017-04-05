package com.autism.globaltv.base;

import android.content.Context;
import android.view.View;

import com.autism.globaltv.home.model.BannerEntity;

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

    public void setData(T mData, List<BannerEntity.AppfocusBean> mBannerList) {

    }
}
