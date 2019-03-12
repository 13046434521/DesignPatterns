package com.jtl.designpatterns.observer.offer;

/**
 * 作者:jtl
 * 日期:Created in 2019/2/25 10:59
 * 描述:
 * 更改:
 */

public class JniProgramer extends Programer{
    public JniProgramer(String name) {
        super(name);
    }

    @Override
    public void setPosition() {
        this.position="Jni工程师";
    }
}
