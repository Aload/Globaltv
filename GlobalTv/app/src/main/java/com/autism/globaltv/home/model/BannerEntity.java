package com.autism.globaltv.home.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Author：i5 on 2017/4/5 17:32
 * Used:GlobalTv
 */
public class BannerEntity {

    private List<AndroidstartBean> androidstart;
    @SerializedName("app-focus")
    private List<AppfocusBean> appfocus;
    private List<AppFocusCheckBean> appFocusCheck;
    @SerializedName("ios-focus")
    private List<IosfocusBean> iosfocus;
    @SerializedName("ios-focus-test")
    private List<IosfocustestBean> iosfocustest;
    @SerializedName("ios-start")
    private List<IosstartBean> iosstart;
    @SerializedName("ios-start-test")
    private List<IosstarttestBean> iosstarttest;
    @SerializedName("ipad-start")
    private List<?> ipadstart;

    public List<AndroidstartBean> getAndroidstart() {
        return androidstart;
    }

    public void setAndroidstart(List<AndroidstartBean> androidstart) {
        this.androidstart = androidstart;
    }

    public List<AppfocusBean> getAppfocus() {
        return appfocus;
    }

    public void setAppfocus(List<AppfocusBean> appfocus) {
        this.appfocus = appfocus;
    }

    public List<AppFocusCheckBean> getAppFocusCheck() {
        return appFocusCheck;
    }

    public void setAppFocusCheck(List<AppFocusCheckBean> appFocusCheck) {
        this.appFocusCheck = appFocusCheck;
    }

    public List<IosfocusBean> getIosfocus() {
        return iosfocus;
    }

    public void setIosfocus(List<IosfocusBean> iosfocus) {
        this.iosfocus = iosfocus;
    }

    public List<IosfocustestBean> getIosfocustest() {
        return iosfocustest;
    }

    public void setIosfocustest(List<IosfocustestBean> iosfocustest) {
        this.iosfocustest = iosfocustest;
    }

    public List<IosstartBean> getIosstart() {
        return iosstart;
    }

    public void setIosstart(List<IosstartBean> iosstart) {
        this.iosstart = iosstart;
    }

    public List<IosstarttestBean> getIosstarttest() {
        return iosstarttest;
    }

    public void setIosstarttest(List<IosstarttestBean> iosstarttest) {
        this.iosstarttest = iosstarttest;
    }

    public List<?> getIpadstart() {
        return ipadstart;
    }

    public void setIpadstart(List<?> ipadstart) {
        this.ipadstart = ipadstart;
    }

    public static class AndroidstartBean {
        /**
         * content :
         * create_at : 2016-05-03 22:05:25
         * ext : {"end_time":1490772510,"start_time":1475791200,"time":"3","type":"app"}
         * fk :
         * id : 733
         * link : quanmin://mobile.app/liveroom?live=44397
         * priority : 4
         * slot_id : 111
         * status : 1
         * subtitle :
         * thumb : http://image.quanmin.tv/fac91cad2b69ebddfefe83768d2e9309jpg
         * title : 2017年LPL春季赛
         */

        private String content;
        private String create_at;
        private ExtBean ext;
        private String fk;
        private int id;
        private String link;
        private int priority;
        private int slot_id;
        private int status;
        private String subtitle;
        private String thumb;
        private String title;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreate_at() {
            return create_at;
        }

        public void setCreate_at(String create_at) {
            this.create_at = create_at;
        }

        public ExtBean getExt() {
            return ext;
        }

        public void setExt(ExtBean ext) {
            this.ext = ext;
        }

        public String getFk() {
            return fk;
        }

