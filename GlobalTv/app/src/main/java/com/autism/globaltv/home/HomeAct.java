package com.autism.globaltv.home;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.autism.baselibs.view.viewpager.NoScollViewPager;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseAct;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.base.IPresenter;
import com.autism.globaltv.home.view.HomeFraPager;
import com.autism.globaltv.home.view.SuperManager;

/**
 * Author：Autism on 2017/4/1 15:09
 * Used:GlobalTv
 */
public class HomeAct extends BaseAct implements RadioGroup.OnCheckedChangeListener, ViewPager.OnPageChangeListener, View.OnClickListener {
    private RadioButton mRbHome, mRbPlayer, mRbColumn, mRbMine;
    private NoScollViewPager mPager;

    @Override
    protected IPresenter getPresenter() {
        return null;
    }

    @Override
    protected void onInitViews() {
        super.initTitle();
        setTitleLeftIcon(R.mipmap.img_rec_logo, null);
        setTitleRightIcon(R.drawable.btn_search_selector, this);
        mPager = (NoScollViewPager) findViewById(R.id.fl_contain);
        HomeFraPager homeFraPager = new HomeFraPager(getSupportFragmentManager());
        mPager.setOffscreenPageLimit(3);
        mPager.addOnPageChangeListener(this);
        mPager.setAdapter(homeFraPager);
        RadioGroup rgGroup = (RadioGroup) findViewById(R.id.rg_group);
        mRbHome = (RadioButton) findViewById(R.id.rb_1);
        mRbPlayer = (RadioButton) findViewById(R.id.rb_2);
        mRbColumn = (RadioButton) findViewById(R.id.rb_3);
        mRbMine = (RadioButton) findViewById(R.id.rb_4);
        measure(rgGroup, 0, 140);
        measure(mRbHome, 120, 120);
        measure(mRbPlayer, 120, 120);
        measure(mRbColumn, 120, 120);
        measure(mRbMine, 120, 120);
        rgGroup.check(R.id.rb_1);
        mPager.setCurrentItem(0, false);
        rgGroup.setOnCheckedChangeListener(this);
    }

    @Override
    protected int getRelayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId) {
            case R.id.rb_1:
                mPager.setCurrentItem(0, false);
                showTitleBar(true);
                break;
            case R.id.rb_2:
                mPager.setCurrentItem(1, false);
                showTitleBar(false);
                break;
            case R.id.rb_3:
                showTitleBar(false);
                mPager.setCurrentItem(2, false);
                break;
            case R.id.rb_4:
                showTitleBar(false);
                mPager.setCurrentItem(3, false);
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        SuperManager.getmSuperManager().getHomeFraUi(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View v) {

    }
}
