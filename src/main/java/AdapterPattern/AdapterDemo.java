package AdapterPattern;

/**
 * 适配器模式测试
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Target adapterFast = new TypeCAdapter();
        adapterFast.convert_fast();
    }
}
