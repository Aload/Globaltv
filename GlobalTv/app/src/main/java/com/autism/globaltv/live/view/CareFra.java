package com.autism.globaltv.live.view;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.base.IPresenter;

/**
 * Author：i5 on 2017/4/12 11:05
 * Used:GlobalTv
 */
public class CareFra extends BaseFra<IPresenter> {
    @Override
    protected IPresenter getPresenter() {
        return null;
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        RecyclerView mRecycler = (RecyclerView) mView.findViewById(R.id.rc_sort);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecycler.setAdapter(null);
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.care_fra;
    }
}
