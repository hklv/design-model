package state.headfirst;

import java.util.Random;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/2/2 14:26
 */
public class HasQuarterState implements State {
    GumballMachine1 gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine1 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can`t insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ...");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
