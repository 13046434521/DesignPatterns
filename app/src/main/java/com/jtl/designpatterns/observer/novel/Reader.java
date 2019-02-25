package com.jtl.designpatterns.observer.novel;

import com.socks.library.KLog;

import java.util.Observable;
import java.util.Observer;

/**
 * 作者:jtl
 * 日期:Created in 2019/2/22 11:56
 * 描述:读者（观察者）
 * 更改:
 */

public class Reader implements Observer {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("尊敬的用户"+name+":"+arg);
    }

    @Override
    public String toString() {
        return "读者："+name;
    }
}
