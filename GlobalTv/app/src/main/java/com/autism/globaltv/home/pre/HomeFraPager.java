package com.autism.globaltv.home.pre;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.autism.globaltv.home.view.SuperManager;

/**
 * Author：i5 on 2017/4/6 14:23
 * Used:GlobalTv
 */
public class HomeFraPager extends FragmentStatePagerAdapter {
    public HomeFraPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return SuperManager.getmSuperManager().getHomeFraUi(position);
    }

    @Override
    public int getCount() {
        return 4;
    }
}
