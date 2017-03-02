package flyweight;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-03-01 21:20.
 */
public class Client {
    public static void main(String[] args) {
        WebsiteFactory f = new WebsiteFactory();

        Website fx = f.getWebsiteCategory("产品展示");
        fx.use(new User("小草"));

        Website fy = f.getWebsiteCategory("产品展示");
        fy.use(new User("大鸟"));

        Website fz = f.getWebsiteCategory("博客");
        fz.use(new User("娇娇"));
    }
}
