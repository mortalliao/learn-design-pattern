package win.mortalliao.java.behavior_pattern.state.context;

import win.mortalliao.java.behavior_pattern.state.state.Weather;

/**
 * @author mortal
 */
public class Context {

    private Weather weather;

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Weather getWeather() {
        return this.weather;
    }

    public String weatherMessage() {
        return weather.getWeather();
    }
}
