package com.jtl.designpatterns.observer.offer;

import java.util.Observable;
import java.util.Observer;

/**
 * 作者:jtl
 * 日期:Created in 2019/2/25 11:02
 * 描述:
 * 更改:
 */

public class Reception implements Observer {
    private String name;
    protected String position;

    public Reception(String name) {
        this.name = name;
    }

    /**
     * 职位
     */
    public void setPosition() {
        this.position = "前台";
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("亲爱的客户"+position+"求职者"+name+"："+arg);
    }
}
