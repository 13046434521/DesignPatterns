package com.jtl.designpatterns.singleton;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/25 16:14
 * 描述:静态内部类单例模式
 * 更改:
 */

public class StaticSingleton {

    private StaticSingleton(){}

    private static StaticSingleton getInstance(){
        return StaticSingletonHolder.sSingleton;
    }

    private static class StaticSingletonHolder{
        private static final StaticSingleton sSingleton=new StaticSingleton();
    }
}
