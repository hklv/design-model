package chainofresposibility;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-02-27 15:48.
 */
public class MajorManager extends Manager {
    public MajorManager(String name) {
        this.name = name;
    }

    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getNum() <= 5) {
            System.out.println(String.format("%s:%s 数量 %s 被批准", request.getRequestType(), request.getRequestContecnt(), request.getNum()));
        } else {
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
