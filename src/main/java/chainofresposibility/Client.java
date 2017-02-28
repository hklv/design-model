package chainofresposibility;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-02-27 16:02.
 */
public class Client {
    public static void main(String[] args) {
        CommonManager manager = new CommonManager("经理");
        MajorManager major = new MajorManager("总监");
        GeneralManager general = new GeneralManager("总经理");
        manager.setSuperior(major);
        major.setSuperior(general);
        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContecnt("小张请假");
        request.setNum(1);
        manager.requestApplication(request);
        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContecnt("小张请假");
        request1.setNum(4);
        manager.requestApplication(request1);
        Request request2 = new Request();
        request2.setRequestType("加薪");
        request2.setRequestContecnt("小张请求加薪");
        request2.setNum(500);
        manager.requestApplication(request2);
        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContecnt("小张请求加薪");
        request3.setNum(10000);
        manager.requestApplication(request3);
    }
}
