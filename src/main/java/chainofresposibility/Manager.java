package chainofresposibility;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-02-27 15:34.
 */
public abstract class Manager {
    protected String name;

    protected Manager superior;

    public void setSuperior(Manager manager) {
        this.superior = manager;
    }

    abstract public void requestApplication(Request request);
}
