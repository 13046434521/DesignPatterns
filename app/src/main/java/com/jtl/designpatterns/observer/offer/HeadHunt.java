package com.jtl.designpatterns.observer.offer;

import android.text.TextUtils;

import java.util.Observable;

/**
 * 作者:jtl
 * 日期:Created in 2019/2/22 17:04
 * 描述:猎头（被观察者）
 * 更改:
 */

public class HeadHunt extends Observable{
    /**
     * 发布职位
     * @param content
     */
    public void releaseJob(String content){

        setChanged();
        notifyObservers(content);
    }
}
