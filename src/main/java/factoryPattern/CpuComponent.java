package factoryPattern;
class CPU{
    private String cpu;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "cpu='" + cpu + '\'' +
                '}';
    }
}

/**
 * CPU生产厂
 */
public class CpuComponent implements Component{
    public CpuComponent(){}
    @Override
    public String make() {
        CPU cpu = new CPU();
        cpu.setCpu("骁龙662");
        System.out.println("CPU厂商正在生产CPU，产品为：" + cpu.getCpu());
        return cpu.toString();
    }
}
