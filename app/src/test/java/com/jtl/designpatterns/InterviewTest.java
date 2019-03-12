package com.jtl.designpatterns;

import com.jtl.designpatterns.interview.Interview;

import org.junit.Test;

/**
 * 作者:jtl
 * 日期:Created in 2019/2/27 11:01
 * 描述:
 * 更改:
 */

public class InterviewTest {
    @Test
    public void init(){
        Interview mInterview=new Interview("贾天龙",26,Interview.MAN);
        System.out.println("mInterview地址："+mInterview.toString());

        changeInfo(mInterview);
        System.out.println("mInterview数据："+mInterview.getName()+"\n年龄:"+mInterview.getAge()+"\n性别:"+mInterview.getSex()+"\n地址:"+mInterview.toString());
    }

    public void changeInfo(Interview interview){
        interview.setName("张莉");
        interview.setAge(26);
        interview.setSex(Interview.WOMAN);

        System.out.println("changeInfo：Interview地址："+interview.toString());
    }
}
