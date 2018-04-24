package win.mortalliao.java.behavior_pattern.visitor;

import win.mortalliao.java.behavior_pattern.visitor.element.FloatElement;
import win.mortalliao.java.behavior_pattern.visitor.element.StringElement;
import win.mortalliao.java.behavior_pattern.visitor.element.Visitable;
import win.mortalliao.java.behavior_pattern.visitor.visitor.ConcreteVisitor;
import win.mortalliao.java.behavior_pattern.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        StringElement se = new StringElement("abc");
        se.accept(visitor);

        FloatElement fe = new FloatElement(1.5f);
        fe.accept(visitor);
        System.out.println("===========");
        List<Visitable> result = new ArrayList<>();
        result.add(new StringElement("abc"));
        result.add(new StringElement("abc"));
        result.add(new StringElement("abc"));
        result.add(new FloatElement(1.5f));
        result.add(new FloatElement(1.5f));
        result.add(new FloatElement(1.5f));
        visitor.visitCollection(result);
    }
}
