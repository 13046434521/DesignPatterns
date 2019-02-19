package com.jtl.designpatterns.builder;

/**
 * 作者:jtl
 * 日期:Created in 2019/1/29 18:15
 * 描述:抽象Product
 * 更改:
 */

public abstract class Charactor {
    protected String name;//名字
    protected String Ethnicity;//种族
    protected int Ability;//能力值
    protected int age;
    protected Charactor(){}
    protected abstract void setEthnicity();
}
