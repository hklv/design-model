package chainofresposibility;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-02-27 15:39.
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        this.name = name;
    }

    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getNum() < 2) {
            System.out.println(String.format("%s:%s 数量 %s 被批准", request.getRequestType(), request.getRequestContecnt(), request.getNum()));
        } else {
            superior.requestApplication(request);
        }
    }
}
