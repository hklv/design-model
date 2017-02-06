package abstractfactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 17:44.
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在Access中新增一条Department记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在Access中根据id获取一条department记录");
        return null;
    }
}
