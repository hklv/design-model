package visitor;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-03-02 10:36.
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
       visitor.visitConcreteElementA(this);
    }

    public void operationA(){}
}
