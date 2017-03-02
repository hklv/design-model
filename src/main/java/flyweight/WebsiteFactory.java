package flyweight;

import java.util.HashMap;

/**
 * @author LvHuiKang mailTo lv.huikang@ztesoft.com
 * @Date 2017-03-01 21:16.
 */
public class WebsiteFactory {
    private HashMap<String, Website> websites = new HashMap<>();

    public Website getWebsiteCategory(String key) {
        if (websites.get(key) == null) {
            websites.put(key, new ConcreteWebsite(key));
        }
        return websites.get(key);
    }

    public int getWebsiteCount() {
        return websites.size();
    }
}
