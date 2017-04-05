package com.autism.baselibs.http;


public class StatusCode {

    public static final int CODE_PHONE_NOT_EXIST     = 1001;//用户不存在
    public static final int CODE_PASSWORD_ERR        = 1002;//密码错误
    public static final int CODE_SMS_CODE_INVALID    = 1003;//无效验证码
    public static final int CODE_WEIXIN_CODE_INVALID = 1004;//无效微信code
    public static final int CODE_PHONE_EXIST         = 1005;//手机号已存在
    public static final int CODE_HAS_SIGNED          = 1006;//重复签到
    public static final int CODE_COUPON_HAS_END      = 1007;//优惠券领取活动已结束
    public static final int CODE_COUPON_NOT_ENOUGH   = 1008;//没有足够的优惠券
    public static final int CODE_COUPON_HAS_GET      = 1009;//优惠券已领取
    public static final int CODE_IDENTITY_OVER_TOP   = 1010;//实名认证已达上限
    public static final int CODE_COUPON_HAS_REMIND   = 1011;//优惠券已设置提醒
    public static final int CODE_COLLECT_REPEAT      = 1012;//重复收藏
    public static final int CODE_FOLLOW_REPEAT       = 1013;//重复关注
    public static final int CODE_DATA_DISABLE        = 1014;//数据未启用
    public static final int CODE_IDENTITY_ERROR_INFO = 1015;//实名认证信息错误
    public static final int CODE_TIME_NOT_REACHED    = 1016;//优惠券未到开抢时间
}
