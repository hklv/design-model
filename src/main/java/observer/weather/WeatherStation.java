package observer.weather;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/1/19 21:49
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMmeasurements(80, 65, 30.4f);
        weatherData.setMmeasurements(82, 70, 29.2f);
        weatherData.setMmeasurements(78, 90, 29.2f);
    }
}
