package com.autism.globaltv.column.pre;

import android.app.Activity;

import com.autism.baselibs.http.rx.RxSubscriber;
import com.autism.globaltv.base.BasePresenter;
import com.autism.globaltv.column.model.ColumnListEntity;
import com.autism.globaltv.column.model.api.ColumnReq;
import com.autism.globaltv.column.view.ColumnListView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import rx.Subscriber;

/**
 * Author：i5 on 2017/4/11 14:50
 * Used:GlobalTv
 */
public class ColumnListPre extends BasePresenter<ColumnListView> {
    private String msg;

    public ColumnListPre(Activity activity, ColumnListView view, String msg) {
        super(activity, view);
        this.msg = msg;
    }

    @Override
    public void attachView() {
        Subscriber<JsonObject> subscriber = new RxSubscriber<JsonObject>(mActivity) {
            @Override
            public void _onNext(JsonObject columnEntities) {
                Gson mGson = new Gson();
                ColumnListEntity columnListEntity = mGson.fromJson(columnEntities, ColumnListEntity.class);
                mView.onColumnListSuccess(columnListEntity);
            }

            @Override
            public void _onError(int code) {
                mView.onColumnFailed("数据异常");
            }
        };
        ColumnReq.getInstance().getColumnListData(subscriber, msg);
        addSubscrebe(subscriber);
    }
}
