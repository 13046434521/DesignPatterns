package com.jtl.designpatterns.singleton;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/25 16:16
 * 描述:DCL(Double Check Lock)单例模式
 * 优点:1.在懒汉式的基础上进行了判断，只有在第一次创建实例的时候才会，进行线程同步操作。资源利用率高
 * 缺点:1.高并发情况下会出现问题
 * 2.JDK1.5之前会出现问题。由于Java编译器允许处理器乱序执行，JDK之前JMM中Cache寄存器到主内存回写顺序的规定，可能1-2-3，也可能1-3-2，所以可能JDK1.5之前出现问题
 * (1)给DclSingleton分配内存
 * (2)调用DclSingleton()的构造函数，初始化成员字段;
 * (3)将mSingleton指向分配的内存空间（此时mSingleton不为null）
 */

public class DclSingleton {
    private static DclSingleton mSingleton = null;

    private DclSingleton() {
    }

    public static DclSingleton getInstance() {
        if (mSingleton == null) {
            synchronized (DclSingleton.class) {
                if (mSingleton == null) {
                    mSingleton = new DclSingleton();
                }
            }
        }

        return mSingleton;
    }
}
