package com.jtl.designpatterns.builder;

import com.socks.library.KLog;

/**
 * 作者:jtl
 * 日期:Created in 2019/2/18 17:43
 * 描述:指挥者类
 * 更改:
 */

public class Director {
    public void test(){
        HumanBuilder humanBuilder=new HumanBuilder();
        Human human= (Human) humanBuilder.setAbility(99)
                .setName("贾天龙")
                .setAge(26)
                .build();

        NightElvesBuilder nightElvesBuilder=new NightElvesBuilder();
        NightElves nightElves= (NightElves) nightElvesBuilder.setAbility(80)
                .setName("幻影刺客")
                .setAge(26)
                .build();


    }
}
