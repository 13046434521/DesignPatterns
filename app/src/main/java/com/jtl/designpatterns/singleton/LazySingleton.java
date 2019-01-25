package com.jtl.designpatterns.singleton;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/25 15:45
 * 描述:懒汉式单例模式
 * 优点:1.时间换空间，在调用的时候才创建实例，节约了空间
 *      2.每次getInstance的时候才创建实例,节约了资源
 *
 * 缺点:1.每次在调用的时候才创建实例，有点浪费时间
 *      2.每次调用getInstance都需要线程同步，造成不必要的开销
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
