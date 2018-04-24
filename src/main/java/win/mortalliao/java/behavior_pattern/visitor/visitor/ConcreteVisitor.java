package win.mortalliao.java.behavior_pattern.visitor.visitor;

import win.mortalliao.java.behavior_pattern.visitor.element.FloatElement;
import win.mortalliao.java.behavior_pattern.visitor.element.StringElement;
import win.mortalliao.java.behavior_pattern.visitor.element.Visitable;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author mortal
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visitCollection(Collection collection) {
        // TODO Auto-generated method stub
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Visitable) {
                ((Visitable) o).accept(this);
            }
        }
    }

    @Override
    public void visitFloat(FloatElement floatE) {
        System.out.println(floatE.getFe());
    }

    @Override
    public void visitString(StringElement stringE) {
        System.out.println(stringE.getSe());
    }
}
