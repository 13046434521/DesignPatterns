package com.jtl.designpatterns.observer.offer;

/**
 * 作者:jtl
 * 日期:Created in 2019/2/25 10:57
 * 描述:
 * 更改:
 */

public class AndroidProgramer extends Programer{
    public AndroidProgramer(String name) {
        super(name);
    }

    @Override
    public void setPosition() {
        this.position="Android工程师";
    }
}
