package com.autism.globaltv.live.pre;

import android.app.Activity;

import com.autism.baselibs.http.rx.RxSubscriber;
import com.autism.globaltv.base.BasePresenter;
import com.autism.globaltv.live.model.LiveDetailEntity;
import com.autism.globaltv.live.model.LiveReq;
import com.autism.globaltv.live.view.LivePlayerView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import rx.Subscriber;

/**
 * Author：i5 on 2017/4/10 11:00
 * Used:GlobalTv
 */
public class LivePre extends BasePresenter<LivePlayerView> {
    private String mUid;

    public LivePre(Activity activity, LivePlayerView view, String Uid) {
        super(activity, view);
        this.mUid = Uid;
    }

    @Override
    public void attachView() {
        Subscriber<JsonObject> subscriber = new RxSubscriber<JsonObject>(mActivity) {
            @Override
            public void _onNext(JsonObject jsonObject) {
                super._onNext(jsonObject);
                Gson gson = new Gson();
                LiveDetailEntity liveDetailEntity = gson.fromJson(jsonObject, LiveDetailEntity.class);
                mView.onEnterSuccess(liveDetailEntity);
            }

            @Override
            public void _onError(int code) {
                super._onError(code);
                mView.onEnterFailed("数据异常");
            }
        };
        LiveReq.getInstance().getLiveDetailData(subscriber, mUid);
        addSubscrebe(subscriber);
    }
}
