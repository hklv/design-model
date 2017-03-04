package visitor;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-03-02 10:34.
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
