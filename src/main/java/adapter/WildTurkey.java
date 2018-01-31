package adapter;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/28 22:02
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I`m flying a short instance");
    }
}
