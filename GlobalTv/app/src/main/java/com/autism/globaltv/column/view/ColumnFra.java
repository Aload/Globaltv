package com.autism.globaltv.column.view;

import android.os.Handler;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.baselibs.view.refresh.SpringView;
import com.autism.baselibs.view.refresh.container.MeituanFooter;
import com.autism.baselibs.view.refresh.container.MeituanHeader;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.column.model.ColumnEntity;
import com.autism.globaltv.column.pre.ColumnAdapter;
import com.autism.globaltv.column.pre.ColumnPre;

import java.util.List;

/**
 * Author：autism on 2017/4/1 15:58
 * Used:GlobalTv
 */
public class ColumnFra extends BaseFra<ColumnPre> implements ColumnView, View.OnClickListener {
    private ColumnAdapter columnAdapter;

    @Override
    protected ColumnPre getPresenter() {
        return new ColumnPre(getActivity(), this);
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        RecyclerView mRecycler = (RecyclerView) mView.findViewById(R.id.column_recycler);
        mRecycler.setLayoutManager(new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false));
        columnAdapter = new ColumnAdapter();
        mRecycler.setAdapter(columnAdapter);
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.column_fra_layout;
    }

    @Override
    public void onColumnListSuccess(List<ColumnEntity> mData) {
        mRefresh.onFinishFreshAndLoad();
        columnAdapter.notifyUi(mData);
    }

    @Override
    public void onFailed(String msg) {
        mRefresh.onFinishFreshAndLoad();
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onRefresh() {
        mPresenter.attachView();
    }

    @Override
    public void onLoadmore() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mRefresh.onFinishFreshAndLoad();
            }
        }, 2000);
    }
}
