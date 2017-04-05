package com.autism.globaltv.home.view;

import android.util.SparseArray;

import com.autism.baselibs.utils.LogUtil;
import com.autism.globaltv.base.BaseFra;

/**
 * Author：AutismF on 2017/4/1 15:54
 * Used:GlobalTv
 */
public class SuperManager {
    private static SuperManager mSuperManager;
    private static SparseArray<BaseFra> mContainer = new SparseArray<>();
    private static final String TAG = SuperManager.class.getSimpleName();

    private SuperManager() {
    }

    public static SuperManager getmSuperManager() {
        if (null == mSuperManager) {
            synchronized (SuperManager.class) {
                if (null == mSuperManager) mSuperManager = new SuperManager();
            }
        }
        return mSuperManager;
    }

    /**
     * 首页界面切换
     *
     * @param position
     * @return
     */
    public BaseFra getHomeFraUi(int position) {
        BaseFra mFra = null;
        if (null != mContainer && mContainer.size() > 0) {
            return mContainer.get(position);
        }
        switch (position) {
            case 0:
                mFra = new HomeFra();
                break;
            case 1:
                mFra = new ColumnFra();
                break;
            case 2:
                mFra = new PlayerFra();
                break;
            case 3:
                mFra = new MineFra();
                break;
            default:
                LogUtil.e(TAG, "切换异常");
                break;
        }
        mContainer.put(position, mFra);
        return mFra;
    }

    /**
     * 释放缓存
     */
    public void realaxUi() {
        if (null == mContainer) return;
        mContainer.clear();
    }
}
