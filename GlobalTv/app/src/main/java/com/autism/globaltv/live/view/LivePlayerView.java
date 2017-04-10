package com.autism.globaltv.live.view;

import com.autism.globaltv.base.IView;
import com.autism.globaltv.live.model.LiveDetailEntity;

/**
 * Author：i5 on 2017/4/10 11:01
 * Used:GlobalTv
 */
public interface LivePlayerView extends IView {
    void onEnterSuccess(LiveDetailEntity mLiveData);

    void onEnterFailed(String msg);
}
