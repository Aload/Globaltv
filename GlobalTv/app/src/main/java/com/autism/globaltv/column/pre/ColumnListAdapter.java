package com.autism.globaltv.column.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.globaltv.R;
import com.autism.globaltv.column.model.ColumnListEntity;
import com.autism.globaltv.column.view.ColumnListHolder;
import com.autism.globaltv.column.view.OnItemColumnListener;

import java.util.List;

/**
 * Author：i5 on 2017/4/11 15:06
 * Used:GlobalTv
 */
public class ColumnListAdapter extends RecyclerView.Adapter<ColumnListHolder> {
    private List<ColumnListEntity.DataBean> mList;
    private OnItemColumnListener mOnItemColumnListener;

    @Override
    public ColumnListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ColumnListHolder(parent, R.layout.live_item);
    }

    @Override
    public void onBindViewHolder(ColumnListHolder holder, int position) {
        holder.setData(mList.get(position));
        holder.setOnTypeClick(mOnItemColumnListener);
    }

    /**
     * 设置recycleView item点击事件
     *
     * @param onItemColumnListener
     */
    public void setOnTypeClick(OnItemColumnListener onItemColumnListener) {
        this.mOnItemColumnListener = onItemColumnListener;
    }

    @Override
    public int getItemCount() {
        return null == mList ? 0 : mList.size();
    }

    /**
     * 刷新界面UI
     *
     * @param mData
     */
    public void notifyUi(List<ColumnListEntity.DataBean> mData) {
        if (null == mData && mData.isEmpty()) return;
        this.mList = mData;
        notifyDataSetChanged();
    }
}
