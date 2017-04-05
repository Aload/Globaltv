package com.autism.globaltv.home.model.api;

import com.autism.baselibs.http.RetrofitManager;
import com.autism.baselibs.http.rx.ResultBean;
import com.autism.baselibs.http.rx.RxUtil;
import com.autism.globaltv.home.model.HomeEntity;

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
     * 获取首页的数据
     *
     * @param subscriber
     */
    public void getHomeData(Subscriber<ResultBean<HomeEntity>> subscriber) {
        mHomeApi.getRecommendCategories()
                .compose(RxUtil.<ResultBean<HomeEntity>>ioMain())
                .subscribe(subscriber);
    }
}
