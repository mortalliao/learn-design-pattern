package win.mortalliao.java.creational_pattern.builder.director;

import win.mortalliao.java.creational_pattern.builder.builder.PersonBuilder;
import win.mortalliao.java.creational_pattern.builder.product.Person;

/**
 * @author mortal
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
