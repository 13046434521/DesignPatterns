package com.jtl.designpatterns.interview;

import android.support.annotation.IntDef;
import android.support.annotation.StringDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 作者:jtl
 * 日期:Created in 2019/2/27 10:54
 * 描述:
 * 更改:
 */

public class Interview {
    public static final String MAN = "男";
    public static final String WOMAN = "女";

    @Retention(RetentionPolicy.RUNTIME)
    @Target(value = {ElementType.PARAMETER, ElementType.FIELD})
    @StringDef({MAN, WOMAN})
    public @interface Sex {
    }

    private String name;
    private int age;
    private @Sex
    String sex;

    public Interview(String name, int age, @Sex String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(@Sex String sex) {
        this.sex = sex;
    }
}
