package factoryPattern;
class Battery{
    private String battery;

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "battery='" + battery + '\'' +
                '}';
    }
}

/**
 * 电池生产厂
 */
public class BatteryComponent implements Component{
    public BatteryComponent(){}
    @Override
    public String make() {
        Battery battery = new Battery();
        battery.setBattery("6000mAh");
        System.out.println("电池厂商正在生产电池，产品为：" + battery.getBattery());
        return battery.toString();
    }
}
