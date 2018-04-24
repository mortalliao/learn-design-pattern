package win.mortalliao.java.behavior_pattern.strategy.context;

import win.mortalliao.java.behavior_pattern.strategy.strategy.Strategy;

/**
 * @author mortal
 */
public class Context {

    Strategy stra;

    public Context(Strategy stra) {
        this.stra = stra;
    }

    public void doMethod() {
        stra.method();
    }
}
