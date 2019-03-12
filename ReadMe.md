### 连载文章
+ [1. 单例模式，今天你用了嘛](https://www.jianshu.com/p/a58f7768bea0)
+ [2. Builder模式，今天你用了嘛](https://www.jianshu.com/p/6748c874aef3)
+ [3. 观察者模式，今天你用了嘛](https://www.jianshu.com/p/77dfa31a9d36)
### 1. 前言
 >一提到观察者模式，做个Android项目的人，第一时间想到的估计就是著名的第三方库 **RxJava** 了 。我第一次接触到这个设计模式就是因为 **RxJava**。当时看着很吃力，被 **观察者，被观察者，订阅** 这三个概念搞得特别晕。不过在知道了什么是观察者模式之后，就不会那么费事了。
### 2. 定义
> 观察者模式定义了对象之间的一对多的依赖关系，使得每当一个对象状态发生改变时，所有依赖于它的对象都会收到通知并被自动更新。
### 3. UML图
![UML(Observer).png](https://upload-images.jianshu.io/upload_images/5872452-17dcf0bf341a86b2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
+ **Subject（主题类）：** 抽象主题，它本身会有一个集合，用来保存观察者对象。每个主题都可以保存任意数量的观察者对象。同时应有两个接口，用来保存和删除观察者对象的引用。以及一个通知所有观察者更新的方法。主题类又叫做抽象被观察者类。
+ **ConcreteSubject（具体主题类）：** 具体主题，该角色将有关状态存入具体观察者对象。当具体主题类状态发生改变时，将会通知所有订阅过的观察者。具体主题又叫做具体被观察者。
+ **Observer（抽象观察者）：** 抽象观察者，该角色是观察者的抽象类，它定义了一个更新接口。当具体主题的状态发生改变时用来更新自身的状态。
+ **ConcreteObserver（具体观察者）：** 具体观察者，该角色实现抽象观察者角色所定义的更新接口，以便在主题状态发生变化时更新自身的状态。
### 4. 观察者模式示例
>只看定义，估计大家很难理解这个模式。这样我举个例子给大家。
现在大家都流行刷抖音，没事儿刷刷抖音，喜欢的视频就点个赞。当有喜欢的作者的时候，自然而然就会点个关注！这样每当这个作者有新的抖音视频更新的时候，她的粉丝都会再第一时间收到这个消息。
在这里抖音作者就相当于**被观察者**。粉丝就相当于**观察者**。而关注就相当于**订阅**。

+ **被观察者：**作者类。它的作用是每天写小说，小说一旦更新完一章，就发送通知给读者。
```
/**
 * 作者:jtl
 * 日期:Created in 2019/2/22 11:24
 * 描述:起点作者耳根（被观察者）
 * 更改:
 */

public class Author extends Observable {
    /**
     * 小说更新
     * @param content
     */
    public void upDateNovel(String content){
        setChanged();
        notifyObservers(content);
    }
}
```
+ **观察者：** 读者类，他可以订阅喜欢的作者
```
/**
 * 作者:jtl
 * 日期:Created in 2019/2/22 11:56
 * 描述:读者（观察者）
 * 更改:
 */

public class Reader implements Observer {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("尊敬的用户"+name+":"+arg);
    }

    @Override
    public String toString() {
        return "读者："+name;
    }
}
```
+ **订阅：**一个对象依赖另一个对象的过程
```
        //观察者
        Reader jia=new Reader("小贾");
        Reader luo=new Reader("小罗");
        Reader xie=new Reader("小谢");
        Reader dong=new Reader("小董");
        Reader liu=new Reader("小刘");
        //被观察者
        Author author=new Author();
        //订阅（依赖）
        author.addObserver(jia);
        author.addObserver(luo);
        author.addObserver(xie);
        author.addObserver(dong);
        author.addObserver(liu);
```
+ **实例：** 有五个读者，同时喜欢作者耳根的作品仙逆。他们都订阅了这部作品。每当作品有更新的时候，他们都会收到通知 **（被观察者状态更新时，依赖于该被观察者的观察者都会做出相应的改变）。** 其中小刘在看了一段时间之后，临近期末考试为了专心复习，他就取消了耳根的订阅。这样耳根作品更新的时候，他就不会再收到通知了！
```
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
}
```
![输出结果.png](https://upload-images.jianshu.io/upload_images/5872452-9b9f4ca336a21148.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
### 4. 如何使用观察者模式
+ **分析：** 上面大家可能发现了。Author类（被观察者）继承了一个Observable，而Reader实现了一个Observer接口。其实这两个是系统提供给我们的。其中Observable是一个抽象类。而Observer是一个接口。我们看下他们的源码！
```
/**
 * A class can implement the <code>Observer</code> interface when it
 * wants to be informed of changes in observable objects.
 *
 * @author  Chris Warth
 * @see     java.util.Observable
 * @since   JDK1.0
 */
public interface Observer {
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param   o     the observable object.
     * @param   arg   an argument passed to the <code>notifyObservers</code>
     *                 method.
     */
    void update(Observable o, Object arg);
}
```

+ **Observer：** 该接口的注释：当一个类希望被告知可观察对象的变化时，它可以实现 **Observer** 接口。这里只有一个方法，是当被观察者状态做出改变时。观察者即可在该方法内做出相应改变。

```
public class Observable {
    private boolean changed = false;
    private Vector<Observer> obs;

    public Observable() {
        obs = new Vector<>();
    }

    public synchronized void addObserver(Observer o) {
        if (o == null)
            throw new NullPointerException();
        if (!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    public synchronized void deleteObserver(Observer o) {
        obs.removeElement(o);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        Object[] arrLocal;

        synchronized (this) {
            if (!hasChanged())
                return;
            arrLocal = obs.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
    }

    public synchronized void deleteObservers() {
        obs.removeAllElements();
    }

    protected synchronized void setChanged() {
        changed = true;
    }

    protected synchronized void clearChanged() {
        changed = false;
    }

    public synchronized boolean hasChanged() {
        return changed;
    }

    public synchronized int countObservers() {
        return obs.size();
    }
}
```
+ **Observable：** 这里的Observable类就相当于之前我们说的抽象观察者。他的所有Observer都通过addObserver()方法添加入了一个Vector中。而notifyObservers()则是用了一个for循环来调用每个Observer的update()方法。不过这里用了一个changed来作为标记位。只有调用了hasChanged()方法才能继续下去，它的作用是为了在更新观察者时有更好的弹性。假如作者不想每提交一章就更新一次，而是一次性的更新两章之后再通知读者。那么这个方法的作用就显现出来了。

+ **使用方式：** 所以你如果想快速实现观察者模式的话，就可以让观察者实现Observer接口，具体主题（被观察者）集成Observable类。这样就OK了。很快很简单吧。不过要注意的是，他的更新顺序因为for循环的写法不同，Observer对象的更新顺序不同，这点要注意！
同时这种快速集成也是有缺点的。那就是Observable是一个类，假如我们的具体主题类再继承了Observable的同时还想继承另一个超类就不行了。所以如果需求不满足的话，我们可以像上面一样自己去写一个Observable和Observer来满足自己的需求，就像RxJava一样。如果想学到更多的观察者模式具体使用方式，可以去看下RxJava源码。

### 5. 结束语：
**好了，就说到这儿了。还是那句老话，风里雨里我都在这里等你。你们的关注和点赞是我写作的最大动力。希望大家能够给我一点点的动力。动动您的小手。如果文章中有错误的地方，希望您及时指出，我好改正。让我们共同进步。别忘了关注和点赞。谢谢您了！！！
另附GitHub源码地址：https://github.com/13046434521/DesignPatterns**
