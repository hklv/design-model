package strategy.duck;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/18 22:13
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m a model duck");
    }
}
