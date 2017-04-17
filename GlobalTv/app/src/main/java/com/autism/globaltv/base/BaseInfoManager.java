package com.autism.globaltv.base;

import android.content.Context;
import android.os.Handler;

import com.autism.globaltv.live.view.LiveKit;
import com.autism.logiclibs.LogicApp;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;

/**
 * 基础信息管理, 需要application中调用{@link #init(Context)}方法
 *
 * @author autism
 */
public class BaseInfoManager extends RongIMClient.ConnectCallback {
    private Context mContext;
    private Handler mMainHandler;
    private String mToken;
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

    public String getChatToken() {
        return mToken;
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
        LiveKit.init(mContext, "vnroth0kvfozo");
        LiveKit.connect(getChatToken(), this);
    }

    @Override
    public void onTokenIncorrect() {

    }

    @Override
    public void onSuccess(String s) {
        mToken = s;
    }

    @Override
    public void onError(RongIMClient.ErrorCode errorCode) {

    }
}
