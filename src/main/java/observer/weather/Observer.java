package observer.weather;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 观察者
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
