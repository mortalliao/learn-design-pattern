package win.mortalliao.java.behavior_pattern.state.state;

/**
 * @author mortal
 */
public class Rain implements Weather {

    @Override
    public String getWeather() {
        return "下雨";
    }
}
