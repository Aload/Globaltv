package com.autism.globaltv.home.model.api;

import com.autism.globaltv.home.model.NormalEntity;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Author：Autism on 2017/4/1 17:41
 * Used:GlobalTv home api server
 */
public interface HomeApi {

    @GET("json/app/index/recommend/list-android.json?v=3.0.1&os=1&ver=4")
    Observable<JsonObject> getRecommendCategories();

    /**
     * 获取分类列表
     *
     * @return categories/list.json
     */
    @GET("json/app/index/category/info-android.json?v=3.0.1&os=1&ver=4")
    Observable<List<NormalEntity>> getAllCategories();

    /**
     * 获取推荐列表
     *
     * @return
     */
    //banner
    @GET("json/page/app-data/info.json?v=3.0.1&os=1&ver=4")
    Observable<JsonObject> getAppStartInfo();

    @GET("json/app/index/category/info-android.json?v=3.0.1&os=1&ver=4")
    Observable<List<NormalEntity>> getNormalList();

    /**
     * 获取直播列表
     *
     * @return
     */
    @GET("json/play/list.json?v=3.0.1&os=1&ver=4")
    Observable<LiveListEntity> getLiveListResult();


    @GET("json/categories/{slug}/list.json?v=3.0.1&os=1&ver=4")
    Observable<LiveListEntity> getLiveListResultByCategories(@Path("slug") String slug);
}
