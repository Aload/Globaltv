package com.autism.globaltv.home.view;

import com.autism.globaltv.base.IView;
import com.autism.globaltv.home.model.NormalEntity;
import com.autism.globaltv.home.model.api.LiveListEntity;

import java.util.List;

/**
 * Author：i5 on 2017/5/10 14:53
 * Used:GlobalTv
 */
public interface NormalView extends IView {

    void getNormalList(LiveListEntity mList);

    void getNormalError(String msg);
}
