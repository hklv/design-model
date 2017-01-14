package decorator;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/13 23:55.
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation(){
        super.operation();
        System.out.println("具体的装饰类对象B的操作");
    }

    private void AddedBehavior(){

    }
}
