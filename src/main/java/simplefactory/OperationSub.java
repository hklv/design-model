package simplefactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/14 14:54.
 */
public class OperationSub extends Operation {
    @Override
    public Double getResult() {
        double result;
        result = getNumberA() - getNumberB();
        return result;
    }
}
