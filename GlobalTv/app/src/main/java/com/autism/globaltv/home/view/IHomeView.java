package com.autism.globaltv.home.view;

import com.autism.globaltv.base.IView;
import com.autism.globaltv.home.model.HomeEntity;

/**
 * Author：i5 on 2017/4/1 17:39
 * Used:GlobalTv
 */
public interface IHomeView extends IView {
    void onSuccess(HomeEntity mBean);

    void onError();
}
