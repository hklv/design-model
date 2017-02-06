package abstractfactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 17:41.
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在SqlServer中给Department表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在SqlServer中根据id查询一条记录");
        return null;
    }
}
