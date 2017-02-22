package bridge;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/2/21 23:32.
 */
public abstract class HandSetBrand {
    protected HandSetSoft soft;

    public void setSoft(HandSetSoft soft){
        this.soft = soft;
    }

    public abstract void run();
}
