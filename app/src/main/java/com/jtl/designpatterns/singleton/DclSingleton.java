package com.jtl.designpatterns.singleton;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/25 16:16
 * 描述:DCL(Double Check Lock)单例模式
 * 更改:
 */

public class DclSingleton {
    private static DclSingleton mSingleton=null;
    private DclSingleton(){}

    public static DclSingleton getInstance(){
        if (mSingleton==null){
            synchronized (DclSingleton.class){
                if (mSingleton==null){
                    mSingleton=new DclSingleton();
                }
            }
        }

        return mSingleton;
    }
}
