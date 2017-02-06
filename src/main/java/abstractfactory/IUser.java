package abstractfactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 16:45.
 */
public interface IUser {
    void insert(User user);

    User getUser(int id);
}
