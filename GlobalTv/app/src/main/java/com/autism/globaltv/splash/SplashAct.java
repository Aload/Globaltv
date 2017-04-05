package com.autism.globaltv.splash;

import android.os.Build;
import android.view.View;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseAct;
import com.autism.globaltv.base.BaseInfoManager;
import com.autism.globaltv.base.IPresenter;
import com.autism.globaltv.base.ViewUtils;
import com.autism.globaltv.home.HomeAct;

/**
 * Author：autism on 2017/4/1 13:25
 * Used:GlobalTv 欢迎界面
 */
public class SplashAct extends BaseAct<IPresenter> implements Runnable {
    @Override
    protected IPresenter getPresenter() {
        return null;
    }

    @Override
    protected void onInitViews() {
        BaseInfoManager.getInstance().getMainHandler().postDelayed(this, 2000);
    }

    @Override
    protected int getRelayoutID() {
        return R.layout.splash_act;
    }

    @Override
    public void run() {
        ViewUtils.intentLefttoRight(this, HomeAct.class);
    }

    //沉浸式控制title
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && Build.VERSION.SDK_INT >= 19) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }
}
