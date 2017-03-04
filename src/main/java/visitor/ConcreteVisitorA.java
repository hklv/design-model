package visitor;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-03-02 11:02.
 */
public class ConcreteVisitorA extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(String.format("%s被%s访问", concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(String.format("%s被%s访问", concreteElementB.getClass().getSimpleName(), concreteElementB.getClass().getSimpleName()));
    }
}
