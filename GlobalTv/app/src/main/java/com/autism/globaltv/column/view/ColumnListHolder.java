package com.autism.globaltv.column.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.baselibs.view.glide.GlideUtils;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseRecyclerHolder;
import com.autism.globaltv.column.model.ColumnListEntity;

/**
 * Author：i5 on 2017/4/11 15:07
 * Used:GlobalTv
 */
public class ColumnListHolder extends BaseRecyclerHolder<ColumnListEntity.DataBean> implements View.OnClickListener {

    private ImageView mImage, mLiveHeader;
    private TextView mNum, mLiveName, mLiveContent;
    private OnItemColumnListener mOnItemColumnListener;
    private ColumnListEntity.DataBean mListColumn;

    public ColumnListHolder(ViewGroup parent, int res) {
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

    /**
     * 设置item点击事件
     *
     * @param onItemColumnListener
     */
    public void setOnTypeClick(OnItemColumnListener onItemColumnListener) {
        this.mOnItemColumnListener = onItemColumnListener;
    }

    @Override
    public void setData(ColumnListEntity.DataBean mData) {
        this.mListColumn = mData;
        GlideUtils.loadRoundNetImg(getContext(), mData.getThumb(), mImage, R.mipmap.ic_default_cover);
        GlideUtils.loadCirleImg(getContext(), mData.getAvatar(), mLiveHeader, R.mipmap.ic_default_head);
        mNum.setText(mData.getView());
        mLiveName.setText(mData.getNick());
        mLiveContent.setText(mData.getTitle());
    }

    @Override
    public void onClick(View v) {
        mOnItemColumnListener.onClickItemType(mListColumn);
    }
}
