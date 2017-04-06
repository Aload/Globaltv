package com.autism.globaltv.mine;

import android.view.View;

import com.autism.baselibs.view.pull.PullToZoomScrollViewEx;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.base.IPresenter;

/**
 * Author：autism on 2017/4/1 15:58
 * Used:GlobalTv
 */
public class MineFra extends BaseFra<IPresenter> {
    @Override
    protected IPresenter getPresenter() {
        return null;
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        PullToZoomScrollViewEx mScrollView = (PullToZoomScrollViewEx) mView.findViewById(R.id.sv_mine);
        View headerview = View.inflate(getActivity(), R.layout.widget_profile_headview, null);

        View zoomview = View.inflate(getActivity(), R.layout.widget_zoomview, null);
        View contentview = View.inflate(getActivity(), R.layout.widget_profile_contentview, null);
        mScrollView.setHeaderView(headerview);
        mScrollView.setZoomView(zoomview);
        mScrollView.setScrollContentView(contentview);
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.mine_fra_layout;
    }
}
