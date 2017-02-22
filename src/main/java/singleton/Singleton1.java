package singleton;

/**
 * 懒汉式单例模式
 *
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/21 21:24.
 */
public class Singleton1 {
    private static Singleton1 instance;

    private static final Object synRoot = new Object();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            synchronized (synRoot) {
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
