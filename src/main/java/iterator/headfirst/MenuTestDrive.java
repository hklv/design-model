package iterator.headfirst;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/31 16:50
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dirDinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dirDinerMenu);
        waitress.printMenu();
    }
}
