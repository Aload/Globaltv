package com.autism.globaltv.live.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.globaltv.R;
import com.autism.globaltv.live.model.LiveEntity;
import com.autism.globaltv.live.view.IOnItemClickListener;
import com.autism.globaltv.live.view.LiveHolder;

import java.util.List;

/**
 * Author：i5 on 2017/4/6 15:56
 * Used:GlobalTv
 */
public class LiveAdapter extends RecyclerView.Adapter<LiveHolder> {
    private List<LiveEntity.DataBeanX> mData;
    private IOnItemClickListener mOnItemClick;

    @Override
    public LiveHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LiveHolder(parent, R.layout.live_item);
    }

    @Override
    public void onBindViewHolder(LiveHolder holder, int position) {
        holder.setData(mData.get(position));
        holder.setOnItemClick(mOnItemClick);
    }

    @Override
    public int getItemCount() {
        return null == mData ? 0 : mData.size();
    }

    /**
     * 设置点击item点击事件
     *
     * @param onItemClick
     */
    public void setOnItemClick(IOnItemClickListener onItemClick) {
        this.mOnItemClick = onItemClick;
    }

    /**
     * 刷新UI
     *
     * @param mList
     */
    public void notifyUi(List<LiveEntity.DataBeanX> mList) {
        if (null == mList && mList.isEmpty()) return;
        this.mData = mList;
        notifyDataSetChanged();
    }
}
