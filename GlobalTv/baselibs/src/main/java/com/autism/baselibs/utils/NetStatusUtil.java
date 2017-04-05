package com.autism.baselibs.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * @author autism
 */
public class NetStatusUtil {

    /**
     * 判断手机是否联网
     *
     * @param context
     * @return
     */
    public static boolean isConnectToNet(Context context) {
        if (context == null) { //如果context为空则放弃判断
            return true;
        }
        ConnectivityManager cwjManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netWorkInfo = cwjManager.getActiveNetworkInfo();
        if (netWorkInfo == null) {
            return false;
        }

        return netWorkInfo.isConnected();
    }

    /**
     * 判断手机是否wifi联网
     *
     * @param context
     * @return
     */
    public static boolean isWifiNet(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {
            return false;
        }

        NetworkInfo[] info = connectivity.getAllNetworkInfo();
        if (info == null) {
            return false;
        }

        for (int i = 0; i < info.length; i++) {
            if (info[i].getTypeName().equals("WIFI") && info[i].isConnected()) {
                return true;
            }
        }
        return false;
    }
}
