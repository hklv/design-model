package abstractfactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 16:47.
 */
public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在SqlServer中给User表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在SqlServer中根据id获取User表的一条记录");
        return null;
    }
}
