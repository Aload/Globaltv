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
public class RecomRecyclerAdapter extends RecyclerView.Adapter<RecomRecyclerHolder> {

    private HomeEntity mBeanList;

    @Override
    public RecomRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecomRecyclerHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecomRecyclerHolder holder, int position) {
        List<HomeEntity.RoomBean> room = mBeanList.getRoom();
        holder.setData(room.get(position));
    }

    @Override
    public int getItemCount() {
        return null == mBeanList ? 0 : mBeanList.getRoom().size();
    }

    /**
     * 刷新Ui
     *
     * @param mData
     */
    public void notifyUi(HomeEntity mData) {
        if (null == mData) {
            return;
        }
        this.mBeanList = mData;
        notifyDataSetChanged();
    }
}
