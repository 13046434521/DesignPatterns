package com.jtl.designpatterns;

import com.jtl.designpatterns.builder.Person;

import org.junit.Test;

/**
 * 作者:jtl
 * 日期:Created in 2019/3/12 15:39
 * 描述:
 * 更改:
 */
public class BuilderTest {
    private Person mPerson;
    private Person.Builder mBuilder;
    @Test
    public void Test(){
        mBuilder=new Person.Builder();
        mPerson=mBuilder
                .setAge(26)
                .setName("jtl")
                .setHeight("182cm")
                .setAddress("黑龙江")
                .create();

        System.out.println(mPerson.toString());
    }
}
