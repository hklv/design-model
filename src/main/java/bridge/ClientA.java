package bridge;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/21 23:36.
 */
public class ClientA {
    public static void main(String[] args) {
        HandSetBrand ab = new HandSetBrandM();
        ab.setSoft(new HandSetGame());
        ab.run();
        ab.setSoft(new HandSetAddressList());
        ab.run();

        ab = new HandSetBrandN();
        ab.setSoft(new HandSetGame());
        ab.run();
        ab.setSoft(new HandSetAddressList());
        ab.run();
    }
}
