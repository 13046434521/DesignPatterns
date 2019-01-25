package com.jtl.designpatterns.singleton;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/25 15:48
 * 描述:恶汉式单例模式
 * 更改:
 */

public class HungrySingleton {
    private static HungrySingleton sSingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return sSingleton;
    }
}
