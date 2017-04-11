package com.autism.globaltv.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.autism.globaltv.R;


/**
 * Author：autism on 2017/4/1 15:10
 * Used:GlobalTv
 */
public class ViewUtils {

    public static void intentLefttoRight(Activity mActivity, Class mClazz) {
        Intent mIntent = new Intent(mActivity, mClazz);
        mActivity.startActivity(mIntent);
        right2LeftIn(mActivity);
    }

    /**
     * 携带String参数跳转
     *
     * @param mActivity
     * @param mClazz
     * @param key
     * @param uid
     */
    public static void intentLefttoRightBundleInteger(Activity mActivity, Class mClazz, String key, String uid) {
        Intent mIntent = new Intent(mActivity, mClazz);
        mIntent.putExtra(key, uid);
        mActivity.startActivity(mIntent);
        right2LeftIn(mActivity);
    }

    /**
     * 携带bundle
     *
     * @param mActivity
     * @param mClazz
     * @param key
     * @param mBundle
     */
    public static void intentLefttoRightBundle(Activity mActivity, Class mClazz, String key, Bundle mBundle) {
        Intent mIntent = new Intent(mActivity, mClazz);
        mIntent.putExtra(key, mBundle);
        mActivity.startActivity(mIntent);
        right2LeftIn(mActivity);
    }

    public static void right2LeftIn(Activity activity) {
        if (null == activity) {
            return;
        }
        activity.overridePendingTransition(R.anim.slide_in_from_right, R.anim.no_anim);
    }

    public static void left2RightOut(Activity activity) {
        if (null == activity) {
            return;
        }
        activity.overridePendingTransition(R.anim.no_anim, R.anim.slide_out_to_right);
    }
}
