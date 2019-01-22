package com.android.byc.servicebestpractice;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/22 10:04
 * @description
 */
public interface DownloadListener {
    void onProgress(int progress);//通知下载进度
    void onSuccess();//通知下载成功事件
    void onFailed();//通知下载失败事件
    void onPaused();//通知下载暂停事件
    void onCanceled();//通知下载取消事件
}
