package com.autism.logiclibs;

import android.content.Context;

import com.autism.baselibs.AsynBase;

/**
 * Author：i5 on 2017/4/1 11:33
 * Used:GlobalTv
 */
public class LogicApp {
    private static LogicApp mLogic;
    private static Context mContext;

    static {
        mLogic = new LogicApp();
    }

    public static void initLogicContext(Context mContext) {
        LogicApp.mContext = mContext;
        AsynBase.initAsynContext(mContext);
    }

    /**
     * 获取全局的Context
     *
     * @return
     */
    public static Context getLogicContext() {
        return mContext;
    }
}
