package win.mortalliao.java.behavior_pattern.visitor.element;

import win.mortalliao.java.behavior_pattern.visitor.visitor.Visitor;

/**
 * @author mortal
 */
public class FloatElement implements Visitable {

    private Float fe;

    public FloatElement(Float fe) {
        this.fe = fe;
    }

    public Float getFe() {
        return this.fe;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFloat(this);
    }
}
