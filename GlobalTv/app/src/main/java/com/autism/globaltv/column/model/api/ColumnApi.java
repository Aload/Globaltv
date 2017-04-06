package com.autism.globaltv.column.model.api;

import com.autism.globaltv.column.model.ColumnEntity;

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
}
