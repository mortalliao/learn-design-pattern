package win.mortalliao.java.behavior_pattern.strategy;

import win.mortalliao.java.behavior_pattern.strategy.context.Context;
import win.mortalliao.java.behavior_pattern.strategy.strategy.StrategyImplA;
import win.mortalliao.java.behavior_pattern.strategy.strategy.StrategyImplB;
import win.mortalliao.java.behavior_pattern.strategy.strategy.StrategyImplC;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Context ctx = new Context(new StrategyImplA());
        ctx.doMethod();

        ctx = new Context(new StrategyImplB());
        ctx.doMethod();

        ctx = new Context(new StrategyImplC());
        ctx.doMethod();
    }
}
