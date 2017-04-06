package com.autism.globaltv.home.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.globaltv.base.BaseRecyclerHolder;
import com.autism.globaltv.home.model.HomeEntity;
import com.autism.globaltv.home.view.RecomRecyclerHolder;

import java.util.List;

/**
 * Author：i5 on 2017/4/5 14:42
 * Used:GlobalTv
 */
public class RecomRecyclerAdapter extends RecyclerView.Adapter<BaseRecyclerHolder<HomeEntity.RoomBean>> {

    private List<HomeEntity.RoomBean> mBeanList;

    public RecomRecyclerAdapter(List<HomeEntity.RoomBean> mBeanList) {
        this.mBeanList = mBeanList;
    }

    @Override
    public BaseRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecomRecyclerHolder recomRecyclerHolder = new RecomRecyclerHolder(parent);
        return recomRecyclerHolder;
    }

    @Override
    public void onBindViewHolder(BaseRecyclerHolder holder, int position) {
        holder.setData(mBeanList.get(position));
    }

    @Override
    public int getItemCount() {
        return null == mBeanList ? 0 : mBeanList.size();
    }

    /**
     * 刷新Ui
     *
     * @param mData
     */
    public void notifyUi(List<HomeEntity.RoomBean> mData) {
        if (null == mData && mData.isEmpty()) {
            return;
        }
        this.mBeanList = mData;
        notifyDataSetChanged();
    }
}
