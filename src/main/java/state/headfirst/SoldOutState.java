package state.headfirst;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/2/2 14:44
 */
public class SoldOutState implements State {
    GumballMachine1 gumballMachine;

    public SoldOutState(GumballMachine1 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("gumball is sold out,please don`t insert quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can`t eject, you haven`t insert a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned,but there are no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("No Gumball dispense");
    }
}
