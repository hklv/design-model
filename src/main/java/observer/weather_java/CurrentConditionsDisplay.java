package observer.weather_java;

import observer.weather.DispayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/19 22:08
 */
public class CurrentConditionsDisplay implements Observer, DispayElement {
    private float temp;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Observable) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Condition: " + temp + "F degrees and " + humidity + "% humidity");
    }
}
