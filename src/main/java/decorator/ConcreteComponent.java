package decorator;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/13 22:58.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体的对象操作");
    }
}
