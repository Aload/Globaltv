package com.autism.globaltv.column.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.baselibs.utils.LogUtil;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseAct;
import com.autism.globaltv.base.ViewUtils;
import com.autism.globaltv.base.common.Config;
import com.autism.globaltv.column.model.ColumnListEntity;
import com.autism.globaltv.column.pre.ColumnListAdapter;
import com.autism.globaltv.column.pre.ColumnListPre;
import com.autism.globaltv.live.view.LivePlayerAct;
import com.autism.globaltv.live.view.LiveShowPlayerAct;

/**
 * Author：i5 on 2017/4/11 14:50
 * Used:GlobalTv
 */
public class ColumnListAct extends BaseAct<ColumnListPre> implements View.OnClickListener, ColumnListView, OnItemColumnListener {

    private String mMsg;
    private ColumnListAdapter mColumnListAdapter;

    @Override
    protected ColumnListPre getPresenter() {
        return new ColumnListPre(this, this, mMsg);
    }

    @Override
    public void onInitViews() {
        super.onInitViews();
        super.initTitle();
        setTitleLeftIcon(R.drawable.btn_back_selector, this);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra(Config.COLUMNTYPE);
        mMsg = bundleExtra.getString(Config.COLUMN_FLUG);
        String mTitleName = bundleExtra.getString(Config.COLUMN_NAME);
        setTitleText(mTitleName, 0);
        RecyclerView mRecycler = (RecyclerView) findViewById(R.id.rc_column);
        mRecycler.setLayoutManager(new GridLayoutManager(this, 2));
        mColumnListAdapter = new ColumnListAdapter();
        mRecycler.setAdapter(mColumnListAdapter);
        mColumnListAdapter.setOnTypeClick(this);
    }

    @Override
    protected int getRelayoutID() {
        return R.layout.column_list_fra;
    }

    @Override
    public void onClick(View v) {
        finish();
        ViewUtils.left2RightOut(this);
    }

    @Override
    public void onColumnListSuccess(ColumnListEntity mList) {
        mRefresh.onFinishFreshAndLoad();
        mColumnListAdapter.notifyUi(mList.getData());
    }

    @Override
    public void onColumnFailed(String msg) {
        LogUtil.e(TAG, msg);
        mRefresh.onFinishFreshAndLoad();
    }

    @Override
    public void onRefresh() {
        super.onRefresh();
        mPresenter.attachView();
    }

    @Override
    public void onLoadmore() {
        super.onLoadmore();
    }

    @Override
    public void onClickItemType(ColumnListEntity.DataBean mData) {
        if ("showing".equals(mData.getCategory_slug())) {
            ViewUtils.intentLefttoRightBundleInteger(this, LiveShowPlayerAct.class, Config.ENTERUID, mData.getUid());
        } else
            ViewUtils.intentLefttoRightBundleInteger(this, LivePlayerAct.class, Config.ENTERUID, mData.getUid());
    }
}
