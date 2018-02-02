package iterator.headfirst;

import java.util.ArrayList;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/31 16:38
 */
public class PancakeHouseIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position=0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
