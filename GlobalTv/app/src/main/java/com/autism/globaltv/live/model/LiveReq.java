package com.autism.globaltv.live.model;

import com.autism.baselibs.http.RetrofitManager;
import com.autism.baselibs.http.rx.RxUtil;
import com.autism.globaltv.column.model.ColumnEntity;
import com.autism.globaltv.column.model.api.ColumnApi;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Retrofit;
import rx.Subscriber;

/**
 * Author：Autism on 2017/4/1 17:33
 * Used:GlobalTv
 */
public class LiveReq {
    private static LiveReq INSTANCE;
    private PlayerApi mHomeApi;

    public static LiveReq getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new LiveReq();
        }
        return INSTANCE;
    }

    private LiveReq() {
        Retrofit retrofit = RetrofitManager.getRetrofit();
        mHomeApi = retrofit.create(PlayerApi.class);
    }

    /**
     * column数据
     *
     * @param subscriber
     */
    public void getLiveData(Subscriber<JsonObject> subscriber) {
        mHomeApi.getPlayJson("json/play/list.json")
                .compose(RxUtil.<JsonObject>ioMain())
                .subscribe(subscriber);
    }
}
