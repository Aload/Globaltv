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
         * list : [{"anniversary":0,"avatar":"http://a.img.shouyintv.cn/J50l101-normal","beauty_cover":"","category_id":17,"category_name":"王者荣耀","category_slug":"wangzhe","check":true,"coin":44718,"create_at":"2017-04-05 10:44:38","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":4086,"is_shield":false,"landscape":1,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"1547610222-1491360053-571.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/14863838","love_cover":"","max_view":0,"nick":"小鱼","no":14863838,"play_count":0,"play_status":true,"play_true":0,"position":"外太空","recommend_image":"","screen":0,"starlight":44718,"status":2,"stream":"http://flv.quanmin.tv/live/1547610222.flv","thumb":"http://snap.quanmin.tv/1547610222-1491361733-787.jpg?imageView2/2/w/390/","title":"我要全区第一个上王者","uid":1547610222,"video":"http://thumb.quanmin.tv/1547610222.mp4?t=1491361500","view":"15946","weight":0},{"anniversary":0,"avatar":"http://a.img.shouyintv.cn/CtXw101-normal","beauty_cover":"","category_id":29,"category_name":"Showing","category_slug":"showing","check":true,"coin":1127,"create_at":"2017-04-05 09:19:44","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":845,"is_shield":false,"landscape":0,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"1595648802-1491143884-713.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/15475210","love_cover":"","max_view":0,"nick":"珊渣","no":15475210,"play_count":0,"play_status":true,"play_true":0,"position":"宁德市","recommend_image":"","screen":1,"starlight":1127,"status":2,"stream":"http://flv.quanmin.tv/live/1595648802.flv","thumb":"http://a.img.shouyintv.cn/CtXw101-big","title":"早上好","uid":1595648802,"video":"http://thumb.quanmin.tv/1595648802.mp4?t=1491361500","view":"989","weight":0},{"anniversary":0,"avatar":"http://a.img.shouyintv.cn/7W0y101-normal","beauty_cover":"","category_id":4,"category_name":"全民星秀","category_slug":"beauty","check":true,"coin":5007,"create_at":"2017-04-05 07:50:18","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":230,"is_shield":false,"landscape":1,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"1580923242-1491349674-722.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/15505161","love_cover":"","max_view":0,"nick":"Qn凌菲","no":15505161,"play_count":0,"play_status":true,"play_true":0,"position":"外太空","recommend_image":"","screen":0,"starlight":5007,"status":2,"stream":"http://flv.quanmin.tv/live/1580923242.flv","thumb":"http://snap.quanmin.tv/1580923242-1491361682-945.jpg?imageView2/2/w/390/","title":"Qn凌菲，宝宝求关注","uid":1580923242,"video":"http://thumb.quanmin.tv/1580923242.mp4?t=1491361500","view":"3278","weight":0},{"anniversary":0,"avatar":"http://image.quanmin.tv/avatar/35f675b8f9ee64f8c688eccc978eaed2?imageView2/2/w/300/","beauty_cover":"","category_id":5,"category_name":"单机主机","category_slug":"tvgame","check":true,"coin":3125,"create_at":"2017-04-05 08:29:47","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":1851,"is_shield":false,"landscape":1,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"1815505-1491280683-591.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/1815505","love_cover":"","max_view":0,"nick":"mdn17游戏吧","no":1815505,"play_count":0,"play_status":true,"play_true":0,"position":"","recommend_image":"","screen":0,"slug":"","starlight":3125,"status":2,"stream":"http://flv.quanmin.tv/live/1815505_L3.flv","thumb":"http://snap.quanmin.tv/1815505-1491361684-935.jpg?imageView2/2/w/390/","title":"东京迷城eX+","uid":1815505,"video":"http://thumb.quanmin.tv/1815505.mp4?t=1491361500","video_quality":"234","view":"14460","weight":0},{"anniversary":0,"avatar":"http://image.quanmin.tv/avatar/2f7f65652142d7d488d9fa101d787779?imageView2/2/w/300/","beauty_cover":"","category_id":1,"category_name":"英雄联盟","category_slug":"lol","check":true,"coin":411428,"create_at":"2017-04-05 09:04:49","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":13297,"is_shield":false,"landscape":1,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"2221033-1491317523-90.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/2221033","love_cover":"","max_view":0,"nick":"全民TV柠檬","no":2221033,"play_count":0,"play_status":true,"play_true":0,"position":"","recommend_image":"","screen":0,"slug":"","starlight":411428,"status":2,"stream":"http://flv.quanmin.tv/live/2221033_L3.flv","thumb":"http://snap.quanmin.tv/2221033-1491361682-562.jpg?imageView2/2/w/390/","title":"直播一周年了。一路感谢有你们，水友赛回馈","uid":2221033,"video":"http://thumb.quanmin.tv/2221033.mp4?t=1491361500","video_quality":"34","view":"28122","weight":0},{"anniversary":0,"avatar":"http://a.img.shouyintv.cn/v2Zv101-normal","beauty_cover":"","category_id":13,"category_name":"全民户外","category_slug":"huwai","check":true,"coin":8069,"create_at":"2017-04-05 08:53:01","default_image":"","fans":0,"first_play_at":"1970-01-01 08:00:00","follow":943,"is_shield":false,"landscape":1,"last_end_at":"1970-01-01 08:00:00","last_play_at":"1970-01-01 08:00:00","last_thumb":"1599977846-1490844429-414.jpg","level":0,"like":0,"link":"http://www.quanmin.tv/v/quanminjixiang","love_cover":"","max_view":0,"nick":"全民吉祥","no":15439129,"play_count":0,"play_status":true,"play_true":0,"position":"外太空","recommend_image":"","screen":0,"slug":"quanminjixiang","starlight":8069,"status":2,"stream":"http://flv.quanmin.tv/live/1599977846.flv","thumb":"http://snap.quanmin.tv/1599977846-1491361652-391.jpg?imageView2/2/w/390/","title":"啊 白雪","uid":1599977846,"video":"http://thumb.quanmin.tv/1599977846.mp4?t=1491361500","view":"6024","weight":0}]
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
             * coin : 44718
             * create_at : 2017-04-05 10:44:38
             * default_image :
             * fans : 0
             * first_play_at : 1970-01-01 08:00:00
             * follow : 4086
             * is_shield : false
             * landscape : 1
             * last_end_at : 1970-01-01 08:00:00
             * last_play_at : 1970-01-01 08:00:00
             * last_thumb : 1547610222-1491360053-571.jpg
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
             * starlight : 44718
             * status : 2
             * stream : http://flv.quanmin.tv/live/1547610222.flv
             * thumb : http://snap.quanmin.tv/1547610222-1491361733-787.jpg?imageView2/2/w/390/
             * title : 我要全区第一个上王者
             * uid : 1547610222
             * video : http://thumb.quanmin.tv/1547610222.mp4?t=1491361500
             * view : 15946
             * weight : 0
             * slug :
             * video_quality : 234
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

            public String getVideo_quality() {
                return video_quality;
            }

            public void setVideo_quality(String video_quality) {
                this.video_quality = video_quality;
            }
        }
    }
}
