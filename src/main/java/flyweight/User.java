package flyweight;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-03-01 21:05.
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
