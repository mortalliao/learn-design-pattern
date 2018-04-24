package win.mortalliao.java.creational_pattern.abstract_factory.factory;

import win.mortalliao.java.creational_pattern.abstract_factory.product.BlackCat;
import win.mortalliao.java.creational_pattern.abstract_factory.product.BlackDog;
import win.mortalliao.java.creational_pattern.abstract_factory.product.ICat;
import win.mortalliao.java.creational_pattern.abstract_factory.product.IDog;

/**
 * @author mortal
 */
public class BlackAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
}
