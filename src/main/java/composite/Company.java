package composite;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/12 17:37.
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int depth);

    public abstract void lineOfDuty();


    public String depthStr(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
