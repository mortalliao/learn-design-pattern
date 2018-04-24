package win.mortalliao.java.behavior_pattern.interpreter.context;

import win.mortalliao.java.behavior_pattern.interpreter.expression.AbstractExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mortal
 */
public class Context {

    private String content;

    private List<AbstractExpression> list = new ArrayList<>();

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void add(AbstractExpression eps) {
        list.add(eps);
    }

    public List<AbstractExpression> getList() {
        return list;
    }
}
