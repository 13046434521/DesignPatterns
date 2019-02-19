package com.jtl.designpatterns.builder;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/29 20:06
 * 描述:人族
 * 更改:
 */

public class Human extends Charactor{
    protected Human(){
    }

    @Override
    protected void setEthnicity() {
        this.Ethnicity="人族";
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", Ethnicity='" + Ethnicity + '\'' +
                ", Ability=" + Ability +
                ", age=" + age +
                '}';
    }
}
