package com.autism.baselibs.http.rx;

public class ResultBean<T> {

    /**
     * 接口正常
     */
    public static final int RESULT_CODE_SUCCESS = 0;
    /**
     * 网络异常
     */
    public static final int RESULT_CODE_NET_ERROR = 111;
    /**
     * 服务器错误
     */
    public static final int RESULT_CODE_SERVER_ERROR = -1;
    /**
     * 用户被挤掉
     */
    public static final int RESULT_CODE_OTHER_LOGIN = 402;
    /**
     * token过期状态
     */
    public static final int RESULT_CODE_NO_LOGIN = 403;
    /**
     * 资源没有发现
     */
    public static final int RESULT_CODE_NO_FOUND = 404;

    private int code;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
