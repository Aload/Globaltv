package com.autism.globaltv.base;

import android.app.Activity;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public abstract class BasePresenter<T extends IView> implements IPresenter {


    protected static String TAG = BasePresenter.class.getName();

    protected Activity mActivity;
    protected T mView;
    private CompositeSubscription mCompositeSubscription;

    public BasePresenter(Activity activity, T view) {
        TAG = getClass().getSimpleName();
        this.mActivity = activity;
        this.mView = view;
    }

    private void unSubscribe() {
        if (mCompositeSubscription != null) {
            mCompositeSubscription.unsubscribe();
        }
    }

    protected void addSubscrebe(Subscription subscription) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(subscription);
    }

    @Override
    public void unAttachView() {
        unSubscribe();
    }
}