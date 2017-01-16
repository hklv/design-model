package tempate;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/16 16:07.
 */
public abstract class AbstractClass {
    public abstract void operation1();

    public abstract void operation2();

    public void templateMethod() {
        operation1();
        operation2();
        System.out.println("Success");
    }
}
