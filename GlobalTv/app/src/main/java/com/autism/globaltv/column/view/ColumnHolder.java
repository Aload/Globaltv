package com.autism.globaltv.column.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.baselibs.view.glide.GlideUtils;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseRecyclerHolder;
import com.autism.globaltv.column.model.ColumnEntity;

/**
 * Author：i5 on 2017/4/6 13:34
 * Used:GlobalTv
 */
public class ColumnHolder extends BaseRecyclerHolder<ColumnEntity> implements View.OnClickListener {
    private ImageView mImage;
    private TextView mText;
    private IOnColumnClick mOnClick;
    private ColumnEntity mColumnClickData;

    public ColumnHolder(ViewGroup parent, int res) {
        super(parent, res);
        View mLayout = $(R.id.item_layout);
        mImage = $(R.id.img_item);
        mText = $(R.id.tv_text);
        measure(mImage, 350, 450);
        measure(mLayout, 350, 450);
        itemView.setOnClickListener(this);
    }

    @Override
    public void setData(ColumnEntity mData) {
        this.mColumnClickData=mData;
        GlideUtils.loadUriNetImg(getContext(), mData.getThumb(), mImage, R.mipmap.ic_default_cover);
        mText.setText(mData.getName());
    }

    @Override
    public void onClick(View v) {
            mOnClick.onItemClick(mColumnClickData);
    }

    public void setItemClick(IOnColumnClick itemClick){
        this.mOnClick=itemClick;
    }
}
