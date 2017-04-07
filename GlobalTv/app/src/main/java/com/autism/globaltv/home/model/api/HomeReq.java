package com.autism.globaltv.home.model.api;

import com.autism.baselibs.http.RetrofitManager;
import com.autism.baselibs.http.rx.RxUtil;
import com.autism.globaltv.home.model.BannerEntity;
import com.autism.globaltv.home.model.HomeEntity;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Retrofit;
import rx.Subscriber;

/**
 * Author：Autism on 2017/4/1 17:33
 * Used:GlobalTv
 */
public class HomeReq {
    private static HomeReq INSTANCE;
    private HomeApi mHomeApi;

    public static HomeReq getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new HomeReq();
        }
        return INSTANCE;
    }

    private HomeReq() {
        Retrofit retrofit = RetrofitManager.getRetrofit();
        mHomeApi = retrofit.create(HomeApi.class);
    }

    /**
     * 获取首页的推荐数据
     *
     * @param subscriber
     */
    public void getRecommonData(Subscriber<JsonObject> subscriber) {
        mHomeApi.getRecommendCategories()
                .compose(RxUtil.<JsonObject>ioMain())
                .subscribe(subscriber);
    }

    /**
     * 获取banner数据
     *
     * @param subscriber
     */
    public void getBannerData(Subscriber<BannerEntity> subscriber) {
        mHomeApi.getAppStartInfo()
                .compose(RxUtil.<BannerEntity>ioMain())
                .subscribe(subscriber);
    }
}
