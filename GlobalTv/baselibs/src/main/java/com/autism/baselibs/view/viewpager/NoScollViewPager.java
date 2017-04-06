package com.autism.baselibs.view.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Autism on 2016/6/15.
 */
public class NoScollViewPager extends ViewPager {
    public NoScollViewPager(Context context) {
        super(context);
    }

    public NoScollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev)
    {
        return false;
        // return super.onintercepttouchevent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev)
    {
        return false;
        // // TODO Auto-generated method stub
        // return super.onTouchEvent(ev);
    }
}
