package win.mortalliao.java.behavior_pattern.interpreter.expression;

import win.mortalliao.java.behavior_pattern.interpreter.context.Context;

/**
 * @author mortal
 */
public abstract class AbstractExpression {

    public abstract void interpret(Context ctx);
}
