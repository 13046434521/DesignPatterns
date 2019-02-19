package com.jtl.designpatterns.singleton;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/25 16:14
 * 描述:静态内部类单例模式
 * 优点:1.保证了线程安全问题,也能保证单例的唯一性（推荐）
 * 缺点:
 */

public class StaticSingleton {
    private StaticSingleton() {
    }

    private static StaticSingleton getInstance() {
        return StaticSingletonHolder.sSingleton;
    }

    private static class StaticSingletonHolder {
        private static final StaticSingleton sSingleton = new StaticSingleton();
    }
}
