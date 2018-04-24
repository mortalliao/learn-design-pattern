package win.mortalliao.java.structural_pattern.bridge.refinedabstraction;

import win.mortalliao.java.structural_pattern.bridge.abstraction.Person;
import win.mortalliao.java.structural_pattern.bridge.implementor.Clothing;

/**
 * @author mortal
 */
public class Lady extends Person {

    public Lady() {
        setType("女人");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
