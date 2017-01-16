package tempate;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/16 16:17.
 */
public class TemplateClient {
    public static void main(String[] args) {
        AbstractClass a;

        a = new ConcereteClassA();
        a.templateMethod();

        a = new ConcereteClassB();
        a.templateMethod();
    }
}
