package com.jtl.designpatterns.singleton;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/25 15:48
 * 描述:饿汉式单例模式
 * 优点:1.空间换时间，每次都直接加载，节约了创建实例的时间
 * 缺点:1.因为不管是否用到了该类，都会直接创建实例，所以在不使用的情况下，就浪费了空间
 */

public class HungrySingleton {
    private static HungrySingleton sSingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return sSingleton;
    }
}
