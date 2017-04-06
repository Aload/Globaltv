package com.autism.globaltv.live.pre;

import android.app.Activity;

import com.autism.baselibs.http.rx.RxSubscriber;
import com.autism.globaltv.base.BasePresenter;
import com.autism.globaltv.live.model.LiveEntity;
import com.autism.globaltv.live.model.LiveReq;
import com.autism.globaltv.live.view.LiveView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import rx.Subscriber;

/**
 * Author：i5 on 2017/4/1 16:00
 * Used:GlobalTv
 */
public class PlayerPre extends BasePresenter<LiveView> {
    public PlayerPre(Activity activity, LiveView view) {
        super(activity, view);
    }

    @Override
    public void attachView() {
        Subscriber<JsonObject> subscriber = new RxSubscriber<JsonObject>(mActivity) {
            @Override
            public void _onNext(JsonObject columnEntities) {
                Gson mGson = new Gson();
                LiveEntity liveEntity = mGson.fromJson(columnEntities, LiveEntity.class);
                mView.onSuccessLive(liveEntity);
            }

            @Override
            public void _onError(String code) {
                mView.onFailed(code);
            }
        };
        LiveReq.getInstance().getLiveData(subscriber);
        addSubscrebe(subscriber);
    }

    @Override
    public void unAttachView() {

    }
}
