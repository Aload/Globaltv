package com.autism.globaltv.base;

import android.app.Application;
import android.os.StrictMode;

/**
 * Author：autism on 2017/4/1 11:32
 * Used:GlobalTv
 */
public class GlobalApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BaseInfoManager.init(this);
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build());

        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build());
    }
}
