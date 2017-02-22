package singleton;

/**
 * 饿汉式单例模式
 *
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/21 21:33.
 */
public class Singleton2 {
    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    public Singleton2 getInstance() {
        return instance;
    }
}
