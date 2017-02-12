package composite;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/12 17:45.
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println(depthStr(depth) + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println("员工招聘管理");
    }
}
