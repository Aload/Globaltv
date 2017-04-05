package com.autism.baselibs.http.rx;

import android.app.Activity;

import com.autism.baselibs.utils.LogUtil;

import rx.Subscriber;

/**
 * 封装Subscriber
 */
public class RxSubscriber<T> extends Subscriber<ResultBean<T>> {

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
        _onError(ResultBean.RESULT_CODE_NET_ERROR, null);
        LogUtil.d(getClass().getName(), "RxSubscriber异常：" + e.toString());
        e.printStackTrace();
    }

    @Override
    public void onNext(ResultBean<T> t) {
        switch (t.getCode()) {
            case ResultBean.RESULT_CODE_OTHER_LOGIN:
                //402传递到处理层，不要做任何处理，只是关闭加载动画而已
                _onError(t.getCode(), t.getData());//重载一种方法
                break;
            case ResultBean.RESULT_CODE_NO_LOGIN:
                //403传递到处理层，不要做任何处理，只是关闭加载动画而已
                _onError(t.getCode(), t.getData());//重载一种方法
                break;
            case ResultBean.RESULT_CODE_SERVER_ERROR:
                //服务器内部错误也做网络错误处理
                _onError(ResultBean.RESULT_CODE_NET_ERROR, t.getData());//重载一种方法
                break;
            case ResultBean.RESULT_CODE_SUCCESS:
                _onNext(t.getData());
                break;
            default:
                _onError(t.getCode(), t.getData());//重载一种方法
                break;
        }
    }

    public void _onNext(T t) {

    }

    public void _onError(int code, T t) {
        _onError(code);
    }

    public void _onError(int code) {

    }

}