package com.autism.globaltv.column.view;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.column.model.ColumnEntity;
import com.autism.globaltv.column.pre.ColumnAdapter;
import com.autism.globaltv.column.pre.ColumnPre;

import java.util.List;

/**
 * Author：i5 on 2017/4/1 15:58
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
        super.initTitle(mView);
        setTitleText("栏目");
        setTitleLeftIcon(R.mipmap.img_rec_logo, null);
        setTitleRightIcon(R.drawable.btn_search_selector, this);
        showDivider(true);
        RecyclerView mRecycler = (RecyclerView) mView.findViewById(R.id.column_recycler);
        mRecycler.setLayoutManager(new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, true));
        columnAdapter = new ColumnAdapter();
        mRecycler.setAdapter(columnAdapter);
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.column_fra_layout;
    }

    @Override
    public void onColumnListSuccess(List<ColumnEntity> mData) {
        columnAdapter.notifyUi(mData);
    }

    @Override
    public void onFailed(String msg) {
    }

    @Override
    public void onClick(View v) {

    }
}
