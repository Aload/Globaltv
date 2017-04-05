package com.autism.globaltv.home.view;

import com.autism.globaltv.base.IView;
import com.autism.globaltv.home.model.HomeEntity;

import org.json.JSONObject;

import java.util.List;

/**
 * Author：i5 on 2017/4/1 17:39
 * Used:GlobalTv
 */
public interface IHomeView extends IView {
    void onSuccess(List<HomeEntity.RoomBean> mBean);

    void onError();
}
