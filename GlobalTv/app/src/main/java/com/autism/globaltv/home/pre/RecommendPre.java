package com.autism.globaltv.home.pre;

import android.app.Activity;

import com.autism.baselibs.http.rx.RxSubscriber;
import com.autism.globaltv.base.BasePresenter;
import com.autism.globaltv.home.model.HomeEntity;
import com.autism.globaltv.home.model.api.HomeReq;
import com.autism.globaltv.home.view.RecommendView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import rx.Subscriber;

/**
 * Author：i5 on 2017/4/7 14:52
 * Used:GlobalTv
 */
public class RecommendPre extends BasePresenter<RecommendView> {
    public RecommendPre(Activity activity, RecommendView view) {
        super(activity, view);
    }

    @Override
    public void attachView() {
//        onBannerData();
        Subscriber<JsonObject> subscriber = new RxSubscriber<JsonObject>(mActivity) {

            @Override
            public void _onNext(JsonObject mjson) {
                super._onNext(mjson);
                Gson mGson = new Gson();
                HomeEntity homeEntity = mGson.fromJson(mjson, HomeEntity.class);
                mView.onRecommonSuccess(homeEntity);
            }

            @Override
            public void _onError(int code) {
                super._onError(code);
                mView.onRecommonFailed("异常数据");
            }
        };
        HomeReq.getInstance().getRecommonData(subscriber);
        addSubscrebe(subscriber);
    }

    private void onBannerData() {
//        Subscriber<ResultBean<BannerEntity>> subscriber = new RxSubscriber<BannerEntity>(mActivity) {
//
//            @Override
//            public void _onNext(BannerEntity homeEntities) {
//                super._onNext(homeEntities);
//                mView.onBannerSuccess(homeEntities);
//            }
//
//            @Override
//            public void _onError(int code) {
//                super._onError(code);
//                mView.onRecommonFailed("异常数据");
//            }
//        };
//        HomeReq.getInstance().getBannerData(subscriber);
//        addSubscrebe(subscriber);
    }
}
