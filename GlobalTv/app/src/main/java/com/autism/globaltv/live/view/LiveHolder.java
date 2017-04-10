package com.autism.globaltv.live.view;

import android.view.View;
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
public class LiveHolder extends BaseRecyclerHolder<LiveEntity.DataBeanX> implements View.OnClickListener {
    private ImageView mImage, mLiveHeader;
    private TextView mNum, mLiveName, mLiveContent;
    private IOnItemClickListener mClick;
    private LiveEntity.DataBeanX mListItemData;

    public LiveHolder(ViewGroup parent, int res) {
        super(parent, res);
        mImage = $(R.id.live_img);
        mNum = $(R.id.live_num);
        View mContain = $(R.id.live_item_content);
        measure(mContain, 500, 250);
        mLiveHeader = $(R.id.img_header);
        mLiveName = $(R.id.liver_name);
        mLiveContent = $(R.id.liver_content);
        measure(mImage, 500, 250);
        measure(mLiveHeader, 92, 92);
        itemView.setOnClickListener(this);
    }

    @Override
    public void setData(LiveEntity.DataBeanX mData) {
        this.mListItemData = mData;
        GlideUtils.loadRoundNetImg(getContext(), mData.getThumb(), mImage, R.mipmap.ic_default_cover);
        GlideUtils.loadCirleImg(getContext(), mData.getAvatar(), mLiveHeader, R.mipmap.ic_default_head);
        mNum.setText(mData.getView());
        mLiveName.setText(mData.getNick());
        mLiveContent.setText(mData.getTitle());
    }

    @Override
    public void onClick(View v) {
        mClick.itemClick(getAdapterPosition(), mListItemData);
    }

    public void setOnItemClick(IOnItemClickListener onItemClick) {
        this.mClick = onItemClick;
    }
}
