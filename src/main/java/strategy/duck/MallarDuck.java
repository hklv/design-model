package strategy.duck;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/18 22:00
 */
public class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I`m a real Mallard duck");
    }
}
