package win.mortalliao.java.creational_pattern.builder.builder;

import win.mortalliao.java.creational_pattern.builder.product.Man;
import win.mortalliao.java.creational_pattern.builder.product.Person;

/**
 * @author mortal
 */
public class ManBuilder implements PersonBuilder {

    Person person;

    public ManBuilder() {
        person = new Man();
    }

    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }

    @Override
    public void buildHead() {
        person.setHead("建造男人的头");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
