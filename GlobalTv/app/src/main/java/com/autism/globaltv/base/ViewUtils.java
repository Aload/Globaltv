package com.autism.globaltv.base;

import android.app.Activity;
import android.content.Intent;

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

    private static void right2LeftIn(Activity activity) {
        if (null == activity) {
            return;
        }
        activity.overridePendingTransition(R.anim.slide_in_from_right, R.anim.no_anim);
    }

    private static void left2RightOut(Activity activity) {
        if (null == activity) {
            return;
        }
        activity.overridePendingTransition(R.anim.no_anim, R.anim.slide_out_to_right);
    }
}
