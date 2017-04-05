package com.autism.baselibs.utils;

import android.util.Log;

/**
 * @author autism
 */
public class LogUtil {

    private static final boolean DEBUG = true;

    public static boolean isDebug() {
        return DEBUG;
    }

    public static void d(String tag, String msg) {
        if (DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void d(String tag, String msg, Object... args) {
        if (DEBUG) {
            Log.d(tag, String.format(msg, args));
        }
    }

    public static void i(String tag, String msg) {
        if (DEBUG) {
            Log.i(tag, msg);
        }
    }

    public static void e(String tag, String msg, Object... args) {
        if (DEBUG) {
            Log.e(tag, String.format(msg, args));
        }
    }
}
