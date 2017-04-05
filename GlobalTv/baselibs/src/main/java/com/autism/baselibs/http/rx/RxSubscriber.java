package com.autism.baselibs.http.rx;

import android.app.Activity;

import com.autism.baselibs.utils.LogUtil;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import rx.Subscriber;

/**
 * 封装Subscriber
 */
public class RxSubscriber extends Subscriber<JsonObject> {

    private Activity mActivity;

    public RxSubscriber(Activity activity) {
        super();
        mActivity = activity;
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        LogUtil.d(getClass().getName(), "RxSubscriber异常：" + e.toString());
        e.printStackTrace();
    }

    @Override
    public void onNext(JsonObject t) {
        if (null == t) {
            _onError("数据异常");
        }else _onNext(t.toString());
    }

    public void _onNext(String t) {

    }
    public void _onError(String t) {

    }

}