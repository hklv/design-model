package abstractfactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 16:52.
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在Access中给User新增一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据Id得到User表的一条记录");
        return null;
    }
}
