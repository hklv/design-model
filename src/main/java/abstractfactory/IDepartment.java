package abstractfactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 17:23.
 */
public interface IDepartment {
    void insert(Department department);

    Department getDepartment(int id);
}
