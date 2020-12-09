package observerPattern;

/**
 * 工人类
 * 具体的观察者类
 * 用于对生产线发出的“生产出问题产品”的消息做出相应
 */
public class Worker extends Observer {
    public Worker(String name, Subject subject) {
        super(name, subject);
    }

    public void update() {
        System.out.println(subject.getAction() + "\n" + "我是工人" + name + "：这批产品有问题，现在去排查！");
    }
}
