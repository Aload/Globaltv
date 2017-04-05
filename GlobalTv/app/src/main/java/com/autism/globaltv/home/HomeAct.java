package com.autism.globaltv.home;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseAct;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.base.IPresenter;
import com.autism.globaltv.home.view.SuperManager;

/**
 * Author：Autism on 2017/4/1 15:09
 * Used:GlobalTv
 */
public class HomeAct extends BaseAct implements RadioGroup.OnCheckedChangeListener {
    private RadioButton mRbHome, mRbPlayer, mRbColumn, mRbMine;

    @Override
    protected IPresenter getPresenter() {
        return null;
    }

    @Override
    protected void onInitViews() {
        RadioGroup rgGroup = (RadioGroup) findViewById(R.id.rg_group);
        mRbHome = (RadioButton) findViewById(R.id.rb_1);
        mRbPlayer = (RadioButton) findViewById(R.id.rb_2);
        mRbColumn = (RadioButton) findViewById(R.id.rb_3);
        mRbMine = (RadioButton) findViewById(R.id.rb_4);
        measure(rgGroup, 0, 160);
        measure(mRbHome, 120, 120);
        measure(mRbPlayer, 120, 120);
        measure(mRbColumn, 120, 120);
        measure(mRbMine, 120, 120);
        rgGroup.check(R.id.rb_1);
        changeReplaceFra(0);
        rgGroup.setOnCheckedChangeListener(this);
    }

    /**
     * 切换tab
     *
     * @param position
     */
    public void changeReplaceFra(int position) {
        BaseFra homeFraUi = SuperManager.getmSuperManager().getHomeFraUi(position);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_contain, homeFraUi);
        fragmentTransaction.commit();
    }

    @Override
    protected int getRelayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId) {
            case R.id.rb_1:
                changeReplaceFra(0);
                break;
            case R.id.rb_2:
                changeReplaceFra(1);
                break;
            case R.id.rb_3:
                changeReplaceFra(2);
                break;
            case R.id.rb_4:
                changeReplaceFra(3);
                break;
        }
    }
}
