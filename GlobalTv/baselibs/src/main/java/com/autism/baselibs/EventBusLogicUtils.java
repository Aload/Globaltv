package com.autism.baselibs;

import org.greenrobot.eventbus.EventBus;

/**
 * Author：i5 on 2017/4/1 11:11
 * Used:GlobalTv
 */
public class EventBusLogicUtils {
    private static EventBus mDefaultBus;

    static {
        mDefaultBus = EventBus.getDefault();
    }

    /**
     * eventBus 注册
     *
     * @param mObj
     */
    public static void registerBus(Object mObj) {
        if (!mDefaultBus.isRegistered(mObj)) {
            mDefaultBus.isRegistered(mObj);
        }
    }

    /**
     * 解除注册
     *
     * @param mObj
     */
    public static void unRegisterBus(Object mObj) {
        if (mDefaultBus.isRegistered(mObj)) {
            mDefaultBus.unregister(mObj);
        }
    }

    /**
     * 参数传递
     *
     * @param mObj
     */
    public static void postEvent(Object mObj) {
        if (null != mDefaultBus) mDefaultBus.post(mObj);
    }
}
