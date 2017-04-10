package com.autism.globaltv.live.pre;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.PowerManager;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.autism.baselibs.utils.LogUtil;
import com.pili.pldroid.player.AVOptions;
import com.pili.pldroid.player.PLMediaPlayer;

import java.io.IOException;


/**
 * Author：i5 on 2017/4/10 15:17
 * Used:GlobalTv
 */
public class LivePlayerController implements SurfaceHolder.Callback, PLMediaPlayer.OnPreparedListener, PLMediaPlayer.OnVideoSizeChangedListener, PLMediaPlayer.OnCompletionListener, PLMediaPlayer.OnErrorListener, PLMediaPlayer.OnInfoListener, PLMediaPlayer.OnBufferingUpdateListener {
    private final SurfaceView mSurfaceView;
    private final Activity mAct;
    private int mSurfaceHeight;
    private int mSurfaceWidth;
    private PLMediaPlayer mMediaPlayer;
    private static final String TAG = LivePlayerController.class.getSimpleName();
    private AVOptions mAVOptions;
    public final static int MEDIA_CODEC_SW_DECODE = 0;
    public final static int MEDIA_CODEC_HW_DECODE = 1;
    public final static int MEDIA_CODEC_AUTO = 2;
    private boolean isNeedReconnect;

    public LivePlayerController(Activity mActivity, SurfaceView mSurFacerView, int codec) {
        this.mSurfaceView = mSurFacerView;
        this.mAct = mActivity;
        mSurFacerView.getHolder().addCallback(this);
        mAVOptions = new AVOptions();
        AVOptions options = new AVOptions();

        // 解码方式:
        // codec＝AVOptions.MEDIA_CODEC_HW_DECODE，硬解
        // codec=AVOptions.MEDIA_CODEC_SW_DECODE, 软解
        // codec=AVOptions.MEDIA_CODEC_AUTO, 硬解优先，失败后自动切换到软解
        // 默认值是：MEDIA_CODEC_SW_DECODE
        options.setInteger(AVOptions.KEY_MEDIACODEC, codec);

        // 准备超时时间，包括创建资源、建立连接、请求码流等，单位是 ms
        // 默认值是：无
        options.setInteger(AVOptions.KEY_PREPARE_TIMEOUT, 10 * 1000);

        // 读取视频流超时时间，单位是 ms
        // 默认值是：10 * 1000
        options.setInteger(AVOptions.KEY_GET_AV_FRAME_TIMEOUT, 10 * 1000);

        // 当前播放的是否为在线直播，如果是，则底层会有一些播放优化
        // 默认值是：0
        options.setInteger(AVOptions.KEY_LIVE_STREAMING, 1);

        // 是否开启"延时优化"，只在在线直播流中有效
        // 默认值是：0
        options.setInteger(AVOptions.KEY_DELAY_OPTIMIZATION, 1);

        // 默认的缓存大小，单位是 ms
        // 默认值是：2000
        options.setInteger(AVOptions.KEY_CACHE_BUFFER_DURATION, 2000);

        // 最大的缓存大小，单位是 ms
        // 默认值是：4000
        options.setInteger(AVOptions.KEY_MAX_CACHE_BUFFER_DURATION, 4000);

        // 是否自动启动播放，如果设置为 1，则在调用 `prepareAsync` 或者 `setVideoPath` 之后自动启动播放，无需调用 `start()`
        // 默认值是：1
        options.setInteger(AVOptions.KEY_START_ON_PREPARED, 1);
        AudioManager audioManager = (AudioManager) mActivity.getSystemService(Context.AUDIO_SERVICE);
        audioManager.requestAudioFocus(null, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        prepare();
    }


    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        mSurfaceWidth = width;
        mSurfaceHeight = height;
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    private void prepare() {
        if (mMediaPlayer != null) {
            mMediaPlayer.setDisplay(mSurfaceView.getHolder());
            return;
        }
        mMediaPlayer = new PLMediaPlayer(mAct, mAVOptions);
        mMediaPlayer.setOnPreparedListener(this);
        mMediaPlayer.setOnVideoSizeChangedListener(this);
        mMediaPlayer.setOnCompletionListener(this);
        mMediaPlayer.setOnErrorListener(this);
        mMediaPlayer.setOnInfoListener(this);
        mMediaPlayer.setOnBufferingUpdateListener(this);
        mMediaPlayer.setWakeMode(mAct, PowerManager.PARTIAL_WAKE_LOCK);
    }

    /**
     * 设置播放源
     *
     * @param mVideoPath
     */
    public void setDataResUrl(String mVideoPath) {
        try {
            mMediaPlayer.setDataSource(mVideoPath);
            mMediaPlayer.setDisplay(mSurfaceView.getHolder());
            mMediaPlayer.prepareAsync();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 播放器准备的监听
     *
     * @param plMediaPlayer
     */
    @Override
    public void onPrepared(PLMediaPlayer plMediaPlayer) {
        mMediaPlayer.start();
    }

    /**
     * 视频流大小变化
     *
     * @param plMediaPlayer
     * @param i
     * @param i1
     */
    @Override
    public void onVideoSizeChanged(PLMediaPlayer plMediaPlayer, int i, int i1) {
        LogUtil.d(TAG, i + " " + i1);
    }

    /**
     * 视频播放完毕监听
     *
     * @param plMediaPlayer
     */
    @Override
    public void onCompletion(PLMediaPlayer plMediaPlayer) {
        mMediaPlayer.stop();
    }

    /**
     * 播放异常监听
     *
     * @param plMediaPlayer
     * @param errorCode
     * @return
     */
    @Override
    public boolean onError(PLMediaPlayer plMediaPlayer, int errorCode) {
        switch (errorCode) {
            case PLMediaPlayer.ERROR_CODE_INVALID_URI:
                showToastTips("Invalid URL !");
                break;
            case PLMediaPlayer.ERROR_CODE_404_NOT_FOUND:
                showToastTips("404 resource not found !");
                break;
            case PLMediaPlayer.ERROR_CODE_CONNECTION_REFUSED:
                showToastTips("Connection refused !");
                break;
            case PLMediaPlayer.ERROR_CODE_CONNECTION_TIMEOUT:
                showToastTips("Connection timeout !");
                isNeedReconnect = true;
                break;
            case PLMediaPlayer.ERROR_CODE_EMPTY_PLAYLIST:
                showToastTips("Empty playlist !");
                break;
            case PLMediaPlayer.ERROR_CODE_STREAM_DISCONNECTED:
                showToastTips("Stream disconnected !");
                isNeedReconnect = true;
                break;
            case PLMediaPlayer.ERROR_CODE_IO_ERROR:
                showToastTips("Network IO Error !");
                isNeedReconnect = true;
                break;
            case PLMediaPlayer.ERROR_CODE_UNAUTHORIZED:
                showToastTips("Unauthorized Error !");
                break;
            case PLMediaPlayer.ERROR_CODE_PREPARE_TIMEOUT:
                showToastTips("Prepare timeout !");
                isNeedReconnect = true;
                break;
            case PLMediaPlayer.ERROR_CODE_READ_FRAME_TIMEOUT:
                showToastTips("Read frame timeout !");
                isNeedReconnect = true;
                break;
            case PLMediaPlayer.MEDIA_ERROR_UNKNOWN:
                break;
            default:
                showToastTips("unknown error !");
                break;
        }
        if (isNeedReconnect) {
            prepare();
        } else {
            release();
        }
        return false;
    }

    private void showToastTips(String msg) {
        LogUtil.i(TAG, msg);
    }

    /**
     * 播放信息监听
     *
     * @param plMediaPlayer
     * @param i
     * @param i1
     * @return
     */
    @Override
    public boolean onInfo(PLMediaPlayer plMediaPlayer, int i, int i1) {
        return false;
    }

    /**
     * 容器更新流
     *
     * @param plMediaPlayer
     * @param i
     */
    @Override
    public void onBufferingUpdate(PLMediaPlayer plMediaPlayer, int i) {
        LogUtil.d(TAG, i + "");
    }

    /**
     * 释放资源
     */
    public void release() {
        if (mMediaPlayer != null) {
            mMediaPlayer.stop();
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
        if (mSurfaceView.getHolder() != null) {
            mSurfaceView.getHolder().removeCallback(this);
        }
        AudioManager audioManager = (AudioManager) mAct.getSystemService(Context.AUDIO_SERVICE);
        audioManager.abandonAudioFocus(null);
    }
}
