package com.autism.globaltv.base;

import android.content.Context;
import android.os.Handler;

import com.autism.logiclibs.LogicApp;

/**
 * 基础信息管理, 需要application中调用{@link #init(Context)}方法
 *
 * @author autism
 */
public class BaseInfoManager {
    private Context mContext;
    private Handler mMainHandler;

    private static BaseInfoManager sInstance;

    private BaseInfoManager(Context context) {
        mContext = context;
        mMainHandler = new Handler();
    }

    public static void init(Context context) {
        sInstance = new BaseInfoManager(context);
        sInstance.init();
    }

    public static BaseInfoManager getInstance() {
        return sInstance;
    }

    public Context getContext() {
        return mContext;
    }

    /**
     * 取得主线程Handler
     *
     * @return
     */
    public Handler getMainHandler() {
        return mMainHandler;
    }

    private void init() {
        LogicApp.initLogicContext(mContext);
    }
}
