package strategy.duck;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/18 22:15
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m fly with a rocket");
    }
}
