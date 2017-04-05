package com.autism.globaltv.home.view;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.base.IPresenter;
import com.autism.globaltv.home.pre.ColumnPre;

/**
 * Author：i5 on 2017/4/1 15:58
 * Used:GlobalTv
 */
public class MineFra extends BaseFra<IPresenter> {
    @Override
    protected IPresenter getPresenter() {
        return null;
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.mine_fra_layout;
    }
}
