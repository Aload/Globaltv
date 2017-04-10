package com.autism.globaltv.live.model;

import com.google.gson.JsonObject;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Author：i5 on 2017/4/6 15:02
 * Used:GlobalTv
 */
public interface PlayerApi {
    @GET("{url}?04101632&v=3.1.1&os=1&ver=4&toid=0&token&sid")
    Observable<JsonObject> getPlayJson(@Path("url") String url);

    @GET("json/rooms/{uid}/info1.json?04101635&v=3.1.1&os=1&ver=4&toid=0&token&sid ")
    Observable<JsonObject> getPlayDetatilJson(@Path("uid") String uid);
}
