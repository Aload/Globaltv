package com.autism.globaltv.home.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseRecyclerHolder;
import com.autism.globaltv.home.model.HomeEntity;
import com.autism.globaltv.home.view.OnItemRecommonClickLisenter;
import com.autism.globaltv.home.view.RecommonItemHolder;

import java.util.List;

/**
 * Author：i5 on 2017/4/5 15:37
 * Used:GlobalTv
 */
public class RecommonItemAdapter extends RecyclerView.Adapter<RecommonItemHolder> {
    private List<HomeEntity.RoomBean.ListBean> mListData;
    private OnItemRecommonClickLisenter mOnItemRecommonClick;

    @Override
    public RecommonItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecommonItemHolder(parent, R.layout.recommon_child_item);
    }

    /**
     * 设置RecommonItemClick
     *
     * @param onItemRecommonClickLisenter
     */
    public void setRecommonClick(OnItemRecommonClickLisenter onItemRecommonClickLisenter) {
        this.mOnItemRecommonClick = onItemRecommonClickLisenter;
    }

    @Override
    public void onBindViewHolder(RecommonItemHolder holder, int position) {
        holder.setData(mListData.get(position));
        holder.setRecommonClick(mOnItemRecommonClick);
    }

    @Override
    public int getItemCount() {
        return null == mListData ? 0 : mListData.size();
    }

    /**
     * 刷新Ui
     *
     * @param mData
     */
    public void notifyItemUi(List<HomeEntity.RoomBean.ListBean> mData) {
        if (null == mData && mData.isEmpty()) {
            return;
        }
        this.mListData = mData;
        notifyDataSetChanged();
    }
}
