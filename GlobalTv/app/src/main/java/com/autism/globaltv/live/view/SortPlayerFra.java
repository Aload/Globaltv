package com.autism.globaltv.live.view;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.autism.baselibs.view.viewpager.NoScollViewPager;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.base.IPresenter;
import com.autism.globaltv.live.pre.SortAdapter;

/**
 * Author：i5 on 2017/4/11 09:46
 * Used:GlobalTv
 */
public class SortPlayerFra extends BaseFra<IPresenter> implements View.OnClickListener {

    private TextView mText_01;
    private TextView mText_02;
    private RelativeLayout mText_layout_02;
    private TextView mText_03;
    private NoScollViewPager mPager;

    @Override
    protected IPresenter getPresenter() {
        return null;
    }

    @Override
    protected void onInitFraView(View mView) {
        super.onInitFraView(mView);
        mText_01 = (TextView) mView.findViewById(R.id.txt_01);
        mText_02 = (TextView) mView.findViewById(R.id.txt_02);
        mText_03 = (TextView) mView.findViewById(R.id.txt_03);
        measure(mText_01, 220, 85);
        measure(mText_02, 220, 85);
        measure(mText_03, 220, 85);
        changeUi(0);
        mPager = (NoScollViewPager) mView.findViewById(R.id.pager);
        SortAdapter sortAdapter = new SortAdapter(getChildFragmentManager());
        mPager.setAdapter(sortAdapter);
        mText_01.setOnClickListener(this);
        mText_02.setOnClickListener(this);
        mText_03.setOnClickListener(this);
        mPager.setCurrentItem(0);
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.sort_player_layout;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.txt_01:
                changeUi(0);
                mPager.setCurrentItem(0);
                break;
            case R.id.txt_02:
                changeUi(1);
                mPager.setCurrentItem(1);
                break;
            case R.id.txt_03:
                changeUi(2);
                mPager.setCurrentItem(2);
                break;
        }
    }

    private void changeUi(int i) {
        switch (i) {
            case 0:
                mText_01.setTextColor(getResources().getColor(R.color.white));
                mText_01.setBackgroundResource(R.mipmap.room_admin);

                mText_02.setTextColor(getResources().getColor(R.color.reb_change));
                mText_02.setBackgroundResource(R.mipmap.reload_pressed);

                mText_03.setTextColor(getResources().getColor(R.color.reb_change));
                mText_03.setBackgroundResource(R.mipmap.reload_pressed);
                break;
            case 1:
                mText_01.setTextColor(getResources().getColor(R.color.reb_change));
                mText_01.setBackgroundResource(R.mipmap.reload_pressed);

                mText_02.setTextColor(getResources().getColor(R.color.white));
                mText_02.setBackgroundResource(R.mipmap.room_admin);

                mText_03.setTextColor(getResources().getColor(R.color.reb_change));
                mText_03.setBackgroundResource(R.mipmap.reload_pressed);
                break;
            case 2:
                mText_01.setTextColor(getResources().getColor(R.color.reb_change));
                mText_01.setBackgroundResource(R.mipmap.reload_pressed);

                mText_02.setTextColor(getResources().getColor(R.color.reb_change));
                mText_02.setBackgroundResource(R.mipmap.reload_pressed);

                mText_03.setTextColor(getResources().getColor(R.color.white));
                mText_03.setBackgroundResource(R.mipmap.room_admin);
                break;
        }
    }
}
