package observerPattern;

/**
 * 通知者接口类
 * 用于抽象通知者类对象
 */
public interface Subject {
    //增加
    public void add(Observer observer);
    //删除
    public void del(Observer observer);
    //通知相关的观察者对象
    public void notifyObservers();
    //状态
    public void setAction(String action);
    public String getAction();
}
