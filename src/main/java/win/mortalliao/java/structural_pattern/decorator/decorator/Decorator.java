package win.mortalliao.java.structural_pattern.decorator.decorator;

import win.mortalliao.java.structural_pattern.decorator.component.Person;

/**
 * @author mortal
 */
public abstract class Decorator implements Person {

    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
