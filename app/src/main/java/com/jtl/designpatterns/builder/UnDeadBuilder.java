package com.jtl.designpatterns.builder;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/29 20:13
 * 描述:UnDead具体Builder类
 * 更改:
 */

public class UnDeadBuilder extends Builder {
    private UnDead mUnDead;

    public UnDeadBuilder(){
        mUnDead=new UnDead();
    }

    @Override
    public Builder setName(String name) {
        mUnDead.name=name;
        return this;
    }

    @Override
    public Builder setAge(int age) {
        mUnDead.age=age;
        return this;
    }

    @Override
    public Builder setAbility(int Ability) {
        mUnDead.Ability=Ability;
        return this;
    }

    public UnDead build() {
        return mUnDead;
    }
}
