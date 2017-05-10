package com.autism.globaltv.home.pre;

import android.app.Activity;

import com.autism.baselibs.http.rx.RxSubscriber;
import com.autism.globaltv.base.BasePresenter;
import com.autism.globaltv.home.model.api.HomeReq;
import com.autism.globaltv.home.model.api.LiveListEntity;
import com.autism.globaltv.home.view.NormalView;
import com.king.base.util.StringUtils;

import rx.Subscriber;

/**
 * Author：autism on 2017/5/10 14:52
 * Used:GlobalTv
 */
public class NormalPre extends BasePresenter<NormalView> {
    private String mFlag;

    public NormalPre(Activity activity, NormalView view, String flag) {
        super(activity, view);
        this.mFlag = flag;
    }

    @Override
    public void attachView() {
        Subscriber<LiveListEntity> subscriber = new RxSubscriber<LiveListEntity>(mActivity) {
            @Override
            public void _onNext(LiveListEntity mjson) {
                super._onNext(mjson);
                mView.getNormalList(mjson);
            }

            @Override
            public void _onError(int code) {
                super._onError(code);
                mView.getNormalError("异常数据");
            }
        };
        if (StringUtils.isBlank(mFlag)) {
            HomeReq.getInstance().getLiveListData(subscriber);
        } else {
            HomeReq.getInstance().getNormalLiveListData(subscriber, mFlag);
        }
        addSubscrebe(subscriber);
    }
}
