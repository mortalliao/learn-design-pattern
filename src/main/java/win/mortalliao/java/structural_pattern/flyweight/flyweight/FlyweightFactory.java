package win.mortalliao.java.structural_pattern.flyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mortal
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> flyweights = new HashMap();

    public FlyweightFactory(String arg) {
        flyweights.put(arg, new FlyweightImpl());
    }

    public static Flyweight getFlyweight(String key) {
        if (flyweights.get(key) == null) {
            flyweights.put(key, new FlyweightImpl());
        }
        return flyweights.get(key);
    }

    public static int getSize() {
        return flyweights.size();
    }
}
