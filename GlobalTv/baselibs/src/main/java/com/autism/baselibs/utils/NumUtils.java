package com.autism.baselibs.utils;

import android.text.TextUtils;

/**
 * Author：i5 on 2017/4/17 18:34
 * Used:GlobalTv
 */
public class NumUtils {
    /**
     * 字符转换
     *
     * @param num
     * @return
     */
    public static String transFormNum(String num) {
        if (StringIsNull(num)) {
            return "";
        }
        int mNum = Integer.parseInt(num);
//        if (mNum % 10000 > 0) {
//            int abs = Math.abs(mNum / 10000);
//            String valueOf = String.valueOf(abs).substring(0, 3);
//            return new StringBuffer().append(valueOf).append("w").toString();
//        }
        return String.valueOf(mNum);
    }

    /**
     * 判断字符串是否为null
     *
     * @param msg
     * @return
     */
    public static boolean StringIsNull(String msg) {
        if (TextUtils.isEmpty(msg)) {
            return true;
        } else return false;
    }
}
