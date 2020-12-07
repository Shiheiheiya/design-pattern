package observerPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * 生产线类
 * 具体的通知者实现类
 * 当生产线生产出问题部件时，发送消息通知所有关注部件质量的人
 */
public class ProductionLine implements Subject{

    //相关的观察者对象列表，例如：质管员、工人等
    private List<Observer> observers = new LinkedList<Observer>();
    //相应的活动，例如：生产出问题产品
    private String action;

    //添加
    public void add(Observer observer) {
        observers.add(observer);
    }

    public void del(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update();
        }
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
