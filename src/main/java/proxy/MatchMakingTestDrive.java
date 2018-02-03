package proxy;

import java.lang.reflect.Proxy;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/2/3 22:55
 */
public class MatchMakingTestDrive {
    public static void main(String[] args) {

    }

    public MatchMakingTestDrive() {
    }

    public void drive() {

    }

    public PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }
}
