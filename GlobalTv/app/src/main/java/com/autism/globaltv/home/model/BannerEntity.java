package com.autism.globaltv.home.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Author：i5 on 2017/4/5 17:32
 * Used:GlobalTv
 */
public class BannerEntity {


    @SerializedName("ios-focus")
    private List<IosfocusBean> iosfocus;
    @SerializedName("android-focus")
    private List<AndroidfocusBean> androidfocus;
    @SerializedName("launch-image")
    private List<?> launchimage;
    @SerializedName("ios-launch-image")
    private List<?> ioslaunchimage;
    @SerializedName("android-launch-image")
    private List<?> androidlaunchimage;

    public List<IosfocusBean> getIosfocus() {
        return iosfocus;
    }

    public void setIosfocus(List<IosfocusBean> iosfocus) {
        this.iosfocus = iosfocus;
    }

    public List<AndroidfocusBean> getAndroidfocus() {
        return androidfocus;
    }

    public void setAndroidfocus(List<AndroidfocusBean> androidfocus) {
        this.androidfocus = androidfocus;
    }

    public List<?> getLaunchimage() {
        return launchimage;
    }

    public void setLaunchimage(List<?> launchimage) {
        this.launchimage = launchimage;
    }

    public List<?> getIoslaunchimage() {
        return ioslaunchimage;
    }

    public void setIoslaunchimage(List<?> ioslaunchimage) {
        this.ioslaunchimage = ioslaunchimage;
    }

    public List<?> getAndroidlaunchimage() {
        return androidlaunchimage;
    }

    public void setAndroidlaunchimage(List<?> androidlaunchimage) {
        this.androidlaunchimage = androidlaunchimage;
    }

    public static class IosfocusBean {
        /**
         * title :
         * thumb : http://uimg.quanmin.tv/1491786975/6dc7b.jpg
         * type : play
         * link :
         * uid : 7085077
         * ext : {"type":"play"}
         * link_object : {"no":"7085077","nick":"江二图","avatar":"http://a.img.shouyintv.cn/f5ip101-normal","follow":"44946","uid":"7085077","play_at":"2017-04-10 08:51:15","screen":0,"views":"0","intro":"","videoQuality":"","thumb":"http://snap.quanmin.tv/7085077-1491788754-311.jpg?imageView2/2/w/390/","stream":"http://flv.quanmin.tv/live/7085077.flv","position":"安阳市","announcement":"直播时间早7午4，Q群600932729","id":"65867","video":"http://thumb.quanmin.tv/7085077.mp4?t=1491788700","slug":"yy36579","category_id":"26","cover":"7085077-1491788754-311.jpg","status":"2","recommend_image":"","weight":"0","start_time":"1491785475.32","check":"1","priv":"0","category_name":"穿越火线","title":"超低价英雄武器，免费代打季胜场。","source":"ws","last_play_at":"","landscape":"1","view":"27540","love_cover":"http://image.quanmin.tv/love/29433e2e3fe95471ed4ceb3ffa8e42d9jpg","categoryId":"26","hidden":false,"play_status":true}
         */

        private String title;
        private String thumb;
        private String type;
        private String link;
        private String uid;
        private ExtBean ext;
        private LinkObjectBean link_object;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public ExtBean getExt() {
            return ext;
        }

        public void setExt(ExtBean ext) {
            this.ext = ext;
        }

        public LinkObjectBean getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObjectBean link_object) {
            this.link_object = link_object;
        }

        public static class ExtBean {
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
             * no : 7085077
             * nick : 江二图
             * avatar : http://a.img.shouyintv.cn/f5ip101-normal
             * follow : 44946
             * uid : 7085077
             * play_at : 2017-04-10 08:51:15
             * screen : 0
             * views : 0
             * intro :
             * videoQuality :
             * thumb : http://snap.quanmin.tv/7085077-1491788754-311.jpg?imageView2/2/w/390/
             * stream : http://flv.quanmin.tv/live/7085077.flv
             * position : 安阳市
             * announcement : 直播时间早7午4，Q群600932729
             * id : 65867
             * video : http://thumb.quanmin.tv/7085077.mp4?t=1491788700
             * slug : yy36579
             * category_id : 26
             * cover : 7085077-1491788754-311.jpg
             * status : 2
             * recommend_image :
             * weight : 0
             * start_time : 1491785475.32
             * check : 1
             * priv : 0
             * category_name : 穿越火线
             * title : 超低价英雄武器，免费代打季胜场。
             * source : ws
             * last_play_at :
             * landscape : 1
             * view : 27540
             * love_cover : http://image.quanmin.tv/love/29433e2e3fe95471ed4ceb3ffa8e42d9jpg
             * categoryId : 26
             * hidden : false
             * play_status : true
             */

