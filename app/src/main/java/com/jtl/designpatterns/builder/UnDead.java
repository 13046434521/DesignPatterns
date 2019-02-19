package com.jtl.designpatterns.builder;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/29 20:12
 * 描述:
 * 更改:
 */

public class UnDead extends Charactor {

    @Override
    public void setEthnicity() {
        this.Ethnicity="不死族";
    }

    @Override
    public String toString() {
        return "UnDead{" +
                "name='" + name + '\'' +
                ", Ethnicity='" + Ethnicity + '\'' +
                ", Ability=" + Ability +
                ", age=" + age +
                '}';
    }
}
