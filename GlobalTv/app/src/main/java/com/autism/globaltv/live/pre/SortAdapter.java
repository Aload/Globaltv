package com.autism.globaltv.live.pre;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.live.view.CareFra;
import com.autism.globaltv.live.view.ContributionAllFra;
import com.autism.globaltv.live.view.ContributionFra;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：i5 on 2017/4/12 11:01
 * Used:GlobalTv
 */
public class SortAdapter extends FragmentStatePagerAdapter {
    private List<BaseFra> mSortList = new ArrayList<>();

    public SortAdapter(FragmentManager fm) {
        super(fm);
        init();
    }

    private void init() {
        mSortList.add(new CareFra());
        mSortList.add(new ContributionFra());
        mSortList.add(new ContributionAllFra());
    }

    @Override
    public Fragment getItem(int position) {
        return mSortList.get(position);
    }

    @Override
    public int getCount() {
        return mSortList.size();
    }
}
