package com.autism.globaltv.home.pre;

import android.app.Activity;

import com.autism.baselibs.http.rx.ResultBean;
import com.autism.baselibs.http.rx.RxSubscriber;
import com.autism.globaltv.base.BasePresenter;
import com.autism.globaltv.home.model.HomeEntity;
import com.autism.globaltv.home.model.api.HomeReq;
import com.autism.globaltv.home.view.IHomeView;

import rx.Subscriber;


/**
 * Author：i5 on 2017/4/1 15:58
 * Used:GlobalTv
 */
public class HomePre extends BasePresenter<IHomeView> {

    public HomePre(Activity activity, IHomeView view) {
        super(activity, view);
    }

    @Override
    public void attachView() {
        Subscriber<ResultBean<HomeEntity>> subscriber = new RxSubscriber<HomeEntity>(mActivity) {
            @Override
            public void _onNext(HomeEntity homeBean) {
                mView.onSuccess(homeBean);
            }

            @Override
            public void _onError(int code) {
                mView.onError();
            }
        };
        HomeReq.getInstance().getHomeData(subscriber);
        addSubscrebe(subscriber);
    }

    @Override
    public void unAttachView() {
        super.unAttachView();
    }
}
