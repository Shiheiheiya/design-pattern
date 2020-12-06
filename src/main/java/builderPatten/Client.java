package builderPatten;

/**
 * 用户实现类
 */
public class Client {
    public static void main(String[] args) {
        //Builder模式
        MobilePhone mp = new MobilePhone.Builder("骁龙662","128GB","6000mAh","OLED")
                .setCamera("3840 x 2400")
                .setFigure("yes")
                .setGps("yes")
                .setNfc("yes")
                .build();
        System.out.println(mp.toString());
        System.out.println("这是一部" + mp.type());
    }
}
