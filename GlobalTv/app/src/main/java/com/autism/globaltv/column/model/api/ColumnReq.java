package com.autism.globaltv.column.model.api;

import com.autism.baselibs.http.RetrofitManager;
import com.autism.baselibs.http.rx.RxUtil;
import com.autism.globaltv.column.model.ColumnEntity;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Retrofit;
import rx.Subscriber;

/**
 * Author：Autism on 2017/4/1 17:33
 * Used:GlobalTv
 */
public class ColumnReq {
    private static ColumnReq INSTANCE;
    private ColumnApi mHomeApi;

    public static ColumnReq getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new ColumnReq();
        }
        return INSTANCE;
    }

    private ColumnReq() {
        Retrofit retrofit = RetrofitManager.getRetrofit();
        mHomeApi = retrofit.create(ColumnApi.class);
    }

    /**
     * column数据
     *
     * @param subscriber
     */
    public void getColumnData(Subscriber<List<ColumnEntity>> subscriber) {
        mHomeApi.getColumnList("json/categories/list.json")
                .compose(RxUtil.<List<ColumnEntity>>ioMain())
                .subscribe(subscriber);
    }
}
