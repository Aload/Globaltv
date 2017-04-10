package com.autism.globaltv.live.view;

import com.autism.globaltv.live.model.LiveEntity;

/**
 * Author：i5 on 2017/4/10 18:21
 * Used:GlobalTv
 */
public interface IOnItemClickListener {
    void itemClick(int position, LiveEntity.DataBeanX mData);
}