        public void setFk(String fk) {
            this.fk = fk;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public int getSlot_id() {
            return slot_id;
        }

        public void setSlot_id(int slot_id) {
            this.slot_id = slot_id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
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

        public static class ExtBean {
            /**
             * end_time : 1490772510
             * start_time : 1475791200
             * time : 3
             * type : app
             */

            private int end_time;
            private int start_time;
            private String time;
            private String type;

            public int getEnd_time() {
                return end_time;
            }

            public void setEnd_time(int end_time) {
                this.end_time = end_time;
            }

            public int getStart_time() {
                return start_time;
            }

            public void setStart_time(int start_time) {
                this.start_time = start_time;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }

    public static class AppfocusBean {
        /**
         * ext : {"type":"play"}
         * fk : 1039622
         * link : quanmin://mobile.app/liveroom?live=1039622
         * link_object : {"announcement":"","avatar":"http://image.quanmin.tv/avatar/21ec8bbcc701823b10fa7815dd006cfbjpg?imageView2/2/w/300/","categoryId":"13","category_id":"13","category_name":"全民户外","check":"1","cover":"1039622-1491384742-803.jpg","follow":"323981","hidden":false,"id":"101092","intro":"","landscape":"1","last_play_at":"","love_cover":"http://image.quanmin.tv/love/02d9a6ed8128bc43c531c51656807e24jpg","nick":"全民TV黄老师","no":"1039622","play_at":"2017-04-05 16:24:37","play_status":true,"position":"外太空","priv":"0","recommend_image":"http://image.quanmin.tv/09b20fcf519d00e87f8cc4dbd0e90849jpg","screen":0,"slug":"","source":"ws","start_time":"1491381269.784","status":"2","stream":"http://flv.quanmin.tv/live/1039622_L4.flv","thumb":"","title":"燕郊帝国走一走","uid":"1039622","video":"http://thumb.quanmin.tv/1039622.mp4?t=1491384600","videoQuality":"4","view":"373284","views":"0","weight":"0"}
         * slot_id : 113
         * thumb :
         * title : 燕郊帝国走一走
         */

        private ExtBeanX ext;
        private String fk;
        private String link;
        private LinkObjectBean link_object;
        private int slot_id;
        private String thumb;
        private String title;

        public ExtBeanX getExt() {
            return ext;
        }

        public void setExt(ExtBeanX ext) {
            this.ext = ext;
        }

        public String getFk() {
            return fk;
        }

        public void setFk(String fk) {
            this.fk = fk;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public LinkObjectBean getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObjectBean link_object) {
            this.link_object = link_object;
        }

        public int getSlot_id() {
            return slot_id;
        }

        public void setSlot_id(int slot_id) {
            this.slot_id = slot_id;
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

        public static class ExtBeanX {
            /**
             * type : play
             */

            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class LinkObjectBean {
            /**
             * announcement :
             * avatar : http://image.quanmin.tv/avatar/21ec8bbcc701823b10fa7815dd006cfbjpg?imageView2/2/w/300/
             * categoryId : 13
             * category_id : 13
             * category_name : 全民户外
             * check : 1
             * cover : 1039622-1491384742-803.jpg
             * follow : 323981
             * hidden : false
             * id : 101092
             * intro :
             * landscape : 1
             * last_play_at :
             * love_cover : http://image.quanmin.tv/love/02d9a6ed8128bc43c531c51656807e24jpg
             * nick : 全民TV黄老师
             * no : 1039622
             * play_at : 2017-04-05 16:24:37
             * play_status : true
             * position : 外太空
             * priv : 0
             * recommend_image : http://image.quanmin.tv/09b20fcf519d00e87f8cc4dbd0e90849jpg
             * screen : 0
             * slug :
             * source : ws
             * start_time : 1491381269.784
             * status : 2
             * stream : http://flv.quanmin.tv/live/1039622_L4.flv
             * thumb :
             * title : 燕郊帝国走一走
             * uid : 1039622
             * video : http://thumb.quanmin.tv/1039622.mp4?t=1491384600
             * videoQuality : 4
             * view : 373284
             * views : 0
             * weight : 0
             */

            private String announcement;
            private String avatar;
            private String categoryId;
            private String category_id;
            private String category_name;
            private String check;
            private String cover;
            private String follow;
            private boolean hidden;
            private String id;
            private String intro;
            private String landscape;
            private String last_play_at;
            private String love_cover;
            private String nick;
            private String no;
            private String play_at;
            private boolean play_status;
            private String position;
            private String priv;
            private String recommend_image;
            private int screen;
            private String slug;
            private String source;
            private String start_time;
            private String status;
            private String stream;
            private String thumb;
            private String title;
            private String uid;
            private String video;
            private String videoQuality;
            private String view;
            private String views;
            private String weight;

            public String getAnnouncement() {
                return announcement;
            }

            public void setAnnouncement(String announcement) {
                this.announcement = announcement;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(String categoryId) {
                this.categoryId = categoryId;
            }

            public String getCategory_id() {
                return category_id;
            }

            public void setCategory_id(String category_id) {
                this.category_id = category_id;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getCheck() {
                return check;
            }

            public void setCheck(String check) {
                this.check = check;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getFollow() {
                return follow;
            }

            public void setFollow(String follow) {
                this.follow = follow;
            }

            public boolean isHidden() {
                return hidden;
            }

            public void setHidden(boolean hidden) {
                this.hidden = hidden;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getLandscape() {
                return landscape;
            }

            public void setLandscape(String landscape) {
                this.landscape = landscape;
            }

            public String getLast_play_at() {
                return last_play_at;
            }

            public void setLast_play_at(String last_play_at) {
                this.last_play_at = last_play_at;
            }

            public String getLove_cover() {
                return love_cover;
            }

            public void setLove_cover(String love_cover) {
                this.love_cover = love_cover;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getNo() {
                return no;
            }

            public void setNo(String no) {
                this.no = no;
            }

            public String getPlay_at() {
                return play_at;
            }

            public void setPlay_at(String play_at) {
                this.play_at = play_at;
            }

            public boolean isPlay_status() {
                return play_status;
            }

            public void setPlay_status(boolean play_status) {
                this.play_status = play_status;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getPriv() {
                return priv;
            }

            public void setPriv(String priv) {
                this.priv = priv;
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

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
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

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getVideoQuality() {
                return videoQuality;
            }

            public void setVideoQuality(String videoQuality) {
                this.videoQuality = videoQuality;
            }

            public String getView() {
                return view;
            }

            public void setView(String view) {
                this.view = view;
            }

            public String getViews() {
                return views;
            }

            public void setViews(String views) {
                this.views = views;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }
        }
    }

    public static class AppFocusCheckBean {
        /**
         * content :
         * create_at : 2016-04-29 16:35:02
         * ext : {"type":"play"}
         * fk : 674228
         * id : 621
         * link :
         * link_object : {"announcement":"","app_shuffling_image":"http://image.quanmin.tv/0df3639786d55d5c73cb0822435aae04jpg","avatar":"http://image.quanmin.tv/avatar/530d6327b39ebc3465476c750a2a7214jpg?imageView2/2/w/300/","categoryId":"1","category_id":"1","category_name":"英雄联盟","channelId":"0","check":"1","cover":"674228-1491384722-148.jpg","follow":"366955","hidden":false,"id":"14042","intro":"","landscape":"1","last_play_at":"","nick":"LSPL官方频道","no":"674228","play_at":"2017-04-04 19:09:18","play_status":true,"position":"","priv":"0","recommend_image":"http://image.quanmin.tv/8b5b09ad48de5703910e491ead6b10a2jpg","screen":0,"slug":"lspl","source":"ws","start_time":"1491377607.22","status":"2","stream":"http://flv.quanmin.tv/live/674228_L3.flv","thumb":"http://image.quanmin.tv/aeee5525061499f449348654e76388bejpg","title":"LSPL春季赛SAT vs DS","uid":"674228","video":"http://thumb.quanmin.tv/674228.mp4?t=1491384600","videoQuality":"234","view":"105135","views":"0","weight":"0"}
         * priority : 0
         * slot_id : 153
         * status : 1
         * subtitle :
         * thumb : http://image.quanmin.tv/aeee5525061499f449348654e76388bejpg
         * title : 2016赛季LSPL夏季赛
         */

        private String content;
        private String create_at;
        private ExtBeanXX ext;
        private String fk;
        private int id;
        private String link;
        private LinkObjectBeanX link_object;
        private int priority;
        private int slot_id;
        private int status;
        private String subtitle;
        private String thumb;
        private String title;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreate_at() {
            return create_at;
        }

        public void setCreate_at(String create_at) {
            this.create_at = create_at;
        }

        public ExtBeanXX getExt() {
            return ext;
        }

        public void setExt(ExtBeanXX ext) {
            this.ext = ext;
        }

        public String getFk() {
            return fk;
        }

        public void setFk(String fk) {
            this.fk = fk;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public LinkObjectBeanX getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObjectBeanX link_object) {
            this.link_object = link_object;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public int getSlot_id() {
            return slot_id;
        }

        public void setSlot_id(int slot_id) {
            this.slot_id = slot_id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
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

        public static class ExtBeanXX {
            /**
             * type : play
             */

            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class LinkObjectBeanX {
            /**
             * announcement :
             * app_shuffling_image : http://image.quanmin.tv/0df3639786d55d5c73cb0822435aae04jpg
             * avatar : http://image.quanmin.tv/avatar/530d6327b39ebc3465476c750a2a7214jpg?imageView2/2/w/300/
             * categoryId : 1
             * category_id : 1
             * category_name : 英雄联盟
             * channelId : 0
             * check : 1
             * cover : 674228-1491384722-148.jpg
             * follow : 366955
             * hidden : false
             * id : 14042
             * intro :
             * landscape : 1
             * last_play_at :
             * nick : LSPL官方频道
             * no : 674228
             * play_at : 2017-04-04 19:09:18
             * play_status : true
             * position :
             * priv : 0
             * recommend_image : http://image.quanmin.tv/8b5b09ad48de5703910e491ead6b10a2jpg
             * screen : 0
             * slug : lspl
             * source : ws
             * start_time : 1491377607.22
             * status : 2
             * stream : http://flv.quanmin.tv/live/674228_L3.flv
             * thumb : http://image.quanmin.tv/aeee5525061499f449348654e76388bejpg
             * title : LSPL春季赛SAT vs DS
             * uid : 674228
             * video : http://thumb.quanmin.tv/674228.mp4?t=1491384600
             * videoQuality : 234
             * view : 105135
             * views : 0
             * weight : 0
             */

            private String announcement;
            private String app_shuffling_image;
            private String avatar;
            private String categoryId;
            private String category_id;
            private String category_name;
            private String channelId;
            private String check;
            private String cover;
            private String follow;
            private boolean hidden;
            private String id;
            private String intro;
            private String landscape;
            private String last_play_at;
            private String nick;
            private String no;
            private String play_at;
            private boolean play_status;
            private String position;
            private String priv;
            private String recommend_image;
            private int screen;
            private String slug;
            private String source;
            private String start_time;
            private String status;
            private String stream;
            private String thumb;
            private String title;
            private String uid;
            private String video;
            private String videoQuality;
            private String view;
            private String views;
            private String weight;

            public String getAnnouncement() {
                return announcement;
            }

            public void setAnnouncement(String announcement) {
                this.announcement = announcement;
            }

            public String getApp_shuffling_image() {
                return app_shuffling_image;
            }

            public void setApp_shuffling_image(String app_shuffling_image) {
                this.app_shuffling_image = app_shuffling_image;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(String categoryId) {
                this.categoryId = categoryId;
            }

            public String getCategory_id() {
                return category_id;
            }

            public void setCategory_id(String category_id) {
                this.category_id = category_id;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getChannelId() {
                return channelId;
            }

            public void setChannelId(String channelId) {
                this.channelId = channelId;
            }

            public String getCheck() {
                return check;
            }

            public void setCheck(String check) {
                this.check = check;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getFollow() {
                return follow;
            }

            public void setFollow(String follow) {
                this.follow = follow;
            }

            public boolean isHidden() {
                return hidden;
            }

            public void setHidden(boolean hidden) {
                this.hidden = hidden;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getLandscape() {
                return landscape;
            }

            public void setLandscape(String landscape) {
                this.landscape = landscape;
            }

            public String getLast_play_at() {
                return last_play_at;
            }

            public void setLast_play_at(String last_play_at) {
                this.last_play_at = last_play_at;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getNo() {
                return no;
            }

            public void setNo(String no) {
                this.no = no;
            }

            public String getPlay_at() {
                return play_at;
            }

            public void setPlay_at(String play_at) {
                this.play_at = play_at;
            }

            public boolean isPlay_status() {
                return play_status;
            }

            public void setPlay_status(boolean play_status) {
                this.play_status = play_status;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getPriv() {
                return priv;
            }

            public void setPriv(String priv) {
                this.priv = priv;
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

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
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

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getVideoQuality() {
                return videoQuality;
            }

            public void setVideoQuality(String videoQuality) {
                this.videoQuality = videoQuality;
            }

            public String getView() {
                return view;
            }

            public void setView(String view) {
                this.view = view;
            }

            public String getViews() {
                return views;
            }

            public void setViews(String views) {
                this.views = views;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }
        }
    }

    public static class IosfocusBean {
        /**
         * ext : {"type":"play"}
         * fk : 1039622
         * link : quanmin://mobile.app/liveroom?live=1039622
         * link_object : {"announcement":"","avatar":"http://image.quanmin.tv/avatar/21ec8bbcc701823b10fa7815dd006cfbjpg?imageView2/2/w/300/","categoryId":"13","category_id":"13","category_name":"全民户外","check":"1","cover":"1039622-1491384742-803.jpg","follow":"323981","hidden":false,"id":"101092","intro":"","landscape":"1","last_play_at":"","love_cover":"http://image.quanmin.tv/love/02d9a6ed8128bc43c531c51656807e24jpg","nick":"全民TV黄老师","no":"1039622","play_at":"2017-04-05 16:24:37","play_status":true,"position":"外太空","priv":"0","recommend_image":"http://image.quanmin.tv/09b20fcf519d00e87f8cc4dbd0e90849jpg","screen":0,"slug":"","source":"ws","start_time":"1491381269.784","status":"2","stream":"http://flv.quanmin.tv/live/1039622_L4.flv","thumb":"","title":"燕郊帝国走一走","uid":"1039622","video":"http://thumb.quanmin.tv/1039622.mp4?t=1491384600","videoQuality":"4","view":"373284","views":"0","weight":"0"}
         * slot_id : 165
         * thumb :
         * title : 燕郊帝国走一走
         */

        private ExtBeanXXX ext;
        private String fk;
        private String link;
        private LinkObjectBeanXX link_object;
        private int slot_id;
        private String thumb;
        private String title;

        public ExtBeanXXX getExt() {
            return ext;
        }

        public void setExt(ExtBeanXXX ext) {
            this.ext = ext;
        }

        public String getFk() {
            return fk;
        }

        public void setFk(String fk) {
            this.fk = fk;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public LinkObjectBeanXX getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObjectBeanXX link_object) {
            this.link_object = link_object;
        }

        public int getSlot_id() {
            return slot_id;
        }

        public void setSlot_id(int slot_id) {
            this.slot_id = slot_id;
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

        public static class ExtBeanXXX {
            /**
             * type : play
             */

            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class LinkObjectBeanXX {
            /**
             * announcement :
             * avatar : http://image.quanmin.tv/avatar/21ec8bbcc701823b10fa7815dd006cfbjpg?imageView2/2/w/300/
             * categoryId : 13
             * category_id : 13
             * category_name : 全民户外
             * check : 1
             * cover : 1039622-1491384742-803.jpg
             * follow : 323981
             * hidden : false
             * id : 101092
             * intro :
             * landscape : 1
             * last_play_at :
             * love_cover : http://image.quanmin.tv/love/02d9a6ed8128bc43c531c51656807e24jpg
             * nick : 全民TV黄老师
             * no : 1039622
             * play_at : 2017-04-05 16:24:37
             * play_status : true
             * position : 外太空
             * priv : 0
             * recommend_image : http://image.quanmin.tv/09b20fcf519d00e87f8cc4dbd0e90849jpg
             * screen : 0
             * slug :
             * source : ws
             * start_time : 1491381269.784
             * status : 2
             * stream : http://flv.quanmin.tv/live/1039622_L4.flv
             * thumb :
             * title : 燕郊帝国走一走
             * uid : 1039622
             * video : http://thumb.quanmin.tv/1039622.mp4?t=1491384600
             * videoQuality : 4
             * view : 373284
             * views : 0
             * weight : 0
             */

            private String announcement;
            private String avatar;
            private String categoryId;
            private String category_id;
            private String category_name;
            private String check;
            private String cover;
            private String follow;
            private boolean hidden;
            private String id;
            private String intro;
            private String landscape;
            private String last_play_at;
            private String love_cover;
            private String nick;
            private String no;
            private String play_at;
            private boolean play_status;
            private String position;
            private String priv;
            private String recommend_image;
            private int screen;
            private String slug;
            private String source;
            private String start_time;
            private String status;
            private String stream;
            private String thumb;
            private String title;
            private String uid;
            private String video;
            private String videoQuality;
            private String view;
            private String views;
            private String weight;

            public String getAnnouncement() {
                return announcement;
            }

            public void setAnnouncement(String announcement) {
                this.announcement = announcement;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(String categoryId) {
                this.categoryId = categoryId;
            }

            public String getCategory_id() {
                return category_id;
            }

            public void setCategory_id(String category_id) {
                this.category_id = category_id;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getCheck() {
                return check;
            }

            public void setCheck(String check) {
                this.check = check;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getFollow() {
                return follow;
            }

            public void setFollow(String follow) {
                this.follow = follow;
            }

            public boolean isHidden() {
                return hidden;
            }

            public void setHidden(boolean hidden) {
                this.hidden = hidden;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getLandscape() {
                return landscape;
            }

            public void setLandscape(String landscape) {
                this.landscape = landscape;
            }

            public String getLast_play_at() {
                return last_play_at;
            }

            public void setLast_play_at(String last_play_at) {
                this.last_play_at = last_play_at;
            }

            public String getLove_cover() {
                return love_cover;
            }

            public void setLove_cover(String love_cover) {
                this.love_cover = love_cover;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getNo() {
                return no;
            }

            public void setNo(String no) {
                this.no = no;
            }

            public String getPlay_at() {
                return play_at;
            }

            public void setPlay_at(String play_at) {
                this.play_at = play_at;
            }

            public boolean isPlay_status() {
                return play_status;
            }

            public void setPlay_status(boolean play_status) {
                this.play_status = play_status;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getPriv() {
                return priv;
            }

            public void setPriv(String priv) {
                this.priv = priv;
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

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
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

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getVideoQuality() {
                return videoQuality;
            }

            public void setVideoQuality(String videoQuality) {
                this.videoQuality = videoQuality;
            }

            public String getView() {
                return view;
            }

            public void setView(String view) {
                this.view = view;
            }

            public String getViews() {
                return views;
            }

            public void setViews(String views) {
                this.views = views;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }
        }
    }

    public static class IosfocustestBean {
        /**
         * content :
         * create_at : 2016-06-16 17:04:52
         * ext : {"type":"play"}
         * fk : 326745
         * id : 1549
         * link :
         * link_object : {"announcement":"直播时间，上午9点到下午3点。","app_shuffling_image":"http://image.quanmin.tv/3f727a8ac18a90a42d0de45926b38773jpg","avatar":"http://image.quanmin.tv/avatar/ad569547dfe896f22a7bc5b1d4ecd3d5gif?imageView2/2/w/300/","categoryId":"1","category_id":"1","category_name":"英雄联盟","channelId":"0","check":"1","cover":"326745-1491384723-630.jpg","follow":"274033","hidden":false,"id":"96539","intro":"保持善良 宽容，不忘初心。","landscape":"1","last_play_at":"","nick":"浏阳河长的像猴子","no":"326745","play_at":"2017-04-05 12:06:56","play_status":true,"position":"","priv":"0","recommend_image":"http://image.quanmin.tv/a31d5c90109cec5e0e0a3a267f9fc0f4jpg","screen":0,"slug":"qq312118607","source":"ws","start_time":"1491365216.387","status":"2","stream":"http://flv.quanmin.tv/live/326745_L3.flv","thumb":"http://image.quanmin.tv/289d9855d4b4d39d41c3f454bb775977jpg","title":"国服第一诺克，吃我一记霸天斩。","uid":"326745","video":"http://thumb.quanmin.tv/326745.mp4?t=1491384600","videoQuality":"234","view":"237152","views":"0","weight":"0"}
         * priority : 2
         * slot_id : 237
         * status : 1
         * subtitle :
         * thumb : http://image.quanmin.tv/289d9855d4b4d39d41c3f454bb775977jpg
         * title : 国服第一诺克
         */

        private String content;
        private String create_at;
        private ExtBeanXXXX ext;
        private String fk;
        private int id;
        private String link;
        private LinkObjectBeanXXX link_object;
        private int priority;
        private int slot_id;
        private int status;
        private String subtitle;
        private String thumb;
        private String title;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreate_at() {
            return create_at;
        }

        public void setCreate_at(String create_at) {
            this.create_at = create_at;
        }

        public ExtBeanXXXX getExt() {
            return ext;
        }

        public void setExt(ExtBeanXXXX ext) {
            this.ext = ext;
        }

        public String getFk() {
            return fk;
        }

        public void setFk(String fk) {
            this.fk = fk;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public LinkObjectBeanXXX getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObjectBeanXXX link_object) {
            this.link_object = link_object;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public int getSlot_id() {
            return slot_id;
        }

        public void setSlot_id(int slot_id) {
            this.slot_id = slot_id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
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

        public static class ExtBeanXXXX {
            /**
             * type : play
             */

            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class LinkObjectBeanXXX {
            /**
             * announcement : 直播时间，上午9点到下午3点。
             * app_shuffling_image : http://image.quanmin.tv/3f727a8ac18a90a42d0de45926b38773jpg
             * avatar : http://image.quanmin.tv/avatar/ad569547dfe896f22a7bc5b1d4ecd3d5gif?imageView2/2/w/300/
             * categoryId : 1
             * category_id : 1
             * category_name : 英雄联盟
             * channelId : 0
             * check : 1
             * cover : 326745-1491384723-630.jpg
             * follow : 274033
             * hidden : false
             * id : 96539
             * intro : 保持善良 宽容，不忘初心。
             * landscape : 1
             * last_play_at :
             * nick : 浏阳河长的像猴子
             * no : 326745
             * play_at : 2017-04-05 12:06:56
             * play_status : true
             * position :
             * priv : 0
             * recommend_image : http://image.quanmin.tv/a31d5c90109cec5e0e0a3a267f9fc0f4jpg
             * screen : 0
             * slug : qq312118607
             * source : ws
             * start_time : 1491365216.387
             * status : 2
             * stream : http://flv.quanmin.tv/live/326745_L3.flv
             * thumb : http://image.quanmin.tv/289d9855d4b4d39d41c3f454bb775977jpg
             * title : 国服第一诺克，吃我一记霸天斩。
             * uid : 326745
             * video : http://thumb.quanmin.tv/326745.mp4?t=1491384600
             * videoQuality : 234
             * view : 237152
             * views : 0
             * weight : 0
             */

            private String announcement;
            private String app_shuffling_image;
            private String avatar;
            private String categoryId;
            private String category_id;
            private String category_name;
            private String channelId;
            private String check;
            private String cover;
            private String follow;
            private boolean hidden;
            private String id;
            private String intro;
            private String landscape;
            private String last_play_at;
            private String nick;
            private String no;
            private String play_at;
            private boolean play_status;
            private String position;
            private String priv;
            private String recommend_image;
            private int screen;
            private String slug;
            private String source;
            private String start_time;
            private String status;
            private String stream;
            private String thumb;
            private String title;
            private String uid;
            private String video;
            private String videoQuality;
            private String view;
            private String views;
            private String weight;

            public String getAnnouncement() {
                return announcement;
            }

            public void setAnnouncement(String announcement) {
                this.announcement = announcement;
            }

            public String getApp_shuffling_image() {
                return app_shuffling_image;
            }

            public void setApp_shuffling_image(String app_shuffling_image) {
                this.app_shuffling_image = app_shuffling_image;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(String categoryId) {
                this.categoryId = categoryId;
            }

            public String getCategory_id() {
                return category_id;
            }

            public void setCategory_id(String category_id) {
                this.category_id = category_id;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getChannelId() {
                return channelId;
            }

            public void setChannelId(String channelId) {
                this.channelId = channelId;
            }

            public String getCheck() {
                return check;
            }

            public void setCheck(String check) {
                this.check = check;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getFollow() {
                return follow;
            }

            public void setFollow(String follow) {
                this.follow = follow;
            }

            public boolean isHidden() {
                return hidden;
            }

            public void setHidden(boolean hidden) {
                this.hidden = hidden;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getLandscape() {
                return landscape;
            }

            public void setLandscape(String landscape) {
                this.landscape = landscape;
            }

            public String getLast_play_at() {
                return last_play_at;
            }

            public void setLast_play_at(String last_play_at) {
                this.last_play_at = last_play_at;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getNo() {
                return no;
            }

            public void setNo(String no) {
                this.no = no;
            }

            public String getPlay_at() {
                return play_at;
            }

            public void setPlay_at(String play_at) {
                this.play_at = play_at;
            }

            public boolean isPlay_status() {
                return play_status;
            }

            public void setPlay_status(boolean play_status) {
                this.play_status = play_status;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getPriv() {
                return priv;
            }

            public void setPriv(String priv) {
                this.priv = priv;
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

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
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

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getVideoQuality() {
                return videoQuality;
            }

            public void setVideoQuality(String videoQuality) {
                this.videoQuality = videoQuality;
            }

            public String getView() {
                return view;
            }

            public void setView(String view) {
                this.view = view;
            }

            public String getViews() {
                return views;
            }

            public void setViews(String views) {
                this.views = views;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }
        }
    }

    public static class IosstartBean {
        /**
         * content :
         * create_at : 2016-04-12 12:55:42
         * ext : {"end_time":1490772510,"start_time":1475791200,"time":"3","type":"app"}
         * fk :
         * id : 531
         * link : quanmin://mobile.app/liveroom?live=44397
         * priority : 0
         * slot_id : 112
         * status : 1
         * subtitle :
         * thumb : http://image.quanmin.tv/6836be2de957b56a4d6f2c4732361772jpg
         * title : 2017年LPL春季赛
         */

        private String content;
        private String create_at;
        private ExtBeanXXXXX ext;
        private String fk;
        private int id;
        private String link;
        private int priority;
        private int slot_id;
        private int status;
        private String subtitle;
        private String thumb;
        private String title;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreate_at() {
            return create_at;
        }

        public void setCreate_at(String create_at) {
            this.create_at = create_at;
        }

        public ExtBeanXXXXX getExt() {
            return ext;
        }

        public void setExt(ExtBeanXXXXX ext) {
            this.ext = ext;
        }

        public String getFk() {
            return fk;
        }

        public void setFk(String fk) {
            this.fk = fk;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public int getSlot_id() {
            return slot_id;
        }

        public void setSlot_id(int slot_id) {
            this.slot_id = slot_id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
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

        public static class ExtBeanXXXXX {
            /**
             * end_time : 1490772510
             * start_time : 1475791200
             * time : 3
             * type : app
             */

            private int end_time;
            private int start_time;
            private String time;
            private String type;

            public int getEnd_time() {
                return end_time;
            }

            public void setEnd_time(int end_time) {
                this.end_time = end_time;
            }

            public int getStart_time() {
                return start_time;
            }

            public void setStart_time(int start_time) {
                this.start_time = start_time;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }

    public static class IosstarttestBean {
        /**
         * content :
         * create_at : 2016-09-12 18:49:40
         * ext : {"end_time":1480521600,"start_time":1479263065,"time":"10","type":"html"}
         * fk :
         * id : 1572
         * link : http://m.quanmin.tv/static/v2/m/boot/special/qmsd/join.html?a=123
         * priority : 0
         * slot_id : 236
         * status : 1
         * subtitle :
         * thumb : http://image.quanmin.tv/a082375762e8e7081237261ae4477d0bjpg
         * title : 和TA私奔到月亮
         */

        private String content;
        private String create_at;
        private ExtBeanXXXXXX ext;
        private String fk;
        private int id;
        private String link;
        private int priority;
        private int slot_id;
        private int status;
        private String subtitle;
        private String thumb;
        private String title;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreate_at() {
            return create_at;
        }

        public void setCreate_at(String create_at) {
            this.create_at = create_at;
        }

        public ExtBeanXXXXXX getExt() {
            return ext;
        }

        public void setExt(ExtBeanXXXXXX ext) {
            this.ext = ext;
        }

        public String getFk() {
            return fk;
        }

        public void setFk(String fk) {
            this.fk = fk;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public int getSlot_id() {
            return slot_id;
        }

        public void setSlot_id(int slot_id) {
            this.slot_id = slot_id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
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

        public static class ExtBeanXXXXXX {
            /**
             * end_time : 1480521600
             * start_time : 1479263065
             * time : 10
             * type : html
             */

            private int end_time;
            private int start_time;
            private String time;
            private String type;

            public int getEnd_time() {
                return end_time;
            }

            public void setEnd_time(int end_time) {
                this.end_time = end_time;
            }

            public int getStart_time() {
                return start_time;
            }

            public void setStart_time(int start_time) {
                this.start_time = start_time;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
