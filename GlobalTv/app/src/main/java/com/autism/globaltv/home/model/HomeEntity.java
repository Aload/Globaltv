package com.autism.globaltv.home.model;

import java.util.List;

/**
 * Author：i5 on 2017/4/1 17:27
 * Used:GlobalTv
 */
public class HomeEntity {

    private List<?> ad;
    private List<RoomBean> room;

    public List<?> getAd() {
        return ad;
    }

    public void setAd(List<?> ad) {
        this.ad = ad;
    }

    public List<RoomBean> getRoom() {
        return room;
    }

    public void setRoom(List<RoomBean> room) {
        this.room = room;
    }

    public static class RoomBean {
        /**
         * category_more :
         * icon :
         * id : 0
         * is_default : 1
         * list : [{"anniversary":0,"avatar":"http://a.img.shouyintv.cn/J50l101-normal","beauty_cover":"","category_id":17,"category_name":"王者荣耀","category_slug":"wangzhe","check":true,"coin":42894,"create_at":"2017-04-01 12:48:44","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":4059,"is_shield":false,"landscape":1,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"1547610222-1490976233-936.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/14863838","love_cover":"","max_view":0,"nick":"小鱼","no":14863838,"play_count":0,"play_status":true,"play_true":0,"position":"外太空","recommend_image":"","screen":0,"starlight":42894,"status":2,"stream":"http://flv.quanmin.tv/live/1547610222.flv","thumb":"http://snap.quanmin.tv/1547610222-1491030054-938.jpg?imageView2/2/w/390/","title":"我要全区第一个上王者","uid":1547610222,"video":"http://thumb.quanmin.tv/1547610222.mp4?t=1491030000","view":"18825","weight":0},{"anniversary":0,"avatar":"http://a.img.shouyintv.cn/cwLx101-normal","beauty_cover":"","category_id":29,"category_name":"Showing","category_slug":"showing","check":true,"coin":77903,"create_at":"2017-04-01 13:41:04","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":5802,"is_shield":false,"landscape":0,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"18574022-1490681011-179.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/949455","love_cover":"","max_view":0,"nick":"🍬Christinelover_","no":949455,"play_count":0,"play_status":true,"play_true":0,"position":"北京市","recommend_image":"","screen":1,"starlight":77903,"status":2,"stream":"http://flv.quanmin.tv/live/18574022.flv","thumb":"http://a.img.shouyintv.cn/cwLx101-big","title":"格鲁吉亚day5","uid":18574022,"video":"http://thumb.quanmin.tv/18574022.mp4?t=1491030000","view":"5670","weight":0},{"anniversary":0,"avatar":"http://a.img.shouyintv.cn/a4Lx101-normal","beauty_cover":"","category_id":4,"category_name":"全民星秀","category_slug":"beauty","check":true,"coin":398567,"create_at":"2017-04-01 10:42:40","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":32259,"is_shield":false,"landscape":1,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"8614104-1491012002-543.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/8614104","love_cover":"http://a.img.shouyin.tv/dYVV101","max_view":0,"nick":"沈无情","no":8614104,"play_count":0,"play_status":true,"play_true":0,"position":"北京市","recommend_image":"","screen":0,"slug":"","starlight":398567,"status":2,"stream":"http://flv.quanmin.tv/live/8614104.flv","thumb":"http://snap.quanmin.tv/8614104-1491030003-582.jpg?imageView2/2/w/390/","title":"你女朋友在这。","uid":8614104,"video":"http://thumb.quanmin.tv/8614104.mp4?t=1491030000","view":"8642","weight":0},{"anniversary":0,"app_shuffling_image":"http://image.quanmin.tv/118add2628e3aba718d5a59a252f440bjpg","avatar":"http://image.quanmin.tv/avatar/2b11855e88ca4c31c2bf7900c5ea497d?imageView2/2/w/300/","beauty_cover":"","category_id":1,"category_name":"英雄联盟","category_slug":"lol","check":true,"coin":183367,"create_at":"2017-04-01 09:15:12","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":31288,"is_shield":false,"landscape":1,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"654487-1490965022-765.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/v/pandi","love_cover":"","max_view":0,"nick":"潘森之王","no":654487,"play_count":0,"play_status":true,"play_true":0,"position":"外太空","recommend_image":"http://image.quanmin.tv/90d22a15cb35ef7bfa7f2209ee1c56efjpg","screen":0,"slug":"pandi","starlight":183367,"status":2,"stream":"http://flv.quanmin.tv/live/654487_L3.flv","thumb":"http://snap.quanmin.tv/654487-1491030054-534.jpg?imageView2/2/w/390/","title":"来自吉林的潘森,闯荡电一.请指教~","uid":654487,"video":"http://thumb.quanmin.tv/654487.mp4?t=1491030000","video_quality":"3","view":"63023","weight":0},{"anniversary":0,"avatar":"http://a.img.shouyintv.cn/gAIv101-normal","beauty_cover":"","category_id":21,"category_name":"FIFA","category_slug":"fifa","check":true,"coin":8227,"create_at":"2017-04-01 09:55:00","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":1133,"is_shield":false,"landscape":1,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"2950218-1491011582-66.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/4993746","love_cover":"","max_view":0,"nick":"全民Tv丶凯哥","no":4993746,"play_count":0,"play_status":true,"play_true":0,"position":"外太空","recommend_image":"","screen":0,"starlight":8227,"status":2,"stream":"http://flv.quanmin.tv/live/2950218.flv","thumb":"http://snap.quanmin.tv/2950218-1491030003-464.jpg?imageView2/2/w/390/","title":"我来了兄弟们，今天首秀各种大卡！！！","uid":2950218,"video":"http://thumb.quanmin.tv/2950218.mp4?t=1491030000","view":"21970","weight":0},{"anniversary":0,"avatar":"http://a.img.shouyintv.cn/iA1w101-normal","beauty_cover":"","category_id":13,"category_name":"全民户外","category_slug":"huwai","check":true,"coin":121739,"create_at":"2017-04-01 11:57:32","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":4456,"is_shield":false,"landscape":1,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"10153492-1490952600-634.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/10153492","love_cover":"http://image.quanmin.tv/love/78efea5fba3942f1e7740aad48ff5ce0jpg","max_view":0,"nick":"大喵王","no":10153492,"play_count":0,"play_status":true,"play_true":0,"position":"外太空","recommend_image":"","screen":0,"slug":"","starlight":121739,"status":2,"stream":"http://flv.quanmin.tv/live/10153492.flv","thumb":"http://snap.quanmin.tv/10153492-1491030054-981.jpg?imageView2/2/w/390/","title":"春假喵北台湾之旅","uid":10153492,"video":"http://thumb.quanmin.tv/10153492.mp4?t=1491030000","video_quality":"","view":"8782","weight":0}]
         * name : 精彩推荐
         * screen : 0
         * slug :
         * type : 1
         */

