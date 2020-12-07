package adapterPattern;

/**
 * Micro USB 接口
 * 可以实现读取、普通充电
 */
public class MicroUSB {
    public void read(){
        System.out.println("我可以读取文件");
    }
    public void chargeSlow(){
        System.out.println("我只能普通充电！");
    }
}
