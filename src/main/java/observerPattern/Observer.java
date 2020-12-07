package observerPattern;

/**
 * 观察者抽象类
 * 用于抽象观察者相关方法
 */
public abstract class Observer {
    protected String name;
    protected Subject subject;//与当前观察者相关联的通知者对象

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
