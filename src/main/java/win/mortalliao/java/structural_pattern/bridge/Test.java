package win.mortalliao.java.structural_pattern.bridge;

import win.mortalliao.java.structural_pattern.bridge.refinedabstraction.Lady;
import win.mortalliao.java.structural_pattern.bridge.refinedabstraction.Man;
import win.mortalliao.java.structural_pattern.bridge.abstraction.Person;
import win.mortalliao.java.structural_pattern.bridge.implementor.Clothing;
import win.mortalliao.java.structural_pattern.bridge.concreteimplementor.Jacket;
import win.mortalliao.java.structural_pattern.bridge.concreteimplementor.Trouser;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {

        Person man = new Man();
        Person lady = new Lady();

        Clothing jacket = new Jacket();
        Clothing trouser = new Trouser();

        jacket.personDressCloth(man);
        trouser.personDressCloth(man);

        jacket.personDressCloth(lady);
        trouser.personDressCloth(lady);

        man.dress();
        lady.dress();
    }
}
