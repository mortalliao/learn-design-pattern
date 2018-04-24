package win.mortalliao.java.structural_pattern.bridge.concreteimplementor;

import win.mortalliao.java.structural_pattern.bridge.abstraction.Person;
import win.mortalliao.java.structural_pattern.bridge.implementor.Clothing;

/**
 * @author mortal
 */
public class Jacket extends Clothing {

    @Override
    public void personDressCloth(Person person) {
        person.setClothing(this);
        System.out.println(person.getType() + "穿马甲");
    }
}
