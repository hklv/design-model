package state.headfirst;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/2/2 15:07
 */
public class WinnerState implements State {
    GumballMachine1 gumballMachine1;

    public WinnerState(GumballMachine1 gumballMachine) {
        this.gumballMachine1 = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait,we are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("turning twice doesn`t give you another gumball");
    }


    @Override
    public void dispense() {
        System.out.println("You are winner! You get two gumball for your quarter!");
        gumballMachine1.releaseBall();
        if (gumballMachine1.getCount() == 0) {
            gumballMachine1.setState(gumballMachine1.getSoldOutState());
        } else {
            gumballMachine1.releaseBall();
            if (gumballMachine1.getCount() > 0) {
                gumballMachine1.setState(gumballMachine1.getSoldOutState());
            } else {
                System.out.println("Oops,out of gumballs");
                gumballMachine1.setState(gumballMachine1.getSoldOutState());
            }
        }
    }
}
