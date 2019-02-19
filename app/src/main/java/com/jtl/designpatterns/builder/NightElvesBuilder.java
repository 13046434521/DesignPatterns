package com.jtl.designpatterns.builder;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/29 20:13
 * 描述:NightElves具体Builder类
 * 更改:
 */

public class NightElvesBuilder extends Builder {
    private NightElves mNightElves;

    public NightElvesBuilder(){
        mNightElves=new NightElves();
    }

    @Override
    public Builder setName(String name) {
        mNightElves.name=name;
        return this;
    }

    @Override
    public Builder setAge(int age) {
        mNightElves.age=age;
        return this;
    }

    @Override
    public Builder setAbility(int Ability) {
        mNightElves.Ability=Ability;
        return this;
    }

    @Override
    public NightElves build() {
        return mNightElves;
    }
}
