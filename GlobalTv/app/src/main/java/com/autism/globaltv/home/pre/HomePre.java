package com.autism.globaltv.home.pre;

import android.app.Activity;

import com.autism.baselibs.http.rx.RxSubscriber;
import com.autism.globaltv.base.BasePresenter;
import com.autism.globaltv.home.model.NormalEntity;
import com.autism.globaltv.home.model.api.HomeReq;
import com.autism.globaltv.home.view.HomeView;

import java.util.List;

import rx.Subscriber;

/**
 * Author：autism on 2017/5/10 15:52
 * Used:GlobalTv
 */
public class HomePre extends BasePresenter<HomeView> {
    public HomePre(Activity activity, HomeView view) {
        super(activity, view);
    }


    @Override
    public void attachView() {
        Subscriber<List<NormalEntity>> subscriber = new RxSubscriber<List<NormalEntity>>(mActivity) {
            @Override
            public void _onNext(List<NormalEntity> mjson) {
                super._onNext(mjson);
                mView.getHomeData(mjson);
            }

            @Override
            public void _onError(int code) {
                super._onError(code);
                mView.getErrorData("异常数据");
            }
        };
        HomeReq.getInstance().getNormalData(subscriber);
        addSubscrebe(subscriber);
    }
}
