package win.mortalliao.java.creational_pattern.builder;

import win.mortalliao.java.creational_pattern.builder.builder.ManBuilder;
import win.mortalliao.java.creational_pattern.builder.director.PersonDirector;
import win.mortalliao.java.creational_pattern.builder.product.Person;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());

        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}
