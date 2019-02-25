package com.jtl.designpatterns;

import com.jtl.designpatterns.observer.novel.Author;
import com.jtl.designpatterns.observer.novel.Reader;
import com.jtl.designpatterns.observer.offer.HeadHunt;
import com.jtl.designpatterns.observer.offer.Programer;

import org.junit.Test;

/**
 * 作者:jtl
 * 日期:Created in 2019/2/22 14:26
 * 描述:观察者测试类
 * 更改:
 */
public class ObserverTest {
    @Test
    public void upDateNovel(){
        Reader jia=new Reader("小贾");
        Reader luo=new Reader("小罗");
        Reader xie=new Reader("小谢");
        Reader dong=new Reader("小董");
        Reader liu=new Reader("小刘");
        Author author=new Author();
        author.addObserver(jia);
        author.addObserver(luo);
        author.addObserver(xie);
        author.addObserver(dong);
        author.addObserver(liu);
        author.upDateNovel("您喜欢的小说，仙逆更新最新章节了");


        System.out.println("\n----------------小刘由于不想再看小说就取消了订阅----------------------\n");
        author.deleteObserver(liu);
        author.upDateNovel("您喜欢的小说，求魔更新最新章节了");
    }

    @Test
    public void upDatePosition(){
        Programer jia=new Programer("小贾","Android");
        Programer liu=new Programer("小刘","Android");
        Programer ling=new Programer("老凌","JNI");
        Programer liang=new Programer("小梁","JNI");
        Programer luo=new Programer("小罗","前台");

        HeadHunt headHunt=new HeadHunt();
        headHunt.addObserver(jia);
        headHunt.addObserver(liu);
        headHunt.addObserver(ling);
        headHunt.addObserver(liang);
        headHunt.addObserver(luo);
        headHunt.releaseJob("目前xxx公司有新的Android程序员职位，请您前去面试！");

        System.out.println("\n----------------小罗由于不是程序员就取消了订阅----------------------\n");
        headHunt.deleteObserver(luo);
        headHunt.releaseJob("目前xxx公司有新的Android程序员职位，请您前去面试！");
    }
}
