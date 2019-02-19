package com.jtl.designpatterns.builder;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/29 20:13
 * 描述:Orc具体Builder类
 * 更改:
 */

public class OrcBuilder extends Builder {
    private Orc mOrc;

    public OrcBuilder(){
        mOrc=new Orc();
    }

    @Override
    public Builder setName(String name) {
        mOrc.name=name;
        return this;
    }

    @Override
    public Builder setAge(int age) {
        mOrc.age=age;
        return this;
    }

    @Override
    public Builder setAbility(int Ability) {
        mOrc.Ability=Ability;
        return this;
    }

    public Orc build() {
        return mOrc;
    }
}
