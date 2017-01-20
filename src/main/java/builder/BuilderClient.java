package builder;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 14:30.
 */
public class BuilderClient {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcretBuilder1();
        Builder builder2 = new ConcreteBuilder2();
        director.construct(builder1);
        Product p1 = builder1.getResult();
        p1.show();
        director.construct(builder2);
        Product p2 = builder2.getResult();
        p2.show();
    }
}
