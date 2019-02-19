package com.jtl.designpatterns.builder;

import android.os.Build;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/29 18:15
 * 描述:抽象Builder
 * 更改:
 */

public abstract class Builder {
    public abstract Builder setName(String name);
    public abstract Builder setAge(int age);
    public abstract Builder setAbility(int Ability);
    public abstract Charactor build();
}
