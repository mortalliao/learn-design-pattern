package win.mortalliao.java.behavior_pattern.interpreter;

import win.mortalliao.java.behavior_pattern.interpreter.context.Context;
import win.mortalliao.java.behavior_pattern.interpreter.expression.AbstractExpression;
import win.mortalliao.java.behavior_pattern.interpreter.expression.AdvanceExpression;
import win.mortalliao.java.behavior_pattern.interpreter.expression.SimpleExpression;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.add(new SimpleExpression());
        ctx.add(new AdvanceExpression());
        ctx.add(new SimpleExpression());

        for (AbstractExpression eps : ctx.getList()) {
            eps.interpret(ctx);
        }
    }
}
