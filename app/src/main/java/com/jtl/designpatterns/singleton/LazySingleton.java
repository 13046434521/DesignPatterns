package com.jtl.designpatterns.singleton;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/25 15:45
 * 描述:懒汉式单例模式
 * 更改:
 */

public class LazySingleton {
    private static LazySingleton sSingleton;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if (sSingleton==null){
            sSingleton=new LazySingleton();
        }

        return sSingleton;
    }
}
