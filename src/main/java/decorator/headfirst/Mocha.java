package decorator.headfirst;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/20 23:24
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
