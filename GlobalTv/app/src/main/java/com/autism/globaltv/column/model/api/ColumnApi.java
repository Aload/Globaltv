package com.autism.globaltv.column.model.api;

import com.autism.globaltv.column.model.ColumnEntity;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Author：i5 on 2017/4/6 13:14
 * Used:GlobalTv
 */
public interface ColumnApi {

    @GET("{url}?11211637&os=1&v=2.2.4&os=1&ver=4")
    Observable<List<ColumnEntity>> getColumnList(@Path("url") String url);

    @GET("{url}?04111424=&toid=0&token&sid&cv=quanmin_3.1.1")
    Observable<JsonObject> getColumn(@Path("url") String url);
}
