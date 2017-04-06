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
    @GET("{url}?11211639&os=1&v=2.2.4&os=1&ver=4")
    Observable<JsonObject> getPlayJson(@Path("url") String url);
}
