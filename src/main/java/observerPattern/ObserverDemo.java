package observerPattern;

public class ObserverDemo {
    public static void main(String[] args) {
        //生产线作为通知者，发布“生产出现问题部件”消息
        ProductionLine pl = new ProductionLine();
        //质检员、工人 作为观察者
        Inspector inspector = new Inspector("黑黑",pl);
        Work work = new Work("白白",pl);

        //将两个观察者与通知者关联
        pl.add(inspector);
        pl.add(work);

        //生产线发出消息
        pl.setAction("生产线：生产出现问题部件！");
        //观察者做出相应动作
        pl.notifyObservers();
    }

}
