package factoryPattern;

/**
 * 工厂模式测试类
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Phone phone;
        phone = new PhoneFactory().makePhone();
        System.out.println(phone.toString());
    }
}
