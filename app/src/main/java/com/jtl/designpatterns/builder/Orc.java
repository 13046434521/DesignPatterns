package com.jtl.designpatterns.builder;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/29 20:09
 * 描述:
 * 更改:
 */

public class Orc extends Charactor {
    @Override
    public void setEthnicity() {
        this.Ethnicity="兽族";
    }

    @Override
    public String toString() {
        return "Orc{" +
                "name='" + name + '\'' +
                ", Ethnicity='" + Ethnicity + '\'' +
                ", Ability=" + Ability +
                ", age=" + age +
                '}';
    }
}
