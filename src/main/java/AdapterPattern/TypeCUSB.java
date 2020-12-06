package AdapterPattern;

/**
 * Type-c USB 接口
 * 支持读取和快速充电
 */
public class TypeCUSB {
    public void read(){
        System.out.println("我可以读取文件");
    }
    public void charge(){
        System.out.println("我可以快速充电！");
    }
}
