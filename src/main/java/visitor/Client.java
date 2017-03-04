package visitor;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-03-02 11:11.
 */
public class Client {
    public static void main(String[] args){
        ObjectStructure o = new ObjectStructure();

        o.add(new ConcreteElementA());
        o.add(new ConcreteElementB());
        ConcreteVisitorA visitor = new ConcreteVisitorA();
        o.accept(visitor);
    }
}
