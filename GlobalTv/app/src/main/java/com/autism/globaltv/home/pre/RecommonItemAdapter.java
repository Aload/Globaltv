package com.autism.globaltv.home.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseRecyclerHolder;
import com.autism.globaltv.home.model.HomeEntity;
import com.autism.globaltv.home.view.RecommonItemHolder;

import java.util.List;

/**
 * Author：i5 on 2017/4/5 15:37
 * Used:GlobalTv
 */
public class RecommonItemAdapter extends RecyclerView.Adapter<BaseRecyclerHolder<HomeEntity.RoomBean.ListBean>> {
    private List<HomeEntity.RoomBean.ListBean> mListData;

    @Override
    public BaseRecyclerHolder<HomeEntity.RoomBean.ListBean> onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecommonItemHolder(parent, R.layout.recommon_child_item);
    }

    @Override
    public void onBindViewHolder(BaseRecyclerHolder<HomeEntity.RoomBean.ListBean> holder, int position) {
        holder.setData(mListData.get(position));
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
