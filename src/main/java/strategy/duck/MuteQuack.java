package strategy.duck;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/18 22:07
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<Silence>");
    }
}
