package com.autism.globaltv.home.model.api;

import com.google.gson.JsonObject;

import org.json.JSONObject;

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
    @GET("json/page/app-data/info.json?v=2.2.4&os=1&ver=4")
    Observable<JsonObject> getAppStartInfo();
}
