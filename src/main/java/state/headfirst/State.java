package state.headfirst;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
