package com.autism.globaltv.live.view;

/**
 * Author：i5 on 2017/4/11 10:47
 * Used:GlobalTv
 */
public interface IPlayerLifeCircle {
    void onStartPlay();

    void onStopPlay();

    void onErrorPlay();

    void onReconnect();
}
