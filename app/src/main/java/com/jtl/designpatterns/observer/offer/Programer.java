package com.jtl.designpatterns.observer.offer;

import java.util.Observable;
import java.util.Observer;

/**
 * 作者:jtl
 * 日期:Created in 2019/2/22 16:27
 * 描述:程序员（观察者）
 * 更改:
 */

public class Programer implements Observer{
    private String name;
    private String position;

    public Programer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("亲爱的客户"+position+"求职者"+name+"："+arg);
    }
}
