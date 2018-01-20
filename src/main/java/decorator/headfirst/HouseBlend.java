package decorator.headfirst;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/20 23:22
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
