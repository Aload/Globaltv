package com.autism.globaltv.base;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.baselibs.EventBusLogicUtils;
import com.autism.baselibs.view.refresh.SpringView;
import com.autism.baselibs.view.refresh.container.MeituanFooter;
import com.autism.baselibs.view.refresh.container.MeituanHeader;
import com.autism.globaltv.R;
import com.autism.logiclibs.UiUtils;

import java.util.List;

/**
 * Author：autism on 2017/4/1 10:51
 * Used:GlobalTv base activity
 */
public abstract class BaseAct<T extends IPresenter> extends AppCompatActivity implements SpringView.OnFreshListener {


    protected ImageView mTvTitleLeft;
    protected ImageView mTvTitleRight;
    protected View mViewDivider;
    protected View mViewTitleRight;
    protected T mPresenter;
    private TextView mTitle;
    private View mTitleLayout;
    protected View mLoading;

    protected final static String TAG = BaseAct.class.getSimpleName();
    protected SpringView mRefresh;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setLiveConfig();
        super.onCreate(savedInstanceState);
        setContentView(getRelayoutID());
        onInitViews();
        onVariable();
        EventBusLogicUtils.registerBus(this);
        mPresenter = getPresenter();
        if (null != mPresenter) {
            showLoading();
            mPresenter.attachView();
        }
    }

    /**
     * 需要时候复写
     */
    public void setLiveConfig() {

    }

    /**
     * 获取presenter
     *
     * @return
     */
    protected abstract T getPresenter();

    /**
     * 初始化部分参数
     */
    public void onVariable() {

    }

    public void onInitViews() {
        mLoading = findViewById(R.id.loading);
        mRefresh = (SpringView) findViewById(R.id.refresh_sp);
        if (null != mRefresh) {
            mRefresh.setListener(this);
            mRefresh.setType(SpringView.Type.FOLLOW);
            mRefresh.setHeader(new MeituanHeader(this));
            mRefresh.setFooter(new MeituanFooter(this));
        }
    }

    /**
     * 显示加载进度
     */
    public void showLoading() {
        if (null != mLoading) {
            mLoading.setVisibility(View.VISIBLE);
        }
    }

    /**
     * 取消加载进度
     */
    public void dissLoading() {
        if (null != mLoading) {
            mLoading.setVisibility(View.GONE);
        }
    }

    protected abstract int getRelayoutID();

    protected void initTitle() {
        mTitleLayout = findViewById(R.id.title_layout);
        if (null == mTitleLayout) return;
        measure(mTitleLayout, 0, 168);
        mTvTitleLeft = (ImageView) findViewById(R.id.left_img);
        mTitle = (TextView) findViewById(R.id.title_txt);
        mTvTitleRight = (ImageView) findViewById(R.id.right_img);
        mViewDivider = findViewById(R.id.title_divider);
    }

    /**
     * 是否显示标题
     *
     * @param isShown
     */
    protected void showTitleBar(boolean isShown) {
        if (mTitleLayout == null) return;
        if (isShown) {
            mTitleLayout.setVisibility(View.VISIBLE);
        } else mTitleLayout.setVisibility(View.GONE);
    }

    /**
     * 设置标题
     *
     * @param msg
     * @param res
     */
    protected void setTitleText(String msg, int res) {
        if (res != 0) {
            mTitle.setBackgroundResource(res);
        } else mTitle.setText(msg);
    }

    /**
     * 测量view位置
     *
     * @param mViewTitle
     * @param i
     * @param i1
     */
    protected void measure(View mViewTitle, int i, int i1) {
        UiUtils.measure(mViewTitle, i, i1);
    }

    /**
     * 设置左边的按钮图片
     *
     * @param resId
     * @param listener
     */
    protected void setTitleLeftIcon(int resId, View.OnClickListener listener) {
        if (null != mTvTitleLeft) {
            mTvTitleLeft.setBackgroundResource(resId);
            measure(mTvTitleLeft, 0, 92);
        }
        if (null != listener & null != mTvTitleLeft) {
            mTvTitleLeft.setOnClickListener(listener);
        }
    }

    /**
     * 设置右边的按钮的图片
     *
     * @param resId
     * @param listener
     */
    protected void setTitleRightIcon(int resId, View.OnClickListener listener) {
        if (null != mTvTitleRight) {
            mTvTitleRight.setBackgroundResource(resId);
            measure(mTvTitleRight, 92, 92);
        }
        if (null != listener & null != mViewTitleRight) {
            mViewTitleRight.setOnClickListener(listener);
        }
    }

    /**
     * 是否显示分割线
     *
     * @param show
     */
    protected void showDivider(boolean show) {
        if (null == mViewDivider) {
            return;
        }
        if (show) {
            mViewDivider.setVisibility(View.VISIBLE);
        } else {
            mViewDivider.setVisibility(View.GONE);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        FragmentManager mFragmentManager = getSupportFragmentManager();
        List<Fragment> list = mFragmentManager.getFragments();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).onActivityResult(requestCode, resultCode, data);
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBusLogicUtils.unRegisterBus(this);
    }

    @Override
    public void onRefresh() {

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
