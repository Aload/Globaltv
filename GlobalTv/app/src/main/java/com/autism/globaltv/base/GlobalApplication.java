package com.autism.globaltv.base;

import android.app.Application;

/**
 * Author：autism on 2017/4/1 11:32
 * Used:GlobalTv
 */
public class GlobalApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BaseInfoManager.init(this);
    }
}
