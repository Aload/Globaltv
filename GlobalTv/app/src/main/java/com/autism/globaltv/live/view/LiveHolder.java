package com.autism.globaltv.live.view;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.baselibs.view.glide.GlideUtils;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseRecyclerHolder;
import com.autism.globaltv.live.model.LiveEntity;

/**
 * Author：i5 on 2017/4/6 15:56
 * Used:GlobalTv
 */
public class LiveHolder extends BaseRecyclerHolder<LiveEntity.DataBeanX> {
    private ImageView mImage, mLiveHeader;
    private TextView mNum, mLiveName, mLiveContent;

    public LiveHolder(ViewGroup parent, int res) {
        super(parent, res);
        mImage = $(R.id.live_img);
        mNum = $(R.id.live_num);
        mLiveHeader = $(R.id.img_header);
        mLiveName = $(R.id.liver_name);
        mLiveContent = $(R.id.liver_content);
    }

    @Override
    public void setData(LiveEntity.DataBeanX mData) {
        GlideUtils.loadUriNetImg(getContext(), mData.getApp_shuffling_image(), mImage);
        GlideUtils.loadCirleImg(getContext(), mData.getAvatar(), mLiveHeader);
        mNum.setText(mData.getFollow());
        mLiveName.setText(mData.getNick());
        mLiveContent.setText(mData.getIntro());
    }
}
