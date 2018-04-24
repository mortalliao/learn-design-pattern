package win.mortalliao.java.creational_pattern.abstract_factory.product;

/**
 * @author mortal
 */
public class WhiteCat implements ICat {
    @Override
    public void eat() {
        System.out.println("The white cat is eating!");
    }
}
