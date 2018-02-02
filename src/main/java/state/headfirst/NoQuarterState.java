package state.headfirst;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/2/2 14:13
 */
public class NoQuarterState implements State {
    GumballMachine1 gumballMachine;

    public NoQuarterState(GumballMachine1 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven`t inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned,but there`s no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you need pay first");
    }
}
