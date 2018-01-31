package adapter;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/28 22:01
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("QUACK");
    }

    @Override
    public void fly() {
        System.out.println("I`m flying");
    }
}
