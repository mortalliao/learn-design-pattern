package win.mortalliao.java.creational_pattern.abstract_factory.product;

/**
 * @author mortal
 */
public class BlackCat implements ICat {
    @Override
    public void eat() {
        System.out.println("The black cat is eating!");
    }
}
