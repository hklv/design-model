package abstractfactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 17:01.
 */
public class AbstractFactoryClient {
    public static void main(String[] args) {
        User user = new User();
        IFactory factory = new SqlServerFactory();
        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);

        Department department = new Department();
        factory.createDepartment();
        IDepartment id = factory.createDepartment();
        id.insert(department);
        id.getDepartment(1);
    }
}
