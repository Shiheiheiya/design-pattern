package factoryPattern;
class Screen{
    private String screen;

    public String getScreen() {
        return screen;
    }

    public void setScreen(String battery) {
        this.screen = battery;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "screen='" + screen + '\'' +
                '}';
    }
}

/**
 * 屏幕生产厂
 */
public class ScreenComponent implements Component{
    public ScreenComponent(){}
    @Override
    public String make() {
        Screen sc = new Screen();
        sc.setScreen("OLED");
        System.out.println("屏幕商正在生产屏幕，产品为：" + sc.getScreen());
        return sc.toString();
    }
}
