package com.autism.baselibs.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/**
 * Author：i5 on 2017/4/17 16:16
 * Used:GlobalTv
 */
public class ToastUtils {
    /**
     * 弹吐司
     *
     * @param mContext
     * @param msg
     */
    public static void showToast(final Context mContext, final String msg) {
        String name = Thread.currentThread().getName();
        if (name.equals("main")) {
            Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
        } else {
            Looper mainLooper = mContext.getMainLooper();
            new Handler(mainLooper).post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
