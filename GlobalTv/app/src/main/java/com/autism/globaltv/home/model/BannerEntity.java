package com.autism.globaltv.home.model;

import java.util.List;

/**
 * Author：i5 on 2017/4/5 17:32
 * Used:GlobalTv
 */
public class BannerEntity {

    private List<BannersBean> banners;
    private List<NavsBean> navs;

    public List<BannersBean> getBanners() {
        return banners;
    }

    public void setBanners(List<BannersBean> banners) {
        this.banners = banners;
    }

    public List<NavsBean> getNavs() {
        return navs;
    }

    public void setNavs(List<NavsBean> navs) {
        this.navs = navs;
    }

    public static class BannersBean {
        /**
         * img : http://i5.pdim.gs/621fc6b4c5c37f412abff02540b08abb.jpeg
         * title :
         * type : 3
         * url : https://adl.netease.com/d/g/tx/c/szxmtvbcpa
         * display_type : 1
         * roomid : 462045
         * style_type : 1
         */

        private String img;
        private String title;
        private String type;
        private String url;
        private String display_type;
        private String roomid;
        private String style_type;

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDisplay_type() {
            return display_type;
        }

        public void setDisplay_type(String display_type) {
            this.display_type = display_type;
        }

        public String getRoomid() {
            return roomid;
        }

        public void setRoomid(String roomid) {
            this.roomid = roomid;
        }

        public String getStyle_type() {
            return style_type;
        }

        public void setStyle_type(String style_type) {
            this.style_type = style_type;
        }
    }

    public static class NavsBean {
        /**
         * img : http://i6.pdim.gs/113b4716cb11efc0dbeab03ec9f87150.png
         * title : 英雄联盟
         * type : 4
         * url : pandatv://cate/lol?title=英雄联盟
         */

        private String img;
        private String title;
        private String type;
        private String url;

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
