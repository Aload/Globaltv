package com.autism.globaltv.live.view;

import com.autism.globaltv.base.IView;
import com.autism.globaltv.live.model.LiveEntity;

/**
 * Author：i5 on 2017/4/6 15:04
 * Used:GlobalTv
 */
public interface LiveView extends IView {
    void onSuccessLive(LiveEntity mLive);

    void onFailed(String msg);
}
