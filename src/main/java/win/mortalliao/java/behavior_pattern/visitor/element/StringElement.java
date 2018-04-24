package win.mortalliao.java.behavior_pattern.visitor.element;

import win.mortalliao.java.behavior_pattern.visitor.visitor.Visitor;

/**
 * @author mortal
 */
public class StringElement implements Visitable {

    private String se;

    public StringElement(String se) {
        this.se = se;
    }

    public String getSe() {
        return this.se;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}
