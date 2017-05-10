package com.autism.globaltv.home.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.globaltv.R;
import com.autism.globaltv.home.model.api.LiveListEntity;
import com.autism.globaltv.home.view.NormalHolder;
import com.autism.globaltv.home.view.OnNormalOnclick;

/**
 * Author：autism on 2017/5/10 15:09
 * Used:GlobalTv
 */
public class NormalAdapter extends RecyclerView.Adapter<NormalHolder> {
    private LiveListEntity mListData;
    private OnNormalOnclick mItemClick;

    @Override
    public NormalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NormalHolder(parent, R.layout.recommon_child_item);
    }

    @Override
    public void onBindViewHolder(NormalHolder holder, int position) {
        holder.setData(mListData.getData().get(position));
        holder.setItemClick(mItemClick);
    }

    public void setItemClick(OnNormalOnclick itemClick) {
        this.mItemClick = itemClick;
    }

    @Override
    public int getItemCount() {
        return mListData == null ? 0 : mListData.getData().size();
    }

    /**
     * 刷新UI
     *
     * @param mListData
     */
    public void notifyUi(LiveListEntity mListData) {
        if (null == mListData) return;
        this.mListData = mListData;
        notifyDataSetChanged();
    }
}
