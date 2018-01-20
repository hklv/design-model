package observer.weather;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 观察者模式的主题
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