            private String no;
            private String nick;
            private String avatar;
            private String follow;
            private String uid;
            private String play_at;
            private int screen;
            private String views;
            private String intro;
            private String videoQuality;
            private String thumb;
            private String stream;
            private String position;
            private String announcement;
            private String id;
            private String video;
            private String slug;
            private String category_id;
            private String cover;
            private String status;
            private String recommend_image;
            private String weight;
            private String start_time;
            private String check;
            private String priv;
            private String category_name;
            private String title;
            private String source;
            private String last_play_at;
            private String landscape;
            private String view;
            private String love_cover;
            private String categoryId;
            private boolean hidden;
            private boolean play_status;

            public String getNo() {
                return no;
            }

            public void setNo(String no) {
                this.no = no;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getFollow() {
                return follow;
            }

            public void setFollow(String follow) {
                this.follow = follow;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getPlay_at() {
                return play_at;
            }

            public void setPlay_at(String play_at) {
                this.play_at = play_at;
            }

            public int getScreen() {
                return screen;
            }

            public void setScreen(int screen) {
                this.screen = screen;
            }

            public String getViews() {
                return views;
            }

            public void setViews(String views) {
                this.views = views;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getVideoQuality() {
                return videoQuality;
            }

            public void setVideoQuality(String videoQuality) {
                this.videoQuality = videoQuality;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public String getStream() {
                return stream;
            }

            public void setStream(String stream) {
                this.stream = stream;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getAnnouncement() {
                return announcement;
            }

            public void setAnnouncement(String announcement) {
                this.announcement = announcement;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getCategory_id() {
                return category_id;
            }

            public void setCategory_id(String category_id) {
                this.category_id = category_id;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getRecommend_image() {
                return recommend_image;
            }

            public void setRecommend_image(String recommend_image) {
                this.recommend_image = recommend_image;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getCheck() {
                return check;
            }

            public void setCheck(String check) {
                this.check = check;
            }

            public String getPriv() {
                return priv;
            }

            public void setPriv(String priv) {
                this.priv = priv;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getLast_play_at() {
                return last_play_at;
            }

            public void setLast_play_at(String last_play_at) {
                this.last_play_at = last_play_at;
            }

            public String getLandscape() {
                return landscape;
            }

            public void setLandscape(String landscape) {
                this.landscape = landscape;
            }

            public String getView() {
                return view;
            }

            public void setView(String view) {
                this.view = view;
            }

            public String getLove_cover() {
                return love_cover;
            }

            public void setLove_cover(String love_cover) {
                this.love_cover = love_cover;
            }

            public String getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(String categoryId) {
                this.categoryId = categoryId;
            }

            public boolean isHidden() {
                return hidden;
            }

            public void setHidden(boolean hidden) {
                this.hidden = hidden;
            }

            public boolean isPlay_status() {
                return play_status;
            }

            public void setPlay_status(boolean play_status) {
                this.play_status = play_status;
            }
        }
    }

    public static class AndroidfocusBean {
        /**
         * title :
         * thumb : http://uimg.quanmin.tv/1491786962/6dc7b.jpg
         * type : play
         * link :
         * uid : 7085077
         * ext : {"type":"play"}
         * link_object : {"no":"7085077","nick":"江二图","avatar":"http://a.img.shouyintv.cn/f5ip101-normal","follow":"44946","uid":"7085077","play_at":"2017-04-10 08:51:15","screen":0,"views":"0","intro":"","videoQuality":"","thumb":"http://snap.quanmin.tv/7085077-1491788754-311.jpg?imageView2/2/w/390/","stream":"http://flv.quanmin.tv/live/7085077.flv","position":"安阳市","announcement":"直播时间早7午4，Q群600932729","id":"65867","video":"http://thumb.quanmin.tv/7085077.mp4?t=1491788700","slug":"yy36579","category_id":"26","cover":"7085077-1491788754-311.jpg","status":"2","recommend_image":"","weight":"0","start_time":"1491785475.32","check":"1","priv":"0","category_name":"穿越火线","title":"超低价英雄武器，免费代打季胜场。","source":"ws","last_play_at":"","landscape":"1","view":"27540","love_cover":"http://image.quanmin.tv/love/29433e2e3fe95471ed4ceb3ffa8e42d9jpg","categoryId":"26","hidden":false,"play_status":true}
         */

        private String title;
        private String thumb;
        private String type;
        private String link;
        private String uid;
        private ExtBeanX ext;
        private LinkObjectBeanX link_object;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public ExtBeanX getExt() {
            return ext;
        }

        public void setExt(ExtBeanX ext) {
            this.ext = ext;
        }

        public LinkObjectBeanX getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObjectBeanX link_object) {
            this.link_object = link_object;
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

        public static class LinkObjectBeanX {
            /**
             * no : 7085077
             * nick : 江二图
             * avatar : http://a.img.shouyintv.cn/f5ip101-normal
             * follow : 44946
             * uid : 7085077
             * play_at : 2017-04-10 08:51:15
             * screen : 0
             * views : 0
             * intro :
             * videoQuality :
             * thumb : http://snap.quanmin.tv/7085077-1491788754-311.jpg?imageView2/2/w/390/
             * stream : http://flv.quanmin.tv/live/7085077.flv
             * position : 安阳市
             * announcement : 直播时间早7午4，Q群600932729
             * id : 65867
             * video : http://thumb.quanmin.tv/7085077.mp4?t=1491788700
             * slug : yy36579
             * category_id : 26
             * cover : 7085077-1491788754-311.jpg
             * status : 2
             * recommend_image :
             * weight : 0
             * start_time : 1491785475.32
             * check : 1
             * priv : 0
             * category_name : 穿越火线
             * title : 超低价英雄武器，免费代打季胜场。
             * source : ws
             * last_play_at :
             * landscape : 1
             * view : 27540
             * love_cover : http://image.quanmin.tv/love/29433e2e3fe95471ed4ceb3ffa8e42d9jpg
             * categoryId : 26
             * hidden : false
             * play_status : true
             */

            private String no;
            private String nick;
            private String avatar;
            private String follow;
            private String uid;
            private String play_at;
            private int screen;
            private String views;
            private String intro;
            private String videoQuality;
            private String thumb;
            private String stream;
            private String position;
            private String announcement;
            private String id;
            private String video;
            private String slug;
            private String category_id;
            private String cover;
            private String status;
            private String recommend_image;
            private String weight;
            private String start_time;
            private String check;
            private String priv;
            private String category_name;
            private String title;
            private String source;
            private String last_play_at;
            private String landscape;
            private String view;
            private String love_cover;
            private String categoryId;
            private boolean hidden;
            private boolean play_status;

            public String getNo() {
                return no;
            }

            public void setNo(String no) {
                this.no = no;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getFollow() {
                return follow;
            }

            public void setFollow(String follow) {
                this.follow = follow;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getPlay_at() {
                return play_at;
            }

            public void setPlay_at(String play_at) {
                this.play_at = play_at;
            }

            public int getScreen() {
                return screen;
            }

            public void setScreen(int screen) {
                this.screen = screen;
            }

            public String getViews() {
                return views;
            }

            public void setViews(String views) {
                this.views = views;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getVideoQuality() {
                return videoQuality;
            }

            public void setVideoQuality(String videoQuality) {
                this.videoQuality = videoQuality;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public String getStream() {
                return stream;
            }

            public void setStream(String stream) {
                this.stream = stream;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getAnnouncement() {
                return announcement;
            }

            public void setAnnouncement(String announcement) {
                this.announcement = announcement;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getCategory_id() {
                return category_id;
            }

            public void setCategory_id(String category_id) {
                this.category_id = category_id;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getRecommend_image() {
                return recommend_image;
            }

            public void setRecommend_image(String recommend_image) {
                this.recommend_image = recommend_image;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getCheck() {
                return check;
            }

            public void setCheck(String check) {
                this.check = check;
            }

            public String getPriv() {
                return priv;
            }

            public void setPriv(String priv) {
                this.priv = priv;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getLast_play_at() {
                return last_play_at;
            }

            public void setLast_play_at(String last_play_at) {
                this.last_play_at = last_play_at;
            }

            public String getLandscape() {
                return landscape;
            }

            public void setLandscape(String landscape) {
                this.landscape = landscape;
            }

            public String getView() {
                return view;
            }

            public void setView(String view) {
                this.view = view;
            }

            public String getLove_cover() {
                return love_cover;
            }

            public void setLove_cover(String love_cover) {
                this.love_cover = love_cover;
            }

            public String getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(String categoryId) {
                this.categoryId = categoryId;
            }

            public boolean isHidden() {
                return hidden;
            }

            public void setHidden(boolean hidden) {
                this.hidden = hidden;
            }

            public boolean isPlay_status() {
                return play_status;
            }

            public void setPlay_status(boolean play_status) {
                this.play_status = play_status;
            }
        }
    }
}
