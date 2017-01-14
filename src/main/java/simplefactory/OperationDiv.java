package simplefactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/14 14:57.
 */
public class OperationDiv extends Operation {
    @Override
    public Double getResult() {
        double result;
        if (getNumberB() == 0) {
            throw new RuntimeException("除数不为零");
        }
        result = getNumberA() / getNumberB();
        return result;
    }
}
