package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/12 17:40.
 */
public class ConcreteCompany extends Company {

    List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println(depthStr(depth) + name);
        for (Company c : children) {
            c.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company c : children) {
            c.lineOfDuty();
        }
    }
}
