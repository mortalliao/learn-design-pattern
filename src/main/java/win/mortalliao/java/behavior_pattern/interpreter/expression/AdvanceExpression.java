package win.mortalliao.java.behavior_pattern.interpreter.expression;

import win.mortalliao.java.behavior_pattern.interpreter.context.Context;

/**
 * @author mortal
 */
public class AdvanceExpression extends AbstractExpression {

    @Override
    public void interpret(Context ctx) {
        System.out.println("这是高级解析器!");
    }
}
