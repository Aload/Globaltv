package com.autism.logiclibs;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/**
 * Author：autism on 2017/4/1 10:52
 * Used:GlobalTv Ui utils
 */
public class UiUtils {

    /**
     * 1080作為基准
     *
     * @param view   需要适配的view
     * @param width  高保真UI上的像素值，传0为不测量
     * @param height 高保真UI上的像素值，传0为不测量
     */
    public static void measure(View view, int width, int height) {
        if (0 != width) {
            setViewWidth(view, getScreenW() * width / 1080);
        }
        if (0 != height) {
            setViewHeight(view, getScreenW() * height / 1080);
        }
    }

    /**
     * 获取屏幕宽度
     *
     * @return 屏幕宽度
     */
    public static int getScreenW() {
        DisplayMetrics dm = Resources.getSystem().getDisplayMetrics();
        return dm.widthPixels;
    }

    /**
     * 设置view的高度
     *
     * @param view   指定的view
     * @param height 指定的高度，以像素为单位
     */
    public static void setViewHeight(View view, int height) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = height;
        view.setLayoutParams(params);
    }

    /**
     * 设置view的宽度
     *
     * @param view  指定的view
     * @param width 指定的宽度，以像素为单位
     */
    public static void setViewWidth(View view, int width) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.width = width;
        view.setLayoutParams(params);
    }
}
