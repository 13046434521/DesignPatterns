package com.jtl.designpatterns.builder;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/29 20:13
 * 描述:Human具体Builder类
 * 更改:
 */

public class HumanBuilder extends Builder {
    private Human mHuman;

    public HumanBuilder(){
        mHuman=new Human();
    }

    @Override
    public Builder setName(String name) {
        mHuman.name=name;
        return this;
    }

    @Override
    public Builder setAge(int age) {
        mHuman.age=age;
        return this;
    }

    @Override
    public Builder setAbility(int Ability) {
        mHuman.Ability=Ability;
        return this;
    }

    @Override
    public Human build() {
        return mHuman;
    }
}
