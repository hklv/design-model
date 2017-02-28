package chainofresposibility;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-02-27 15:56.
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        this.name = name;
    }

    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(String.format("%s:%s数量 %s 被批准", request.getRequestType(), request.getRequestContecnt(), request.getNum()));
        } else if (request.getRequestType().equals("加薪") && request.getNum() <= 500) {
            System.out.println(String.format("%s:%s数量 %s 被批准", request.getRequestType(), request.getRequestContecnt(), request.getNum()));
        } else if (request.getRequestType().equals("加薪") && request.getNum() > 500) {
            System.out.println(String.format("%s:%s数量 %s 再说吧", request.getRequestType(), request.getRequestContecnt(), request.getNum()));
        }
    }
}
