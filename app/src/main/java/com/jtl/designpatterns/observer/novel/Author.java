package com.jtl.designpatterns.observer.novel;

import java.util.Observable;

/**
 * 作者:jtl
 * 日期:Created in 2019/2/22 11:24
 * 描述:起点作者耳根（被观察者）
 * 更改:
 */

public class Author extends Observable {

    /**
     * 小说更新
     * @param content
     */
    public void upDateNovel(String content){
        setChanged();
        notifyObservers(content);
    }
}
