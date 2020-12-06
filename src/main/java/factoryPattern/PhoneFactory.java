package factoryPattern;

public class PhoneFactory {
    private Phone phone = new Phone();
    public Phone makePhone(){
        System.out.println("生产手机需要CPU、电池和屏幕，请各部件工厂生产...");
        phone.setCpu(new CpuComponent().make());
        phone.setBattery(new BatteryComponent().make());
        phone.setScreen(new ScreenComponent().make());
        return phone;
    }
}
