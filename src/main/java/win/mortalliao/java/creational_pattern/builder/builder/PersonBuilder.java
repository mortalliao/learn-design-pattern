package win.mortalliao.java.creational_pattern.builder.builder;

import win.mortalliao.java.creational_pattern.builder.product.Person;

/**
 * @author mortal
 */
public interface PersonBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
