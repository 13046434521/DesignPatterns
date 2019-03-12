package com.jtl.designpatterns;

import com.jtl.designpatterns.observer.novel.Author;
import com.jtl.designpatterns.observer.novel.Reader;
import com.jtl.designpatterns.observer.offer.AndroidProgramer;
import com.jtl.designpatterns.observer.offer.HeadHunt;
import com.jtl.designpatterns.observer.offer.JniProgramer;
import com.jtl.designpatterns.observer.offer.Programer;
import com.jtl.designpatterns.observer.offer.Reception;

import org.junit.Test;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

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
        author.upDateNovel("您喜欢的作者耳根的最新小说，仙逆更新最新章节了");

        System.out.println("\n----------------小刘由于不想再看小说就取消了订阅----------------------\n");

        author.deleteObserver(liu);
        author.upDateNovel("您喜欢的作者耳根的最新小说，仙逆更新最新章节了");
    }

    @Test
    public void upDatePosition(){
        Programer jia=new AndroidProgramer("小贾");
        jia.setPosition();
        Programer liu=new AndroidProgramer("小刘");
        liu.setPosition();
        Programer ling=new JniProgramer("老凌");
        ling.setPosition();
        Programer liang=new JniProgramer("小梁");
        liang.setPosition();
        Reception luo=new Reception("小罗");
        luo.setPosition();

        HeadHunt headHunt=new HeadHunt();
        headHunt.addObserver(jia);
        headHunt.addObserver(liu);
        headHunt.addObserver(ling);
        headHunt.addObserver(liang);
        headHunt.addObserver(luo);
        headHunt.releaseJob("目前xxx公司有新的Android工程师职位，请您前去面试！");

        System.out.println("\n----------------小罗由于不是Android工程师就取消了订阅----------------------\n");

        headHunt.deleteObserver(luo);
        headHunt.releaseJob("目前xxx公司有新的Android工程师职位，请您前去面试！");
    }

    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target(value={METHOD, FIELD})
    public @interface UseCase {
        public int id();
        public String description() default "default value";
    }
}
