package com.autism.globaltv.column.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseRecyclerHolder;
import com.autism.globaltv.column.model.ColumnEntity;
import com.autism.globaltv.column.view.ColumnHolder;

import java.util.List;

/**
 * Author：i5 on 2017/4/6 13:33
 * Used:GlobalTv
 */
public class ColumnAdapter extends RecyclerView.Adapter<ColumnHolder> {
    private List<ColumnEntity> mList;

    @Override
    public ColumnHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ColumnHolder(parent, R.layout.column_item);
    }

    @Override
    public void onBindViewHolder(ColumnHolder holder, int position) {
        holder.setData(mList.get(position));
    }


    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    /**
     * 刷新Ui
     *
     * @param mData
     */
    public void notifyUi(List<ColumnEntity> mData) {
        if (null == mData && mData.isEmpty()) return;
        this.mList = mData;
        notifyDataSetChanged();
    }
}
