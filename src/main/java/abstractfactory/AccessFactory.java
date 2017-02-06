package abstractfactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 17:00.
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
