package com.autism.globaltv.home.model.api;

import com.autism.globaltv.home.model.BannerEntity;
import com.autism.globaltv.home.model.HomeEntity;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Author：Autism on 2017/4/1 17:41
 * Used:GlobalTv home api server
 */
public interface HomeApi {

    @GET("json/app/index/recommend/list-android.json?11241742&v=2.2.4&os=1&ver=4")
    Observable<JsonObject> getRecommendCategories();

    //banner
    @GET("?method=slider.cate&cate=index&__version=3.0.4.3142&__plat=android&__channel=yingyongbao")
    Observable<BannerEntity> getAppStartInfo();
}
