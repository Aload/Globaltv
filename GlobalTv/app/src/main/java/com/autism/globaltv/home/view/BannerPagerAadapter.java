package com.autism.globaltv.home.view;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.autism.baselibs.view.glide.GlideUtils;
import com.autism.globaltv.R;
import com.autism.globaltv.home.model.BannerEntity;

import java.util.List;

/**
 * @author autism
 */
public class BannerPagerAadapter extends PagerAdapter {

    private Context mContext;
    private List<BannerEntity.AppfocusBean> banners;

    public BannerPagerAadapter(Context mContext, List<BannerEntity.AppfocusBean> banners) {
        this.banners = banners;
        this.mContext = mContext;

    }

    @Override
    public int getCount() {
        if (banners != null && !banners.isEmpty()) {
            return banners.size();
        }
        return 0;
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
        webImageView.setImageResource(R.mipmap.logo);
        BannerEntity.AppfocusBean banner = banners.get(position);
        GlideUtils.loadUriNetImg(mContext, banner.getThumb(), webImageView);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        container.addView(webImageView, layoutParams);
        return webImageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

}