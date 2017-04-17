package com.autism.baselibs.view.chat;

import com.autism.baselibs.AsynBase;

public class CommonUtil {

    public static int dip2px(float dpValue) {
        float scale = AsynBase.getAsynContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