        private String category_more;
        private String icon;
        private int id;
        private int is_default;
        private String name;
        private int screen;
        private String slug;
        private int type;
        private List<ListBean> list;

        public String getCategory_more() {
            return category_more;
        }

        public void setCategory_more(String category_more) {
            this.category_more = category_more;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getIs_default() {
            return is_default;
        }

        public void setIs_default(int is_default) {
            this.is_default = is_default;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScreen() {
            return screen;
        }

        public void setScreen(int screen) {
            this.screen = screen;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * anniversary : 0
             * avatar : http://a.img.shouyintv.cn/J50l101-normal
             * beauty_cover :
             * category_id : 17
             * category_name : 王者荣耀
             * category_slug : wangzhe
             * check : true
             * coin : 42894
             * create_at : 2017-04-01 12:48:44
             * default_image :
             * fans : 0
             * first_play_at : 1970-01-01 08:00:00
             * follow : 4059
             * is_shield : false
             * landscape : 1
             * last_end_at : 1970-01-01 08:00:00
             * last_play_at : 1970-01-01 08:00:00
             * last_thumb : 1547610222-1490976233-936.jpg
             * level : 0
             * like : 0
             * link : http://www.quanmin.tv/14863838
             * love_cover :
             * max_view : 0
             * nick : 小鱼
             * no : 14863838
             * play_count : 0
             * play_status : true
             * play_true : 0
             * position : 外太空
             * recommend_image :
             * screen : 0
             * starlight : 42894
             * status : 2
             * stream : http://flv.quanmin.tv/live/1547610222.flv
             * thumb : http://snap.quanmin.tv/1547610222-1491030054-938.jpg?imageView2/2/w/390/
             * title : 我要全区第一个上王者
             * uid : 1547610222
             * video : http://thumb.quanmin.tv/1547610222.mp4?t=1491030000
             * view : 18825
             * weight : 0
             * slug :
             * app_shuffling_image : http://image.quanmin.tv/118add2628e3aba718d5a59a252f440bjpg
             * video_quality : 3
             */

            private int anniversary;
            private String avatar;
            private String beauty_cover;
            private int category_id;
            private String category_name;
            private String category_slug;
            private boolean check;
            private int coin;
            private String create_at;
            private String default_image;
            private int fans;
            private String first_play_at;
            private int follow;
            private boolean is_shield;
            private int landscape;
            private String last_end_at;
            private String last_play_at;
            private String last_thumb;
            private int level;
            private int like;
            private String link;
            private String love_cover;
            private int max_view;
            private String nick;
            private int no;
            private int play_count;
            private boolean play_status;
            private int play_true;
            private String position;
            private String recommend_image;
            private int screen;
            private int starlight;
            private int status;
            private String stream;
            private String thumb;
            private String title;
            private int uid;
            private String video;
            private String view;
            private int weight;
            private String slug;
            private String app_shuffling_image;
            private String video_quality;

            public int getAnniversary() {
                return anniversary;
            }

            public void setAnniversary(int anniversary) {
                this.anniversary = anniversary;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getBeauty_cover() {
                return beauty_cover;
            }

            public void setBeauty_cover(String beauty_cover) {
                this.beauty_cover = beauty_cover;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getCategory_slug() {
                return category_slug;
            }

            public void setCategory_slug(String category_slug) {
                this.category_slug = category_slug;
            }

            public boolean isCheck() {
                return check;
            }

            public void setCheck(boolean check) {
                this.check = check;
            }

            public int getCoin() {
                return coin;
            }

            public void setCoin(int coin) {
                this.coin = coin;
            }

            public String getCreate_at() {
                return create_at;
            }

            public void setCreate_at(String create_at) {
                this.create_at = create_at;
            }

            public String getDefault_image() {
                return default_image;
            }

            public void setDefault_image(String default_image) {
                this.default_image = default_image;
            }

            public int getFans() {
                return fans;
            }

            public void setFans(int fans) {
                this.fans = fans;
            }

            public String getFirst_play_at() {
                return first_play_at;
            }

            public void setFirst_play_at(String first_play_at) {
                this.first_play_at = first_play_at;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public boolean isIs_shield() {
                return is_shield;
            }

            public void setIs_shield(boolean is_shield) {
                this.is_shield = is_shield;
            }

            public int getLandscape() {
                return landscape;
            }

            public void setLandscape(int landscape) {
                this.landscape = landscape;
            }

            public String getLast_end_at() {
                return last_end_at;
            }

            public void setLast_end_at(String last_end_at) {
                this.last_end_at = last_end_at;
            }

            public String getLast_play_at() {
                return last_play_at;
            }

            public void setLast_play_at(String last_play_at) {
                this.last_play_at = last_play_at;
            }

            public String getLast_thumb() {
                return last_thumb;
            }

            public void setLast_thumb(String last_thumb) {
                this.last_thumb = last_thumb;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getLike() {
                return like;
            }

            public void setLike(int like) {
                this.like = like;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getLove_cover() {
                return love_cover;
            }

            public void setLove_cover(String love_cover) {
                this.love_cover = love_cover;
            }

            public int getMax_view() {
                return max_view;
            }

            public void setMax_view(int max_view) {
                this.max_view = max_view;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public int getNo() {
                return no;
            }

            public void setNo(int no) {
                this.no = no;
            }

            public int getPlay_count() {
                return play_count;
            }

            public void setPlay_count(int play_count) {
                this.play_count = play_count;
            }

            public boolean isPlay_status() {
                return play_status;
            }

            public void setPlay_status(boolean play_status) {
                this.play_status = play_status;
            }

            public int getPlay_true() {
                return play_true;
            }

            public void setPlay_true(int play_true) {
                this.play_true = play_true;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getRecommend_image() {
                return recommend_image;
            }

            public void setRecommend_image(String recommend_image) {
                this.recommend_image = recommend_image;
            }

            public int getScreen() {
                return screen;
            }

            public void setScreen(int screen) {
                this.screen = screen;
            }

            public int getStarlight() {
                return starlight;
            }

            public void setStarlight(int starlight) {
                this.starlight = starlight;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getStream() {
                return stream;
            }

            public void setStream(String stream) {
                this.stream = stream;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getView() {
                return view;
            }

            public void setView(String view) {
                this.view = view;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getApp_shuffling_image() {
                return app_shuffling_image;
            }

            public void setApp_shuffling_image(String app_shuffling_image) {
                this.app_shuffling_image = app_shuffling_image;
            }

            public String getVideo_quality() {
                return video_quality;
            }

            public void setVideo_quality(String video_quality) {
                this.video_quality = video_quality;
            }
        }
    }
}
