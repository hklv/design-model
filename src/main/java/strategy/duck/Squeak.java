package strategy.duck;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/18 22:08
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
