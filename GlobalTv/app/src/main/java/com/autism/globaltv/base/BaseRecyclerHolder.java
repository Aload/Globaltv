package com.autism.globaltv.base;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.autism.logiclibs.UiUtils;

/**
 * Author：autism on 2017/4/5 14:37
 * Used:GlobalTv
 */
public abstract class BaseRecyclerHolder<M> extends RecyclerView.ViewHolder {

    public BaseRecyclerHolder(ViewGroup parent, int res) {
        super(LayoutInflater.from(parent.getContext()).inflate(res, parent, false));
    }

    public abstract void setData(M mData);

    protected <T extends View> T $(@IdRes int id) {
        return (T) itemView.findViewById(id);
    }

    protected Context getContext() {
        return itemView.getContext();
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
