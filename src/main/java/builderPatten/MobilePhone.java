package builderPatten;

/**
 * 产品类
 */
public class MobilePhone {
    //基础构件(必须)：
    private String cpu;//cpu
    private String memory;//内存
    private String battery;//电池
    private String screen;//屏幕
    //可选构件(可选)：
    private String camera;//摄像头
    private String gps;//GPS
    private String figure;//指纹识别
    private String nfc;//NFC

    public MobilePhone(){
        throw new RuntimeException("不具备所有必须的构件");
    }
    private MobilePhone(Builder builder){
        cpu = builder.cpu;
        memory = builder.memory;
        battery = builder.battery;
        screen = builder.screen;
        camera = builder.camera;
        gps = builder.gps;
        figure = builder.figure;
        nfc = builder.nfc;
    }

    public String type(){
        if(this.figure != null && this.gps != null && this.nfc != null && this.camera != null) return "旗舰版手机 :)";
        else if(this.gps != null && this.nfc != null) return "标准版手机";
        else if(this.camera != null) return "拍照手机";
        else return "老年机 :(";
    }
    @Override
    public String toString() {
        return "MobilePhone{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", battery='" + battery + '\'' +
                ", screen='" + screen + '\'' +
                ", camera='" + camera + '\'' +
                ", gps='" + gps + '\'' +
                ", figure='" + figure + '\'' +
                ", nfc='" + nfc + '\'' +
                '}';
    }

    /**
     * Builder内部类
     */
    public static final class Builder{
        //基础构件(必须)：
        private String cpu;//cpu
        private String memory;//内存
        private String battery;//电池
        private String screen;//屏幕
        //可选构件(可选)：
        private String camera;//摄像头
        private String gps;//GPS
        private String figure;//指纹识别
        private String nfc;//NFC

        public Builder(String cpu, String memory,String battery, String screen){
            this.cpu = cpu;
            this.memory = memory;
            this.battery = battery;
            this.screen = screen;
        }
        public Builder setCamera(String val){
            this.camera = val;
            return this;
        }
        public Builder setGps(String val){
            this.gps = val;
            return this;
        }
        public Builder setFigure(String val){
            this.figure = val;
            return this;
        }
        public Builder setNfc(String val){
            this.nfc = val;
            return this;
        }
        public MobilePhone build(){
            return new MobilePhone(this);
        }
    }
}
