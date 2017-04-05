package com.autism.globaltv.home.pre;

import android.content.Context;
import android.view.View;

import com.autism.globaltv.base.BasePagerHolder;
import com.autism.globaltv.home.model.HomeEntity;

/**
 * Author：i5 on 2017/4/5 14:18
 * Used:GlobalTv
 */
class CommonHolder extends BasePagerHolder<HomeEntity.RoomBean> {
    public CommonHolder(View mView, Context mContext) {
        super(mView, mContext);
    }

    @Override
    public void onInitView(View mView) {

    }

    @Override
    public void setData(HomeEntity.RoomBean mData) {
        super.setData(mData);
    }
}
