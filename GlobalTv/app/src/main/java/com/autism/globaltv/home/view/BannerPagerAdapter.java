package com.autism.globaltv.home.view;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.autism.baselibs.view.glide.GlideUtils;
import com.autism.globaltv.R;
import com.autism.globaltv.home.model.BannerEntity;

import java.util.List;

import static android.R.attr.banner;

/**
 * @author autism
 */
public class BannerPagerAdapter extends PagerAdapter {

    private Context mContext;
    private BannerEntity banners;

    public BannerPagerAdapter(Context mContext, BannerEntity mDate) {
        this.mContext = mContext;
        this.banners = mDate;
    }

    @Override
    public int getCount() {
        return null == banners ? 0 : banners.getAppfocus().size();
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView webImageView = new ImageView(mContext);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                , ViewGroup.LayoutParams.MATCH_PARENT);
        BannerEntity.AppfocusBean androidfocusBean = banners.getAppfocus().get(position);
        GlideUtils.loadUriNetImg(mContext, androidfocusBean.getThumb(), webImageView, R.mipmap.ic_default_cover);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        container.addView(webImageView, layoutParams);
        return webImageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}