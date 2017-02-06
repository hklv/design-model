package abstractfactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 16:58.
 */
public class SqlServerFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment(){
        return new SqlServerDepartment();
    }
}
