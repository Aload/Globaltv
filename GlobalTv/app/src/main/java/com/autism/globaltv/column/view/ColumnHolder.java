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
public class ColumnHolder extends BaseRecyclerHolder<ColumnEntity> {
    private ImageView mImage;
    private TextView mText;

    public ColumnHolder(ViewGroup parent, int res) {
        super(parent, res);
        View mLayout = $(R.id.item_layout);
        mImage = $(R.id.img_item);
        mText = $(R.id.tv_text);
        measure(mLayout, 150, 200);
        measure(mImage, 150, 200);
    }

    @Override
    public void setData(ColumnEntity mData) {
        GlideUtils.loadUriNetImg(getContext(), mData.getThumb(), mImage);
        mText.setText(mData.getName());
    }
}
