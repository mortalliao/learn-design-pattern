package win.mortalliao.java.creational_pattern.abstract_factory.product;

/**
 * @author mortal
 */
public class WhiteDog implements IDog {
    @Override
    public void eat() {
        System.out.println("The white dog is eating!");
    }
}
