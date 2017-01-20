package observer;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/17 15:05.
 */
public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        observerState = subject.getSubState();
        System.out.println(String.format("观察者的%s的新状态%s", name, observerState));
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    public ConcreteSubject getSubject() {
        return subject;
    }
}
