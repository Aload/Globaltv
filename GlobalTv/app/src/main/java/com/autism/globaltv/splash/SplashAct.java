package com.autism.globaltv.splash;

import android.Manifest;
import android.os.Build;
import android.view.View;
import android.widget.Toast;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseAct;
import com.autism.globaltv.base.BaseInfoManager;
import com.autism.globaltv.base.IPresenter;
import com.autism.globaltv.base.ViewUtils;
import com.autism.globaltv.home.view.HomeAct;
import com.tbruyelle.rxpermissions.RxPermissions;

import rx.functions.Action1;

/**
 * Author：autism on 2017/4/1 13:25
 * Used:GlobalTv 欢迎界面
 */
public class SplashAct extends BaseAct<IPresenter> implements Runnable, View.OnClickListener {
    private View mImage;

    @Override
    protected IPresenter getPresenter() {
        return null;
    }

    @Override
    public void onInitViews() {
        mImage = findViewById(R.id.iv_splash);
        BaseInfoManager.getInstance().getMainHandler().postDelayed(this, 2000);
    }

    @Override
    protected int getRelayoutID() {
        return R.layout.splash_act;
    }

    @Override
    public void run() {
        RxPermissions.getInstance(this)
                .request(Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WAKE_LOCK).subscribe(new Action1<Boolean>() {
            @Override
            public void call(Boolean aBoolean) {
                if (aBoolean) {
                    ViewUtils.intentLefttoRight(SplashAct.this, HomeAct.class);
                    finish();
                } else {
                    mImage.setOnClickListener(SplashAct.this);
                    Toast.makeText(SplashAct.this, "亲,请授权后再使用!", Toast.LENGTH_LONG).show();
                }
            }
        });
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

    @Override
    public void onClick(View v) {
        RxPermissions.getInstance(this)
                .request(Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WAKE_LOCK).subscribe(new Action1<Boolean>() {
            @Override
            public void call(Boolean aBoolean) {
                if (aBoolean) {
                    ViewUtils.intentLefttoRight(SplashAct.this, HomeAct.class);
                    finish();
                } else {
                    Toast.makeText(SplashAct.this, "亲,请授权后再使用!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
