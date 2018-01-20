package strategy.duck;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/18 22:06
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can`t fly");
    }
}
