package observer.weather_java;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/19 22:14
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 90, 100.f);
        weatherData.setMeasurements(60, 70, 100.f);
        weatherData.setMeasurements(300, 40, 100.f);
    }
}
