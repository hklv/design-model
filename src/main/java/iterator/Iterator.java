package iterator;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/16 20:47.
 */
public abstract class Iterator {
    public abstract Object first();

    public abstract Object next() throws Exception;

    public abstract Boolean isDone();

    public abstract Object currentItem();
}
