package com.jtl.designpatterns.builder;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/29 20:10
 * 描述:
 * 更改:
 */

public class NightElves extends Charactor{
    @Override
    public void setEthnicity() {
        this.Ethnicity="暗夜精灵";
    }

    @Override
    public String toString() {
        return "NightElves{" +
                "name='" + name + '\'' +
                ", Ethnicity='" + Ethnicity + '\'' +
                ", Ability=" + Ability +
                ", age=" + age +
                '}';
    }
}
