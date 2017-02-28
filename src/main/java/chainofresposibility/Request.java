package chainofresposibility;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-02-27 15:41.
 */
public class Request {
    private String requestType;
    private String requestContecnt;
    private int num;

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestType() {
        return requestType;
    }


    public String getRequestContecnt() {
        return requestContecnt;
    }

    public void setRequestContecnt(String requestContecnt) {
        this.requestContecnt = requestContecnt;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
