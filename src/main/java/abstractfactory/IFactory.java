package abstractfactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 16:55.
 */
public interface IFactory {
    IUser createUser();

    IDepartment createDepartment();
}
