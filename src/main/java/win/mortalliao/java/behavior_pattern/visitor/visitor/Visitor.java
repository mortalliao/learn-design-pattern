package win.mortalliao.java.behavior_pattern.visitor.visitor;

import win.mortalliao.java.behavior_pattern.visitor.element.FloatElement;
import win.mortalliao.java.behavior_pattern.visitor.element.StringElement;

import java.util.Collection;

/**
 * @author mortal
 */
public interface Visitor {

    public void visitString(StringElement stringE);

    public void visitFloat(FloatElement floatE);

    public void visitCollection(Collection collection);
}
