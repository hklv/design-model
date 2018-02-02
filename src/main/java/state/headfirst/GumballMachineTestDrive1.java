package state.headfirst;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/2/2 15:21
 */
public class GumballMachineTestDrive1 {
    public static void main(String[] args) {
        GumballMachine1 gumballMachine = new GumballMachine1(5);
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}
