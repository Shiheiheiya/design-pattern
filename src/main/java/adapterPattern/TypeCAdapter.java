package adapterPattern;

/**
 * Micro USB 接口适配器
 * 提供普通充电 -> 快速充电 适配转换
 */
public class TypeCAdapter extends TypeCUSB implements Target{

    @Override
    public void convert_fast() {
        this.charge();
    }
}
