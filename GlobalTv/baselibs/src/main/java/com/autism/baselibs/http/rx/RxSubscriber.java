package com.autism.baselibs.http.rx;

import android.app.Activity;


import rx.Subscriber;

/**
 * 封装Subscriber
 */
public class RxSubscriber<T> extends Subscriber<T> {

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
        e.printStackTrace();
    }

    @Override
    public void onNext(T t) {
        if (t == null) {
            _onError(0);
        } else _onNext(t);
    }

    public void _onNext(T t) {

    }

    public void _onError(int code, T t) {
        _onError(code);
    }

    public void _onError(int code) {

    }

}