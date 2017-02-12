package composite;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/12 16:40.
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println(depthStr(depth) + name);
    }
}
