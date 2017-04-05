package com.autism.baselibs;

import android.content.Context;

/**
 * Author：autism on 2017/4/1 13:45
 * Used:GlobalTv
 */
public class AsynBase {
    private static Context mContext;

    public static void initAsynContext(Context mContext) {
        AsynBase.mContext = mContext;
    }

    /**
     * 获取全局的context
     *
     * @return
     */
    public static Context getAsynContext() {
        return mContext;
    }
}
