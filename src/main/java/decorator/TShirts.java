package decorator;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/14 0:09.
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
