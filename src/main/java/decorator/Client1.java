package decorator;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/14 0:08.
 */
public class Client1 {
    public static void main(String[] args) {
        Person pc = new Person("小菜");
        System.out.println("第一种装扮");
        BigTrouser kk = new BigTrouser();
        TShirts tx = new TShirts();
        kk.Decorate(pc);
        tx.Decorate(kk);
        tx.show();
    }
}
