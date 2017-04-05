package com.autism.globaltv.home.view;

import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseFra;
import com.autism.globaltv.home.pre.ColumnPre;
import com.autism.globaltv.home.pre.PlayerPre;

/**
 * Author：i5 on 2017/4/1 15:58
 * Used:GlobalTv
 */
public class PlayerFra extends BaseFra<PlayerPre> {
    @Override
    protected PlayerPre getPresenter() {
        return null;
    }

    @Override
    protected int getReLayoutFraID() {
        return R.layout.player_fra_layout;
    }
}
