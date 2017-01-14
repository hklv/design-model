package decorator;

/**
 * @author LvHuiKang mailTo lv.huikang@zte.com.cn.
 * @Date 2017/1/14 0:03.
 */
public class Person {
    public Person() {
    }

    private String name;

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(String.format("装扮的%s",name));
    }
}
