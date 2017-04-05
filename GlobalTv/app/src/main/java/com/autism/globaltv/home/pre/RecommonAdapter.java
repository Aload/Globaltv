package com.autism.globaltv.home.pre;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BasePagerHolder;
import com.autism.globaltv.home.model.HomeEntity;

import java.util.List;

/**
 * Author：i5 on 2017/4/5 13:32
 * Used:GlobalTv
 */
public class RecommonAdapter extends PagerAdapter {
    private final Context mContext;
    private List<HomeEntity.RoomBean> mEntity;

    public RecommonAdapter(Context mContext, List<HomeEntity.RoomBean> mEntity) {
        this.mContext = mContext;
        this.mEntity = mEntity;
    }

    @Override
    public int getCount() {
        return null == mEntity ? 0 : mEntity.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View mView;
        BasePagerHolder mHolder;
        if (position == 0) {
            mView = LayoutInflater.from(mContext).inflate(R.layout.recommom_layout, container, false);
            mHolder = new RecommonHolder(mView, mContext);
            mHolder.setData(mEntity);
        } else {
            mView = LayoutInflater.from(mContext).inflate(R.layout.common_layout, container, false);
            mHolder = new CommonHolder(mView, mContext);
            mHolder.setData(mEntity.get(position));
        }
        container.addView(mView);
        return mView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mEntity == null ? "" : mEntity.get(position).getName();
    }

    /**
     * 刷新Ui
     *
     * @param mList
     */
    public void notifyUi(List<HomeEntity.RoomBean> mList) {
        if (null == mList) return;
        this.mEntity = mList;
        notifyDataSetChanged();
    }
}
