package iterator.headfirst;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/31 16:17
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
