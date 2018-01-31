package adapter;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/28 22:05
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("The duck says...");
        testDuck(duck);
        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
