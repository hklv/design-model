package strategy;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/14 15:25.
 */
public class StrategyClient {
    public static void main(String[] args) {
        Context context;
        context = new Context(new StrategyA());
        context.contextInterface();
        context = new Context(new StrategyB());
        context.contextInterface();
        context = new Context(new StrategyC());
        context.contextInterface();
    }
}
