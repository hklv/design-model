package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/12 16:48.
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(depthStr(depth) + name);
        for (Component c : children) {
            c.display(depth + 2);
        }
    }

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));

        comp.add(comp2);

        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
