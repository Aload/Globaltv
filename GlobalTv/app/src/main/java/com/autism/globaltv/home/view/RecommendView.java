package com.autism.globaltv.home.view;

import com.autism.globaltv.base.IView;
import com.autism.globaltv.home.model.BannerEntity;
import com.autism.globaltv.home.model.HomeEntity;

import java.util.List;

/**
 * Author：i5 on 2017/4/7 14:52
 * Used:GlobalTv
 */
public interface RecommendView extends IView {

    void onRecommonSuccess(HomeEntity mData);

    void onBannerSuccess(BannerEntity mDate);

    void onRecommonFailed(String msg);
}
