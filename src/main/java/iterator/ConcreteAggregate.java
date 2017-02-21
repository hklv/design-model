package iterator;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/16 20:55.
 */
public class ConcreteAggregate extends Aggregate{
    private Object[] items;
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    private class ConcreteIterator extends Iterator {
        private ConcreteAggregate concreteAggregate;
        private int current = 0;

        public ConcreteIterator(ConcreteAggregate aggregate) {
            this.concreteAggregate = aggregate;
        }

        @Override
        public Object first() {
            return items[0];
        }

        @Override
        public Object next() throws Exception {
            if (current>items.length )throw new Exception("");
            return current++;

        }

        @Override
        public Boolean isDone() {
            return null;
        }

        @Override
        public Object currentItem() {
            return null;
        }
    }
}
