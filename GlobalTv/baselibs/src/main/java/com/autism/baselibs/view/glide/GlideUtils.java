package com.autism.baselibs.view.glide;

import android.content.Context;
import android.widget.ImageView;

import com.autism.baselibs.R;
import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Author：i5 on 2017/4/5 15:59
 * Used:GlobalTv
 */
public class GlideUtils {
    public static void loadCirleImg(Context mContext, String uri, ImageView mView, int defalutRes) {
        Glide.with(mContext)
                .load(uri)
                .centerCrop()
                .fitCenter()
                .placeholder(defalutRes)
                .bitmapTransform(new CropCircleTransformation(mContext))
                .into(mView);
    }

    public static void loadUriNetImg(Context mContext, String uri, ImageView mView, int defalutRes) {
        Glide.with(mContext)
                .load(uri)
                .fitCenter()
                .skipMemoryCache(true)
                .placeholder(defalutRes)
                .into(mView);
    }

    public static void loadRoundNetImg(Context mContext, String uri, ImageView mView, int defalutRes) {
        Glide.with(mContext)
                .load(uri)
                .centerCrop()
                .fitCenter()
                .transform(new GlideRoundTransform(mContext))
                .placeholder(defalutRes)
                .into(mView);
    }

    public static void loadUriLocalImg(Context mContext, int res, ImageView mImg) {
        Glide.with(mContext)
                .load(res)
                .centerCrop()
                .fitCenter()
                .into(mImg);
    }

    public static void realseImgRes(Context mContext) {
        Glide.get(mContext).clearMemory();
    }
}
