package com.autism.globaltv.home.view;

import com.autism.globaltv.base.IView;
import com.autism.globaltv.home.model.NormalEntity;

import java.util.List;

/**
 * Author：i5 on 2017/5/10 15:53
 * Used:GlobalTv
 */
public interface HomeView extends IView {
    void getHomeData(List<NormalEntity> mList);

    void getErrorData(String msg);
}
