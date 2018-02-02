package iterator.headfirst;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/31 16:21
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("sha", "ssss", Boolean.TRUE, 2.99);
        addItem("sha1", "ssss1", Boolean.TRUE, 3.99);
        addItem("sha2", "ssss2", Boolean.TRUE, 4.99);
        addItem("sha3", "ssss3", Boolean.TRUE, 5.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry menu is Full! Can`t add item to menu");
        } else {
            MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIteraror() {
        return new DinerMenuIterator(menuItems);
    }
}
