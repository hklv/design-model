package simplefactory;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/14 15:10.
 */
public class SimpleFactoryClient {
    public static void main(String[] args) {
        Operation oper = OperationFactory.getOperation("*");
        oper.setNumberA(1.0);
        oper.setNumberB(2.0);
        Double result = oper.getResult();
        System.out.println(result);

    }
}
