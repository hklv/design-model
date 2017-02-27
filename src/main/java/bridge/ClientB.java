package bridge;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/22 11:57.
 */
public class ClientB {
    public static void main(String[] args) {
        Abstraction ab = new Abstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();
        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
