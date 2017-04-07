package com.autism.globaltv.column.pre;

import android.app.Activity;

import com.autism.baselibs.http.rx.RxSubscriber;
import com.autism.globaltv.base.BasePresenter;
import com.autism.globaltv.column.model.ColumnEntity;
import com.autism.globaltv.column.model.api.ColumnReq;
import com.autism.globaltv.column.view.ColumnView;

import java.util.List;

import rx.Subscriber;

/**
 * Author：i5 on 2017/4/1 15:59
 * Used:GlobalTv
 */
public class ColumnPre extends BasePresenter<ColumnView> {
    public ColumnPre(Activity activity, ColumnView view) {
        super(activity, view);
    }

    @Override
    public void attachView() {
        Subscriber<List<ColumnEntity>> subscriber = new RxSubscriber<List<ColumnEntity>>(mActivity) {
            @Override
            public void _onNext(List<ColumnEntity> columnEntities) {
                mView.onColumnListSuccess(columnEntities);
            }

            @Override
            public void _onError(int code) {
                mView.onFailed("");
            }
        };
        ColumnReq.getInstance().getColumnData(subscriber);
        addSubscrebe(subscriber);
    }

    @Override
    public void unAttachView() {
        super.unAttachView();

    }
}
