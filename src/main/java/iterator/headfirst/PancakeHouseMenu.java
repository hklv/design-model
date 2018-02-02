package iterator.headfirst;

import java.util.ArrayList;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/31 16:35
 */
public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("pancake", "lalala", Boolean.TRUE, 2);
        addItem("pancake1", "lalala1", Boolean.TRUE, 3);
        addItem("pancake2", "lalala2", Boolean.TRUE, 4);
        addItem("pancake3", "lalala3", Boolean.TRUE, 5);
    }

    public void addItem(String name, String description, boolean vegetaran, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetaran, price);
        menuItems.add(menuItem);
    }


    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }

}
