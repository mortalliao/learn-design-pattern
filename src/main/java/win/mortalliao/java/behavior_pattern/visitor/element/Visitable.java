package win.mortalliao.java.behavior_pattern.visitor.element;

import win.mortalliao.java.behavior_pattern.visitor.visitor.Visitor;

/**
 * @author mortal
 */
public interface Visitable {

    public void accept(Visitor visitor);
}
